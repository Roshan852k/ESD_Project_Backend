package com.roshan.course.mapper;

import com.roshan.course.dto.CourseRequest;
import com.roshan.course.entity.Course;
import org.springframework.stereotype.Service;

@Service
public class CourseMapper {

    public Course toCourseEntity(CourseRequest request) {
        return Course.builder()
                .course_code(request.course_code())
                .name(request.name())
                .description(request.description())
                .specialization(request.specialization())
                .credit(request.credit())
                .capacity(request.capacity())
                .year(request.year())
                .term(request.term())
                .build();
    }
}


//public class CourseMapper {
//
//    public Course toCourseEntity(CourseRequest request) {
//        return Course.builder()
//                .course_code(request.course_code())
//                .name(request.name())
//                .description(request.description())
//                .specialization(request.specialization())
//                .credit(request.credit())
//                .capacity(request.capacity())
//                .faculty(request.faculty())
//                .pre_requisites(request.pre_requisites())
//                .day(request.day())
//                .time(request.time())
//                .location(request.location())
//                .build();
//    }
//}