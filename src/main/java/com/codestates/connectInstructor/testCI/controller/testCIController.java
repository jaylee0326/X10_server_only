package com.codestates.connectInstructor.testCI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class testCIController {
        @GetMapping
        public String getTestCI() {
            return "Hello! This file is just for a CI test.";
        }
}
