package com.example.service;


import com.example.model.UserData;
import com.example.common.Result;

/**
 * Created by fucheng on 2018/4/29.
 */
public interface UserService {

    UserData getUserInfo(String name);

    Result getById(Integer id) throws Exception;
}
