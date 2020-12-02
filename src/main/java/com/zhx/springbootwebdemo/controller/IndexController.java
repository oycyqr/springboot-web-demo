package com.zhx.springbootwebdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author oyc
 * @Date 2020/12/1 11:11
 * @Version
 */
@RequestMapping("index")
@Controller
public class IndexController {

    @GetMapping
    public String index(Model model){
        model.addAttribute("title","欢迎来到我的欢迎页面-index");
        return "index";
    }
}