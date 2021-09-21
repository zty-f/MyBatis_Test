package com.zty.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private int id;
    private String name;
    //一个老师包含多个学生
    private List<Student> students;

}
