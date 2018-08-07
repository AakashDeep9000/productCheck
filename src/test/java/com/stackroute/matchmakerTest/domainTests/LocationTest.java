package com.stackroute.matchmakerTest.domainTests;

import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.stackroute.matchmaker.model.Location;

public class LocationTest {
	
	private Location location;

	@Before
	public void setup() throws Exception {
		
		location= new Location();
		location.setLocation_userId("1");
		location.setLocation("Bengaluru");
	}

	@Test
	public void test() {
		new BeanTester().testBean(Location.class);
	}

}
