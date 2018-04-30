package com.example.service;


import com.example.common.ListResult;
import com.example.model.UserData;
import com.example.common.Result;

import java.util.List;

/**
 * Created by fucheng on 2018/4/29.
 */
public interface UserService {

    UserData getUserInfo(String name);

    Result getById(Integer id) throws Exception;

    Result getUserInfo(Integer age, String address) throws Exception;

    Result add(UserData userData)throws Exception;

    Result batchAdd(List<UserData> userData);

    Result remove(Integer userId);

    Result update(UserData userData);
}
