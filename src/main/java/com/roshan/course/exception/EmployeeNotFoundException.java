package com.roshan.course.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class EmployeeNotFoundException extends RuntimeException {
    //private final String msg;
    public EmployeeNotFoundException(String message) {
        super(message);  // Pass the message to the parent RuntimeException
    }
}


