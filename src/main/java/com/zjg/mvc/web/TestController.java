package com.zjg.mvc.web;

import com.zjg.mvc.annotation.MyAutowried;
import com.zjg.mvc.annotation.MyController;
import com.zjg.mvc.annotation.MyRequestMapping;
import com.zjg.mvc.annotation.MyRequestParam;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;

import java.util.UUID;

@MyController
@MyRequestMapping("/")
@Slf4j
public class TestController {
    private static final String TRACE_LOG_ID = "TRACE_LOG_ID";
    @MyAutowried
    private TestService testService;
    @MyRequestMapping("/test")
    public String testRequest(@MyRequestParam("name")String name,@MyRequestParam("age")String age){
        MDC.put(TRACE_LOG_ID,UUID.randomUUID().toString());
        String result = testService.testRequest(name,age);
        log.info("66666666");

        return result;
    }
}
