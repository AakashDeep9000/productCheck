package com.stackroute.matchmakerTest.domainTests;

import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.stackroute.matchmaker.model.Certificates;

public class CertificatesTest {

	private Certificates certificates;

	@Before
	public void setup() throws Exception {
		
		certificates= new Certificates();
		certificates.setCertificates_userId("1");
		certificates.setCertificates("certified Java programmer");
	}

	@Test
	public void test() {
		new BeanTester().testBean(Certificates.class);
	}

}
