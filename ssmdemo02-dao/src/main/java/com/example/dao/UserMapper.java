package com.example.dao;


import org.apache.ibatis.annotations.Param;

/**
 * Created by fucheng on 2018/4/29.
 */

public interface UserMapper {

    User selectUserByName(String name);

    User getById(@Param("userId") Integer userId);
}