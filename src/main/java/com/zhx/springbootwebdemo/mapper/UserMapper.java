package com.zhx.springbootwebdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhx.springbootwebdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName UserMapper.xml
 * @Description TODO
 * @Author oyc
 * @Date 2020/12/1 11:28
 * @Version
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> list();
}