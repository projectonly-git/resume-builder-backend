package com.builder.resume.repository;

import com.builder.resume.model.Education;
import com.builder.resume.model.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeRepo extends JpaRepository<Resume, Integer> {

	Resume findByresumeid(Integer resumeid);
}
