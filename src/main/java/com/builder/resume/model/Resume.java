package com.builder.resume.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity(name="resume")
public class Resume {
    @Id
    private Integer resumeid;
    private String date;
    private String templateid;
    private String username;
    private String designation;
    private String state;
    private String city;
    private Integer pincode;
    private String emailId;
    private String phonenumber;
    private String linkedin;
    private String github;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private User user;
    private String skills;
    @OneToMany(fetch = FetchType.LAZY, mappedBy="resume")
    private List<Education> educations;
    @OneToMany(fetch = FetchType.LAZY, mappedBy="resume")
    private List<Experience> experiences;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getResumeid() {
        return resumeid;
    }

    public void setResumeid(Integer resumeid) {
        this.resumeid = resumeid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTemplateid() {
        return templateid;
    }

    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
    }

    public Resume() {
    }

    public Resume(Integer resumeid, String date, String templateid, String username, String designation, String state, String city, Integer pincode, String emailId, String phonenumber, String linkedin, String github, User user, String skills, List<Education> educations, List<Experience> experiences) {
        this.resumeid = resumeid;
        this.date = date;
        this.templateid = templateid;
        this.username = username;
        this.designation = designation;
        this.state = state;
        this.city = city;
        this.pincode = pincode;
        this.emailId = emailId;
        this.phonenumber = phonenumber;
        this.linkedin = linkedin;
        this.github = github;
        this.user = user;
        this.skills = skills;
        this.educations = educations;
        this.experiences = experiences;
    }
}
