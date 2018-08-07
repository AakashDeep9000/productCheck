package com.stackroute.matchmaker.model;

public class Experience {
	private String experience_userId;
	private String experience;
	
	public Experience() {
	}

	public Experience(String experience_userId, String experience) {
		super();
		this.experience_userId = experience_userId;
		this.experience = experience;
	}

	public String getExperience_userId() {
		return experience_userId;
	}

	public void setExperience_userId(String experience_userId) {
		this.experience_userId = experience_userId;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Experience [experience_userId=" + experience_userId + ", experience=" + experience + "]";
	}
	
	
}
