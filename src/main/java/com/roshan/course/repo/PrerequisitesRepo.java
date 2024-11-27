package com.roshan.course.repo;

import com.roshan.course.entity.Prerequisites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface PrerequisitesRepo extends JpaRepository<Prerequisites, Long> {

}
