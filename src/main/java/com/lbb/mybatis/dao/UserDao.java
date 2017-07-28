package com.lbb.mybatis.dao;

import com.lbb.mybatis.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {

    int deleteByPrimaryKey(Integer id);

    int insert(User user);

    int insertSelective(User user);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKey(User user);

    List<User> selectAll();
}