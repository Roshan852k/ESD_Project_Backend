package com.roshan.course.controller;

import com.roshan.course.dto.EmployeeLoginRequest;
import com.roshan.course.service.CourseService;
import com.roshan.course.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthenticationController {
    private final EmployeeService employeeService;

//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody @Valid EmployeeLoginRequest request) {
//        return ResponseEntity.ok(employeeService.login(request));
//    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody @Valid EmployeeLoginRequest request) {
        // Call the service to process login
        String response = employeeService.login(request);
        System.out.println(response);

        // Check if the response is an error message or a token
        if ("Invalid username or password".equals(response)) {
            // Return a 401 Unauthorized status with the error message
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(response);
        }

        // On success, return the token in the Authorization header
        return ResponseEntity.ok()
                .header("Authorization", "Bearer " + response)
                .body("Login successful");

    }
}
