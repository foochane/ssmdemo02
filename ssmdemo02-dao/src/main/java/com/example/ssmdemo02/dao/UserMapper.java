package com.example.ssmdemo02.dao;


/**
 * Created by fucheng on 2018/4/29.
 */

public interface UserMapper {

    User selectUserByName(String name);
}