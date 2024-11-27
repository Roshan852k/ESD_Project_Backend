package com.roshan.course.controller;

import com.roshan.course.dto.CourseRequest;
import com.roshan.course.dto.EmployeeRequest;
import com.roshan.course.service.CourseService;
import com.roshan.course.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class CourseController {
    private final CourseService courseService;
    private final EmployeeService employeeService;

//    @PostMapping("/add/course")
//    public ResponseEntity<String> addCourse(@RequestBody CourseRequest request) {
//        return ResponseEntity.ok(courseService.addCourse(request));
//    }

    @PostMapping("/add/course")
    public ResponseEntity<String> addCourse(@RequestBody CourseRequest request) {
        String response = courseService.addCourse(request);
        if (response.contains("already exists")) {
            // Return a 400 Bad Request if the course already exists
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
        return ResponseEntity.ok(response);
    }


    @PostMapping("/add/employee")
    public ResponseEntity<String> createCustomer(@RequestBody @Valid EmployeeRequest request) {
        return ResponseEntity.ok(employeeService.addEmployee(request));
    }

    @GetMapping("/coursename")
    public ResponseEntity<List<String>> getAllCourseNames() {
        List<String> courseNames = courseService.getAllCourseNames();
        return ResponseEntity.ok(courseNames);
    }

    @GetMapping("/specialization")
    public ResponseEntity<List<String>> getAllSpecializations() {
        List<String> specializations = courseService.getAllSpecializations();
        return ResponseEntity.ok(specializations);
    }
}
