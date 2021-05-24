package com.microservice.project.departmentservice.controller;

import com.microservice.project.departmentservice.entity.Department;
import com.microservice.project.departmentservice.service.DepartmentService;
import com.sun.jdi.InternalException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) throws InterruptedException {
        log.info("Inside saveDepartment method of department controller");
        Thread.sleep(20);
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentByID(@PathVariable("id") Long departmentID) {
        log.info("Inside findDepartmentByID method of department controller");
        return departmentService.findByDepartmentId(departmentID);
    }


}
