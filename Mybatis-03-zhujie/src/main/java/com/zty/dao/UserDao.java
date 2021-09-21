package com.zty.dao;

import com.zty.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao {
    @Select("select * from mybatis.user_fo")
    List<User> getUserList();

    @Update("update  mybatis.user_fo set name=#{name} where id=#{id} ")
    int updateUser(@Param("name") String name,@Param("id") int id);
}
