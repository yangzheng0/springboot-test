package com.example.springboottest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangzheng
 * @version 1.0
 * @description
 * @date 2020/10/31 031 13:54
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "test123";
    }
}
