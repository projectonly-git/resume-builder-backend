package com.builder.resume.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity(name="experience")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer xpid;
    private String position;
    private String company;
    private String starttime;
    private String endtime;
    private String workd; // description
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Resume resume;

    public Integer getXpid() {
        return xpid;
    }

    public void setXpid(Integer xpid) {
        this.xpid = xpid;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getWorkd() {
        return workd;
    }

    public void setWorkd(String workd) {
        this.workd = workd;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "position='" + position + '\'' +
                ", company='" + company + '\'' +
                ", starttime='" + starttime + '\'' +
                ", endtime='" + endtime + '\'' +
                ", workd='" + workd + '\'' +
                '}';
    }
}
