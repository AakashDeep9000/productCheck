package com.stackroute.matchmakerTest.domainTests;

import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.stackroute.matchmaker.model.PersonalInfo;

public class PersonalInfoTest {

private PersonalInfo personalInfo;
	
	@Before
	public void setup() throws Exception {
		
		personalInfo = new PersonalInfo();
		personalInfo.setUserId("1");
		personalInfo.setName("Max");
		personalInfo.setAge("20");
		personalInfo.setContactNo("9868944431");
		personalInfo.setEmail("max.payne78@gmail.com");
	}

	@Test
	public void test() {
		new BeanTester().testBean(PersonalInfo.class);
	}

}
