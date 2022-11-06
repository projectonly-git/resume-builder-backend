package com.builder.resume.repository;

import com.builder.resume.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, String> {



	User findByemailid(String email);
}
