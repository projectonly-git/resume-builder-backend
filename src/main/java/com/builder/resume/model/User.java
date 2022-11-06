package com.builder.resume.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name="users")
public class User {
	
    @Id
    private String emailid;
    private String password;
    private String username;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy="user")
    
    private List<Resume> resumelist;

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Resume> getResumelist() {
        return resumelist;
    }

    public void setResumelist(List<Resume> resumelist) {
        this.resumelist = resumelist;
    }

	@Override
	public String toString() {
		return "User [emailid=" + emailid + ", password=" + password + ", username=" + username + ", resumelist="
				+ resumelist + "]";
	}

    
}
