package com.stackroute.matchmaker.model;

public class PersonalInfo {

	private String userId;
	private String name;
	private String age;
	private String contactNo;
	private String email;

	
	// private String certificates;

	public PersonalInfo() {

	}

	public PersonalInfo(String userId, String name, String age, String contactNo, String email) {
		super();
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.contactNo = contactNo;
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersonalInfo [userId=" + userId + ", name=" + name + ", age=" + age + ", contactNo=" + contactNo
				+ ", email=" + email + "]";
	}

}
