package com.zty.dao;

import com.zty.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    //查询User用户信息
    List<User> getUserList();

    //insert一个用户
    int addUser(User user);

    //update信息
    int updateUser(@Param("pwd")String pwd,@Param("id")int id);

    //删除用户信息
    int deleteUser(int id);
}
