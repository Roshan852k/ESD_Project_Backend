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
@Table(name = "course_specialisation")
public class CourseSpecialisation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "course_id", nullable = false)
    private Long course_id;

    @Column(name = "specialisation_id", nullable = false)
    private Long specialisation_id;
}
