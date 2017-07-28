package com.lbb.mybatis.service;

import com.lbb.mybatis.model.User;

import java.util.List;

/**
 *@date 2017/7/28
 *@author lubingbing
 *@descption UserService
 */
public interface UserService {

    User getUserById(int id);

    List<User> getUsers();

    int insert(User user);

    int deleteById(int id);

}
