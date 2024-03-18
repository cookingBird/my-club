package com.cookingBird.subject.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectController {
    @GetMapping("/test")
    public String test() {
        return "hello world";
    }
}