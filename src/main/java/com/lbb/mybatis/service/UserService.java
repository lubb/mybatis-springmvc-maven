package com.lbb.mybatis.service;

import com.lbb.mybatis.model.User;

import java.util.List;

/**
 * Created by bing on 2017/7/27.
 */
public interface UserService {

    User getUserById(int id);

    List<User> getUsers();

    int insert(User user);

    int deleteById(int id);
}
