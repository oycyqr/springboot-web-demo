package com.zhx.springbootwebdemo.entity;


import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description TODO
 * @Author oyc
 * @Date 2020/12/1 11:20
 * @Version
 */
@Data
public class User implements Serializable {

    private int id;
    private String name;
}