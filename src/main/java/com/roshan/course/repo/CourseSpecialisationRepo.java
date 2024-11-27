package com.roshan.course.repo;

import com.roshan.course.entity.CourseSpecialisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface CourseSpecialisationRepo extends JpaRepository<CourseSpecialisation, Long> {

}
