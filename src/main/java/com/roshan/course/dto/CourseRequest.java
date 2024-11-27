package com.roshan.course.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record CourseRequest(
        @NotNull(message="Course code is required")
        @NotEmpty(message="Course code is required")
        @NotBlank(message = "Course code is required")
        @JsonProperty("course_code")
        String course_code,

        @NotNull(message="Course name is required")
        @NotEmpty(message="Course name is required")
        @NotBlank(message = "Course name is required")
        @JsonProperty("name")
        String name,

        @NotNull(message="specialization is required")
        @NotEmpty(message="specialization is required")
        @NotBlank(message = "specialization is required")
        @JsonProperty("specialization")
        String specialization,

        @NotNull(message="Course description is required")
        @NotEmpty(message="Course description is required")
        @NotBlank(message = "Course description is required")
        @JsonProperty("description")
        String description,

        @NotNull(message="Course credit is required")
        @NotEmpty(message="Course credit is required")
        @NotBlank(message = "Course credit is required")
        @JsonProperty("credit")
        Integer credit,

        @NotNull(message="Course capacity is required")
        @NotEmpty(message="Course capacity is required")
        @NotBlank(message = "Course capacity is required")
        @JsonProperty("capacity")
        Integer capacity,

        @NotNull(message="Course faculty is required")
        @NotEmpty(message="Course faculty is required")
        @NotBlank(message = "Course faculty is required")
        @JsonProperty("faculty")
        String faculty,

        @NotNull(message="Course faculty is required")
        @NotEmpty(message="Course faculty is required")
        @NotBlank(message = "Course faculty is required")
        @JsonProperty("pre_requisites")
        String pre_requisites,

        @NotNull(message="location is required")
        @NotEmpty(message="location is required")
        @NotBlank(message = "location  is required")
        @JsonProperty("location")
        String location,

        @NotNull(message="day is required")
        @NotEmpty(message= "day is required")
        @NotBlank(message = "day is required")
        @JsonProperty("day")
        String day,

        @NotNull(message="time is required")
        @NotEmpty(message="time is required")
        @NotBlank(message ="time is required")
        @JsonProperty("time")
        String time,

        @NotNull(message="year is required")
        @NotEmpty(message="year is required")
        @NotBlank(message ="year is required")
        @JsonProperty("year")
        Integer year,

        @NotNull(message="Course term is required")
        @NotEmpty(message="Course term is required")
        @NotBlank(message ="Course term is required")
        @JsonProperty("term")
        String term

) {
}
