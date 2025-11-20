package com.sample3;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Developer {
	@Id
	private int did;
	private String dname;
	
	@ManyToMany
	private List<Projects> Projects;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<Projects> getProjects() {
		return Projects;
	}

	public void setProjects(List<Projects> projects) {
		Projects = projects;
	}

	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Developer(int did, String dname, List<com.sample3.Projects> projects) {
		super();
		this.did = did;
		this.dname = dname;
		Projects = projects;
	}
	
	
}
