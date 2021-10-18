package com.lijiext.wiki.controller;

import com.lijiext.wiki.domain.Test;
import com.lijiext.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Value("${test.var:author_not_defined}")
    private String author;

    @Resource
    private TestService testService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String hello() {
        return "HELLO WORLD!\nThis project was made by " + author;
    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }
}
