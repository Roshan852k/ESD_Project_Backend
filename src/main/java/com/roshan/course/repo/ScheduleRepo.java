package com.roshan.course.repo;

import com.roshan.course.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ScheduleRepo extends JpaRepository<Schedule, Long> {

}
