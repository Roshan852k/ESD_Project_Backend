package com.roshan.course.repo;

import com.roshan.course.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseRepo extends JpaRepository<Course, Long> {
    //Course findByName(String name);

    @Query("SELECT DISTINCT c.name FROM Course c")
    List<String> findAllCourseNames();

    @Query("SELECT COUNT(c) > 0 FROM Course c WHERE c.course_code = :courseCode")
    boolean existsByCourseCode(@Param("courseCode") String courseCode);
}
