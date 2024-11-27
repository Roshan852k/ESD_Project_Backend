package com.roshan.course.repo;

import com.roshan.course.entity.Schedule;
import com.roshan.course.entity.Specialisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpecialisationRepo extends JpaRepository<Specialisation, Long> {
    @Query("SELECT cs.specialisation_id FROM Specialisation cs WHERE cs.name = :name")
    Long findIdByName(String name);

    @Query("SELECT DISTINCT cs.name FROM Specialisation cs")
    List<String> findAllSpecializations();
}
