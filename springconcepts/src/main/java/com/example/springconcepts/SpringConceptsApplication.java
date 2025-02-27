package com.example.springconcepts;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringConceptsApplication {


	private static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

	public static void main(String[] args) {
		logger.info("=========== APPLICATION STARTING ===========");
		logger.debug("This is a DEBUG log.");
		logger.trace("This is a TRACE log.");
		SpringApplication.run(SpringConceptsApplication.class, args);
		logger.info("=========== APPLICATION STARTED SUCCESSFULLY ===========");
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringConceptsApplication.class, args);
	}



}
