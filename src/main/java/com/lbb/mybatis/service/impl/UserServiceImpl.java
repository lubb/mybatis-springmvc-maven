package com.lbb.mybatis.service.impl;

import com.lbb.mybatis.dao.UserDao;
import com.lbb.mybatis.model.User;
import com.lbb.mybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *@date 2017/7/28
 *@author lubingbing
 *@descption UserServiceImpl
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    /**
     *@date 2017/7/28
     *@author lubingbing
     *@descption getUserById根据id获取用户信息
     */
    public User getUserById(int id) {
        return userDao.selectByPrimaryKey(id);
    }

    /**
     *@date 2017/7/28
     *@author lubingbing
     *@descption getUsers获取所有的用户信息
     */
    public List<User> getUsers() {
        return userDao.selectAll();
    }

    /**
     *@date 2017/7/28
     *@author lubingbing
     *@descption insert新增用户信息
     */
    public int insert(User user) {
        return userDao.insert(user);
    }

    /**
     *@date 2017/7/28
     *@author lubingbing
     *@descption deleteById根据id删除用户信息
     */
    public int deleteById(int id) {
        return userDao.deleteByPrimaryKey(id);
    }
}
