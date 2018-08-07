package com.stackroute.matchmaker.model;

public class Projects {
  
	private String projects_userId;
	private String projects;
	
	public Projects() {
	}

	public Projects(String projects_userId, String projects) {
		super();
		this.projects_userId = projects_userId;
		this.projects = projects;
	}

	public String getProjects_userId() {
		return projects_userId;
	}

	public void setProjects_userId(String projects_userId) {
		this.projects_userId = projects_userId;
	}

	public String getProjects() {
		return projects;
	}

	public void setProjects(String projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Projects [projects_userId=" + projects_userId + ", projects=" + projects + "]";
	}
	
}
