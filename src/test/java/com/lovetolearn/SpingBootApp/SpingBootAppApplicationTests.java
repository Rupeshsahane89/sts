package com.lovetolearn.SpingBootApp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpingBootAppApplicationTests {

	public static final Logger logger = LoggerFactory.getLogger(SpingBootAppApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("It is a test class");
		assertEquals(true, true);
	}

}
