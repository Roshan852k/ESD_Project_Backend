package com.roshan.course.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.grammars.hql.HqlParser;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long schedule_id;

    @Column(name = "course_id", nullable = false)
    private Long course_id;

    @Column(name = "day", nullable = false)
    private String day;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "time", nullable = false)
    private String time;
}

