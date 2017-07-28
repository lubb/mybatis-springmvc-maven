package com.lbb.mybatis.controller;

import com.lbb.mybatis.model.User;
import com.lbb.mybatis.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;
/**
 *@date 2017/7/28
 *@author lubingbing
 *@descption UserController
 */
@Controller
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    /**
     *@date 2017/7/28
     *@author lubingbing
     *@descption 显示所有的用户信息
     */
    @RequestMapping(value="/showUser",method = RequestMethod.GET)
    public String showUser(ModelMap modelMap){
        log.info("查询所有用户信息");
        List<User> userList = userService.getUsers();
        modelMap.addAttribute("userList",userList);
        return "showUser";
    }
}
