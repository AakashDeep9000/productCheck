package com.stackroute.matchmakerTest.domainTests;

import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.stackroute.matchmaker.model.AcademicQualification;

public class AcademicQualificationTest {

private AcademicQualification academies;
	
	@Before
	public void setup() throws Exception {
		
		academies = new AcademicQualification();
		academies.setAcademicQual_userId("1");
		academies.setAcademicQualification("12th pass");
	}

	@Test
	public void test() {
		new BeanTester().testBean(AcademicQualification.class);
	}

}
