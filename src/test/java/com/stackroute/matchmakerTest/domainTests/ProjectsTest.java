package com.stackroute.matchmakerTest.domainTests;

import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.stackroute.matchmaker.model.Projects;

public class ProjectsTest {

	private Projects projects;

	@Before
	public void setup() throws Exception {
		
		 projects= new Projects();
		projects.setProjects_userId("1");
		projects.setProjects("dotnet project");
	}

	@Test
	public void test() {
		new BeanTester().testBean(Projects.class);
	}
}
