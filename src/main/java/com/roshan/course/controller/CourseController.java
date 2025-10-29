package com.roshan.course.controller;

import com.roshan.course.dto.CourseRequest;
import com.roshan.course.dto.EmployeeRequest;
import com.roshan.course.service.CourseService;
import com.roshan.course.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class CourseController {
    private final CourseService courseService;
    private final EmployeeService employeeService;

    @PostMapping("/add/course")
    public ResponseEntity<String> addCourse(@RequestBody CourseRequest request) {
        return ResponseEntity.ok(courseService.addCourse(request));
    }

    @PostMapping("/add/employee")
    public ResponseEntity<String> createCustomer(@RequestBody @Valid EmployeeRequest request) {
        return ResponseEntity.ok(employeeService.addEmployee(request));
    }
}
