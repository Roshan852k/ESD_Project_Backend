package com.roshan.course.service;

import com.roshan.course.dto.EmployeeLoginRequest;
import com.roshan.course.dto.EmployeeRequest;
import com.roshan.course.entity.Employee;
import com.roshan.course.exception.EmployeeNotFoundException;
import com.roshan.course.helper.EncryptionService;
import com.roshan.course.helper.JWTHelper;
import com.roshan.course.mapper.EmployeeMapper;
import com.roshan.course.repo.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepo employeeRepo;
    private final EmployeeMapper employeeMapper;

    // Add Employee
    public String addEmployee(EmployeeRequest request) {
        Employee emp = employeeMapper.toEntity(request);
        emp.setPassword(encryptionService.encode(emp.getPassword()));
        employeeRepo.save(emp);
        return "Employee Created Successfully";
    }

    private final EncryptionService encryptionService;
    private final JWTHelper jwtHelper;

    // Get Employee
    public Employee getEmployee(String email) {
        return employeeRepo.findByEmail(email)
                .orElseThrow(() -> new EmployeeNotFoundException(
                        format("Cannot found Employee:: No employee found with the provided ID:: %s", email)
                ));
    }

    // Login Admin
    public String login(EmployeeLoginRequest request) {
        Employee emp = getEmployee(request.email());
        if(!encryptionService.validates(request.password(), emp.getPassword())) {
            return "Invalid username or password";
        }

        return jwtHelper.generateToken(request.email());
    }
}
