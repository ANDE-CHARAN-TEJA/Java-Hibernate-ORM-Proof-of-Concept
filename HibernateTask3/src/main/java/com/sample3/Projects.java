package com.sample3;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Projects {

		@Id
		private int pid;
		private String pname;
		
		@ManyToMany
		private List<Developer> developers;

		public int getPid() {
			return pid;
		}

		public void setPid(int pid) {
			this.pid = pid;
		}

		public String getPname() {
			return pname;
		}

		public void setPname(String pname) {
			this.pname = pname;
		}

		public List<Developer> getDevelopers() {
			return developers;
		}

		public void setDevelopers(List<Developer> developers) {
			this.developers = developers;
		}

		public Projects() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Projects(int pid, String pname, List<Developer> developers) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.developers = developers;
		}
		
		
}
