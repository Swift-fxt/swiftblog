package com.swift.swiftblog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {
    @RequestMapping("/test")
    public String test1(String mass){
        log.info("接收到前端的信息：{}",mass);
        return "我已经收到了";
    }
}
