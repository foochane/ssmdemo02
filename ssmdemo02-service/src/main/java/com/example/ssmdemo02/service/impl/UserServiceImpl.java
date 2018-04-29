package com.example.ssmdemo02.service.impl;

import com.example.ssmdemo02.dao.User;
import com.example.ssmdemo02.dao.UserMapper;

import com.example.ssmdemo02.model.UserData;
import com.example.ssmdemo02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by fucheng on 2018/4/29.
 */

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    //依赖注入
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserData getUserInfo(String name) {
        UserData userData = new UserData();
        User user = userMapper.selectUserByName(name);
        if(user!=null){
            userData.setUserId(user.getUserId());
            userData.setUserName(user.getUserName());
            userData.setAge(user.getAge());

        }
        return  userData;
    }
}
