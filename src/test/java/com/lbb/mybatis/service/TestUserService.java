package com.lbb.mybatis.service;

import com.lbb.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by bing on 2017/7/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mvc.xml",
        "classpath:spring-mybatis.xml"})
public class TestUserService {

    private static final Logger log = Logger.getLogger(TestUserService.class);

    @Autowired
    private UserService userService;

    @Test
    public void testInsert() {
        User user = new User();
        user.setName("zhuyang");
        user.setBirthday(new Date());
        int result = userService.insert(user);
        System.out.println(result);
    }

    @Test
    public void testAllUser(){
        List<User> list = userService.getUsers();
        for (User user : list){
            System.out.println(user.getId()+":"+user.getName());
        }
    }

    @Test
    public void testDelete(){
        int flag = userService.deleteById(3);
        System.out.println(flag);
    }

    @Test
    public void testGetByUserId(){
        User user = userService.getUserById(1);
        System.out.println(user.getName());
    }
}
