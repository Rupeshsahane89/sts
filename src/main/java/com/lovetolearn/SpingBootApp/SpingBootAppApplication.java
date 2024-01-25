package com.lovetolearn.SpingBootApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpingBootAppApplication implements CommandLineRunner{
	
	public static final Logger logger = LoggerFactory.getLogger(SpingBootAppApplication.class);

			
	public static void main(String[] args) {
		logger.info("Continues integration job");
		SpringApplication.run(SpingBootAppApplication.class, args);
	}
	
	@Override
	public void run(String... arg)throws Exception
	{
		logger.info("Secound logger");	
	}
}
