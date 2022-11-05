package com.builder.resume.repository;

import com.builder.resume.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepo extends JpaRepository<Education, Integer> {
}
