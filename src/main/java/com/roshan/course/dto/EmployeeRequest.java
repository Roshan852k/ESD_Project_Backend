package com.roshan.course.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record EmployeeRequest (

    @NotNull(message = "Employee first name should s required")
    @NotEmpty(message = "Employee first name should be present")
    @NotBlank(message = "Employee first name should be present")
    @JsonProperty("first_name")
    String firstName,

    @NotNull(message = "Employee last name should s required")
    @NotEmpty(message = "Employee last name should be present")
    @NotBlank(message = "Employee last name should be present")
    @JsonProperty("last_name")
    String lastName,

    @NotNull(message="Employee email is required")
    @Email(message = "Email must be in correct format")
    @NotBlank(message = "Email should be present")
    @JsonProperty("email")
    String email,

    @NotNull(message = "Password should be present")
    @NotEmpty(message = "Password should be present")
    @NotBlank(message = "Password should be present")
    @JsonProperty("password")
    String password,

    @NotNull(message = "Employee last name should s required")
    @NotEmpty(message = "Employee last name should be present")
    @NotBlank(message = "Employee last name should be present")
    @JsonProperty("title")
    String title,

    @NotNull(message = "Employee department  should s required")
    @NotEmpty(message = "Employee department  should be present")
    @NotBlank(message = "Employee department  should be present")
    @JsonProperty("department")
    String department

) {
}
