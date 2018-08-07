package com.stackroute.matchmaker.model;

public class AcademicQualification {

	private String academicQual_userId;
	private String academicQualification;
	
	public AcademicQualification() {
	}

	public AcademicQualification(String academicQual_userId, String academicQualification) {
		super();
		this.academicQual_userId = academicQual_userId;
		this.academicQualification = academicQualification;
	}

	public String getAcademicQual_userId() {
		return academicQual_userId;
	}

	public void setAcademicQual_userId(String academicQual_userId) {
		this.academicQual_userId = academicQual_userId;
	}

	public String getAcademicQualification() {
		return academicQualification;
	}

	public void setAcademicQualification(String academicQualification) {
		this.academicQualification = academicQualification;
	}

	@Override
	public String toString() {
		return "AcademicQualification [academicQual_userId=" + academicQual_userId + ", academicQualification="
				+ academicQualification + "]";
	}
	
}
