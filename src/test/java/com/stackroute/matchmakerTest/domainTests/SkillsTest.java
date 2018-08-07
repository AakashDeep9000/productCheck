package com.stackroute.matchmakerTest.domainTests;

import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.stackroute.matchmaker.model.Skills;

public class SkillsTest {

	private Skills skills;

	@Before
	public void setup() throws Exception {
		
		 skills= new Skills();
		skills.setSkills_userId("1");
		skills.setSkills("Angular");
	}

	@Test
	public void test() {
		new BeanTester().testBean(Skills.class);
	}

}
