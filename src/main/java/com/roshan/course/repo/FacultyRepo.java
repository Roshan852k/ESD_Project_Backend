package com.roshan.course.repo;

import com.roshan.course.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface FacultyRepo extends JpaRepository<Faculty, Long> {

}
