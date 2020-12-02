package com.zhx.springbootwebdemo.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.zhx.springbootwebdemo.entity.User;

import java.util.List;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author oyc
 * @Date 2020/12/1 11:24
 * @Version
 */
public interface UserService extends IService<User> {
    List<User> list();
}