package com.zhx.springbootwebdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloWordController
 * @Description TODO
 * @Author oyc
 * @Date 2020/12/1 11:09
 * @Version
 */
@RestController
@RequestMapping("hello")
public class HelloWordController {

    @GetMapping
    public String hello() {
        return "hello world";
    }
}