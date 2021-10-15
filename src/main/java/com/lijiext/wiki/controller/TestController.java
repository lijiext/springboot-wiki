package com.lijiext.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${test.var:author_not_defined}")
    private String author;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String hello() {
        return "HELLO WORLD!\nThis project was made by " + author;
    }
}
