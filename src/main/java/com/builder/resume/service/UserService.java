package com.builder.resume.service;

import com.builder.resume.model.Education;
import com.builder.resume.model.Experience;
import com.builder.resume.model.Resume;
import com.builder.resume.model.User;
import com.builder.resume.repository.ResumeRepo;
import com.builder.resume.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepo repo;

    @Autowired
    ResumeRepo resume_repo;

    //User ops
    public boolean addUser(User newUser) {
        // TODO Auto-generated method stub
        if(repo.findById(newUser.getEmailid()).equals(Optional.empty())) {
            repo.save(newUser);
            return true;
        }
        return false;
    }

    public User getUserById(String email) {
        // TODO Auto-generated method stub
        try {
            Optional<User> opuser = repo.findById(email);
            if(!opuser.isEmpty())
                return opuser.get();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
        return null;
    }

    //Resume ops
    public void addResume(Resume resume){
        resume_repo.save(resume);
    }
    public Resume findResumeById(Integer rid){
        try {
            Optional<Resume> opres = resume_repo.findById(rid);
            if(!opres.isEmpty())
                return opres.get();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
        return null;
    }


    public int addEducation(Integer rid, Education education) {
        try {
            Optional<Resume> opres = resume_repo.findById(rid);
            if(!opres.isEmpty())
                return 403;
            else{
                Resume updated_resume = opres.get();
                updated_resume.getEducations().add(education);
                resume_repo.save(updated_resume);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return 403;
        }
        return 200;
    }

    public int addExperience(Integer rid, Experience experience) {
        try {
            Optional<Resume> opres = resume_repo.findById(rid);
            if(!opres.isEmpty())
                return 403;
            else{
                Resume updated_resume = opres.get();
                updated_resume.getExperiences().add(experience);
                resume_repo.save(updated_resume);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return 403;
        }
        return 200;
    }
}
