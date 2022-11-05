package com.builder.resume.repository;

import com.builder.resume.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepo extends JpaRepository<Experience, Integer> {
}
