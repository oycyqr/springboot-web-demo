package com.zhx.springbootwebdemo.controller;

import com.zhx.springbootwebdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author oyc
 * @Date 2020/12/1 11:16
 * @Version
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String user(Model model){
        model.addAttribute("user","用户列表");
        model.addAttribute("list",userService.list());
        return "user";
    }
}