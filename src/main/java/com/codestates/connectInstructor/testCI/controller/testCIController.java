package com.codestates.connectInstructor.testCI.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class testCIController {
    @GetMapping
    public String getTestCI() {
        return "Hello! This file is just for a CI test.";
    }

    @PostMapping
    public String postTestCI() {
            return "Hi! This is just a test... again.";
    }
}
