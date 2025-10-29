package com.roshan.course.mapper;

import com.roshan.course.dto.EmployeeRequest;
import com.roshan.course.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeMapper {
    public Employee toEntity(EmployeeRequest request) {
        return Employee.builder()
                .email(request.email())
                .password(request.password())
                .build();
    }
}
