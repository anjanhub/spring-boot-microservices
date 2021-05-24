package com.microservice.project.departmentservice.service;

import com.microservice.project.departmentservice.entity.Department;
import com.microservice.project.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of department service");
        return departmentRepository.save(department);
    }

    public Department findByDepartmentId(Long departmentID) {
        log.info("Inside findDepartmentById method of department service");
        return departmentRepository.findByDepartmentId(departmentID);
    }
}
