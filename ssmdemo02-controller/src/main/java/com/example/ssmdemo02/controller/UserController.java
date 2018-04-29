package com.example.ssmdemo02.controller;


import com.example.ssmdemo02.model.UserData;
import com.example.ssmdemo02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by fucheng on 2018/4/29.
 */

//@RestController
@Controller
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "user",method = RequestMethod.GET)
    @ResponseBody
    public UserData selectUserByName() {

        return userService.getUserInfo("小明");
    }



}