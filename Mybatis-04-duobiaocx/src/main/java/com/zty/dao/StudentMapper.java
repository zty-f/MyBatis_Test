package com.zty.dao;

import com.zty.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //查询所有学生信息以及对应的老师（第一种方法）
    public List<Student> getStudent();

    //查询所有学生信息以及对应的老师（第二种方法）
    public List<Student> getStudent2();


}
