package com.codestates.connectInstructor.testEC2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ec2")
public class testEC2Controller {
    @GetMapping
    public String getTestEC2() {
        return "Hello! This file is just for a EC2 test.";
    }
}
