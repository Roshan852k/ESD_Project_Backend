package com.roshan.course.mapper;

import com.roshan.course.dto.CourseRequest;
import com.roshan.course.entity.Schedule;
import org.springframework.stereotype.Service;

@Service
public class ScheduleMapper {
    public Schedule toCourseScheduleEntity(CourseRequest request,Long courseId) {
        return Schedule.builder()
                .course_id(courseId)
                .day(request.day())
                .time(request.time())
                .location(request.location())
                .build();
    }
}
