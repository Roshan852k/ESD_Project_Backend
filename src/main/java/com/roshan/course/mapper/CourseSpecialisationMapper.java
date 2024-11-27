package com.roshan.course.mapper;

import com.roshan.course.dto.CourseRequest;
import com.roshan.course.entity.Course;
import com.roshan.course.entity.CourseSpecialisation;
import org.springframework.stereotype.Service;

@Service
public class CourseSpecialisationMapper {

    public CourseSpecialisation toCourseSpecialisationEntity(CourseRequest request, Long courseId, Long specialisation_id) {
        return CourseSpecialisation.builder()
                .course_id(courseId)
                .specialisation_id(specialisation_id)
                .build();
    }
}
