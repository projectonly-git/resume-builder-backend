package com.builder.resume.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity(name="education")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer eduid;
    private String course;
    private String institution;
    private String startyear;
    private String endyear;
    private String marks;
    
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JoinColumn(name = "resume_id")
    private Resume resume;

    public Resume getResume() {
		return resume;
	}

	public void setResume(Resume resume) {
		this.resume = resume;
	}

	public Integer getEduid() {
        return eduid;
    }

    public void setEduid(Integer eduid) {
        this.eduid = eduid;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getStartyear() {
        return startyear;
    }

    public void setStartyear(String startyear) {
        this.startyear = startyear;
    }

    public String getEndyear() {
        return endyear;
    }

    public void setEndyear(String endyear) {
        this.endyear = endyear;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Education{" +
                "course='" + course + '\'' +
                ", institution='" + institution + '\'' +
                ", startyear='" + startyear + '\'' +
                ", endyear='" + endyear + '\'' +
                ", marks='" + marks + '\'' +
                '}';
    }
}
