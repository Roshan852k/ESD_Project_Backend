package com.roshan.course.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long course_id;

    @Column(name = "course_code", nullable = false, unique = true)
    private String course_code;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "specialization", nullable = false)
    private String specialization;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "credit", nullable = false)
    private Integer credit;

    @Column(name = "capacity", nullable = false)
    private Integer capacity;

    @Column(name = "year", nullable = false)
    private Integer year;

    @Column(name = "term", nullable = false)
    private String term;

//    @Column(name = "faculty", nullable = false)
//    private String faculty;

//    @Column(name = "pre_requisites", nullable = false)
//    private String pre_requisites;

//    @Column(name = "day", nullable = false)
//    private String day;
//
//    @Column(name = "location", nullable = false)
//    private String location;
//
//    @Column(name = "time", nullable = false)
//    private String time;

    public Long getCourseId() {
        return course_id;
    }
}
