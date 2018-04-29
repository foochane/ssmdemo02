package com.example.controller;


import com.example.model.UserData;
import com.example.service.UserService;
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