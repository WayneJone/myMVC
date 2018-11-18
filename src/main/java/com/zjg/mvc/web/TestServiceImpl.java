package com.zjg.mvc.web;


import com.zjg.mvc.annotation.MyService;

@MyService
public class TestServiceImpl implements TestService {
    public String testRequest(String name, String age) {
        return name + ":" + age;
    }

}
