package com.example.springconcepts.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);

    private final DepartmentBean departmentBean; // Dependency

    @Autowired
    public EmployeeBean(DepartmentBean departmentBean) {
        this.departmentBean = departmentBean;
        logger.info("EmployeeBean initialized and received DepartmentBean dependency.");
    }

    public String getEmployeeDetails() {
        String details = "Employee belongs to " + departmentBean.getDepartmentName();
        logger.info("getEmployeeDetails() called: {}", details);
        return details;
    }
}
