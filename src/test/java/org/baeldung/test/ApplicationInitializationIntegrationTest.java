package org.baeldung.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationInitializationIntegrationTest {
	
	// empty test case to validate application works as desired on startup
	@Test
	public void initContextTest() {
		assertEquals(true, true);
	}

}
