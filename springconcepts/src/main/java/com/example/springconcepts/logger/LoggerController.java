package com.example.springconcepts.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LoggerController {

    private static final Logger logger = LoggerFactory.getLogger(LoggerController.class);

    @GetMapping("/test")
    public String testLogging() {
        logger.trace("TRACE: Inside testLogging()");
        logger.debug("DEBUG: Inside testLogging()");
        logger.info("INFO: Inside testLogging()");
        logger.warn("WARN: Inside testLogging()");
        logger.error("ERROR: Inside testLogging()");

        return "Check the console for log messages!";
    }
}
