package com.sample3;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	
	@Id
	private int aid;
	private String aname;
	
	@ManyToOne
	private Question q;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public Question getQ() {
		return q;
	}

	public void setQ(Question q) {
		this.q = q;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int aid, String aname, Question q) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.q = q;
	}
	
	
}
