package com.roshan.course.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record EmployeeLoginRequest(
    @NotNull(message="Employee email is required")
    @Email(message = "Email must be in correct format")
    @JsonProperty("email")
    String email,

    @NotNull(message = "Password should be present")
    @NotEmpty(message = "Password should be present")
    @NotBlank(message = "Password should be present")
    @JsonProperty("password")
    String password
) {
}
