package com.roshan.course.service;

import static java.lang.String.format;

import com.roshan.course.dto.CourseRequest;
import com.roshan.course.entity.*;
import com.roshan.course.mapper.*;
import com.roshan.course.repo.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepo courseRepo;
    private final CourseMapper courseMapper;

    private final ScheduleMapper schedulemapper;
    private final ScheduleRepo schedulerepo;

    private final CourseSpecialisationMapper coursespecialisationmapper;
    private final CourseSpecialisationRepo coursespecialisationrepo;

    // private final SpecialisationMapper specialisationmapper;
    private final SpecialisationRepo specialisationrepo;


    private final PrerequisitesMapper prerequisitesmapper;
    private final PrerequisitesRepo prerequisitesrepo;

    private final FacultyMapper facultymapper;
    private final FacultyRepo facultyrepo;

    // Add Course
    public String addCourse(CourseRequest request) {
        Course course = courseMapper.toCourseEntity(request);
        courseRepo.save(course);

        Long courseId = course.getCourseId();

        Schedule schedule = schedulemapper.toCourseScheduleEntity(request, courseId);
        schedulerepo.save(schedule);

        // Get specilization_id
        Long specialisation_id = specialisationrepo.findIdByName(request.specialization());

        CourseSpecialisation cs = coursespecialisationmapper.toCourseSpecialisationEntity(request, courseId, specialisation_id);
        coursespecialisationrepo.save(cs);

        Prerequisites pr = prerequisitesmapper.toCoursePrerequisitesEntity(request, courseId);
        prerequisitesrepo.save(pr);

        Faculty fc = facultymapper.toCoursePrerequisitesEntity(request, courseId);
        facultyrepo.save(fc);

        return "Course Added Successfully";
    }
}
