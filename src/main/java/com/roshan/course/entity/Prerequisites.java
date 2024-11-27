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
@Table(name = "pre_requisites")
public class Prerequisites {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_id", nullable = false)
    private Long course_id;

    @Column(name = "pre_requisites", nullable = false)
    private String pre_requisites;

    @Column(name = "description", nullable = false)
    private String description;
}
