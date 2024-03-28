package com.cookingBird.subject.application.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/subject")
public class SubjectController {
    @GetMapping("/test")
    public String test() {
        return "hello world";
    }
}
