package com.example.springconcepts.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    private static final Logger logger = LoggerFactory.getLogger(DepartmentBean.class);

    private String departmentName = "IT Department"; // Default Value

    public DepartmentBean() {
        logger.info("DepartmentBean initialized with default departmentName: {}", departmentName);
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        logger.info("DepartmentBean name changed to: {}", departmentName);
    }
}
