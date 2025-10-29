package com.roshan.course.repo;

import com.roshan.course.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface CourseRepo extends JpaRepository<Course, Long> {
    Course findByName(String name);
}
