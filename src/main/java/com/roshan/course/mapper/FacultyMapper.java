package com.roshan.course.mapper;

import com.roshan.course.dto.CourseRequest;
import com.roshan.course.entity.Faculty;
import org.springframework.stereotype.Service;

@Service
public class FacultyMapper {

    public Faculty toCoursePrerequisitesEntity(CourseRequest request, Long courseId) {
        return Faculty.builder()
                .course_id(courseId)
                .faculty(request.faculty())
                .build();
    }
}
