package com.roshan.course.mapper;

import com.roshan.course.dto.CourseRequest;
import com.roshan.course.entity.Prerequisites;
import org.springframework.stereotype.Service;

@Service
public class PrerequisitesMapper {

    public Prerequisites toCoursePrerequisitesEntity(CourseRequest request, Long courseId) {
        return Prerequisites.builder()
                .course_id(courseId)
                .pre_requisites(request.pre_requisites())
                .description(request.pre_requisites() + " is a prerequisite for " + request.course_code())
                .build();
    }
}
