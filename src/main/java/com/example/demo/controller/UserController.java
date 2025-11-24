package com.example.demo.controller;

import com.example.demo.config.UserProperties;
import com.example.demo.model.UserResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    private final UserProperties userProperties;
    private final Random random = new Random();

    public UserController(UserProperties userProperties) {
        this.userProperties = userProperties;
    }

    @GetMapping("/user")
    public UserResponse getUser() {

        log.info("Processing /user request");

        if (random.nextInt(100) == 0) {
            log.error("Simulated random error occurred!");
            throw new RuntimeException("Simulated error");
        }

        UserResponse response = new UserResponse();
        response.setName(userProperties.getName());
        response.setAge(userProperties.getAge());
        response.setCompany(userProperties.getCompany());
        response.setOccupation(userProperties.getOccupation());
        response.setPseudoName(userProperties.getPseudoName());
        response.setPassword(userProperties.getPassword());

        return response;
    }
}
