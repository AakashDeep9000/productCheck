package com.stackroute.matchmaker.model;

public class Certificates {
     
	private String certificates_userId;
	private String certificates;
	
	public Certificates() {
	}

	public String getCertificates_userId() {
		return certificates_userId;
	}

	public void setCertificates_userId(String certificates_userId) {
		this.certificates_userId = certificates_userId;
	}

	public String getCertificates() {
		return certificates;
	}

	public void setCertificates(String certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Certificates [certificates_userId=" + certificates_userId + ", certificates=" + certificates + "]";
	}
}
