package com.stackroute.matchmakerTest.domainTests;

import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.stackroute.matchmaker.model.Experience;

public class ExperienceTest {

	private Experience experience;

	@Before
	public void setup() throws Exception {
		
		experience= new Experience();
		experience.setExperience_userId("1");
		experience.setExperience("2 years");
	}

	@Test
	public void test() {
		new BeanTester().testBean(Experience.class);
	}

}
