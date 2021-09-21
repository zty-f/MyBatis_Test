package com.zty.dao;

import com.zty.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {
    //@Select("select * from teacher where id=#{id}")
    //Teacher getTeacher(@Param("id") int id);

    //获取指定老师下的所有学生以及老师的信息  嵌套查询
    Teacher getTeacher(@Param("tid") int id);

    //获取指定老师下的所有学生以及老师的信息   子查询
    Teacher getTeacher2(@Param("tid") int id);

}
