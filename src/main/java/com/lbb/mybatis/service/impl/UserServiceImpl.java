package com.lbb.mybatis.service.impl;

import com.lbb.mybatis.dao.UserDao;
import com.lbb.mybatis.model.User;
import com.lbb.mybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by bing on 2017/7/27.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public User getUserById(int id) {
        return userDao.selectByPrimaryKey(id);
    }

    public List<User> getUsers() {
        return userDao.selectAll();
    }

    public int insert(User user) {
        return userDao.insert(user);
    }

    public int deleteById(int id) {
        return userDao.deleteByPrimaryKey(id);
    }
}
