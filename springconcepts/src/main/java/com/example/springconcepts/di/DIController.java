package com.example.springconcepts.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/di")
public class DIController {
    private static final Logger logger = LoggerFactory.getLogger(DIController.class);

    private final EmployeeBean employeeBean;

    @Autowired
    public DIController(EmployeeBean employeeBean) {
        this.employeeBean = employeeBean;
        logger.info("DIController initialized and received EmployeeBean dependency.");
    }

    @GetMapping("/test")
    public String testDI() {
        logger.info("testDI() endpoint called");
        return employeeBean.getEmployeeDetails();
    }
}
