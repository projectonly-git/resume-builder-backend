package com.builder.resume.controller;

import com.builder.resume.model.Education;
import com.builder.resume.model.Experience;
import com.builder.resume.model.Resume;
import com.builder.resume.model.User;
import com.builder.resume.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;

@RestController
public class UserController {
    @Autowired
    UserService user_service;

    /* resume start */
    @RequestMapping(value = "/createresume", method = RequestMethod.GET)
    public int createResume(@RequestParam String emailid, @RequestParam String templateid) {
        int rid = (int)Math.round(Math.random()*10000);
        //User user = user_service.getUserById(emailid);
        Resume resume = new Resume();
        resume.setResumeid(rid);
        resume.setEmailId(emailid);
        //resume.setUser(user);
        resume.setTemplateid(templateid);
        user_service.addResume(resume);
        //Resume newResume = new Resume(rid, "","","","","","",0, emailid, "", "","",user, "",null,null);
        return rid;
    }

    @RequestMapping(value = "/savepersonaldetails", method = RequestMethod.POST)
    public int savePersonalDetails(@RequestBody Resume resume) {
        user_service.addResume(resume);
        return 200;
    }

    @RequestMapping(value = "/getresumedetails/{resumeid}", method = RequestMethod.POST)
    public Resume saveResumeDetails(@PathVariable Integer resumeid) {
        return user_service.findResumeById(resumeid);
    }
    /* resume end */

    /* eduacation start */
    @RequestMapping(value = "/saveeducationdetails/{resumeid}", method = RequestMethod.POST)
    public int saveEducationDetails(@PathVariable Integer resumeid, @RequestBody Education education) {
        return user_service.addEducation(resumeid, education);
    }

    @RequestMapping(value = "/deleteeducationdetails/{eid}", method = RequestMethod.GET)
    public int deleteEducationDetails(@PathVariable Integer eid) {
        return user_service.removeEducation(eid);
    }
    /* eduacation end */

    /* experience start */
    @RequestMapping(value = "/saveexperiencedetails/{resumeid}", method = RequestMethod.POST)
    public int saveEperienceDetails(@PathVariable Integer resumeid, @RequestBody Experience experience) {
        return user_service.addExperience(resumeid, experience);
    }

    @RequestMapping(value = "/deleteexperiencedetails/{xpid}", method = RequestMethod.GET)
    public int deleteExperienceDetails(@PathVariable Integer xpid) {
        return user_service.removeExperience(xpid);
    }
    /* experience end */

    /* skill start */
    @RequestMapping(value = "/saveskill/{resumeid}", method = RequestMethod.POST)
    public int saveSkillDetails(@PathVariable Integer resumeid, @RequestParam String skill) {
        return user_service.addSkill(resumeid, skill);
    }

    @RequestMapping(value = "/deleteskill/{resumeid}", method = RequestMethod.POST)
    public int deleteSkillDetails(@PathVariable Integer resumeid, @RequestParam String skill) {
        return user_service.removeSkill(resumeid, skill);
    }

    /* skill end */


}
