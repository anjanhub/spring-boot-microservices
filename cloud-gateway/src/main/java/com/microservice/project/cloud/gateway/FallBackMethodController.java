package com.microservice.project.cloud.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("fallBack")
public class FallBackMethodController {

    @GetMapping("/userServiceFallBackMethod")
    public String userServiceFallBackMethod() {
        log.info("Inside userServiceFallBackMethod");
        return "User Service is taking longer than expected. Please try again later.";
    }

    @GetMapping("/departmentServiceFallBackMethod")
    public String departmentServiceFallBackMethod() {
        log.info("Inside departmentServiceFallBackMethod");
        return "User Service is taking longer than expected. Please try again later.";
    }
}
