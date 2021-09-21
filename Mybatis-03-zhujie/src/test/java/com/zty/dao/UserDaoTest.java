package com.zty.dao;

import com.zty.pojo.User;
import com.zty.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test() {
        SqlSession sqlSession = null;
        //第一步：获得sqlSession对象
        try {
            sqlSession = MybatisUtils.getSqlSession();
            //第二步：执行SQL
            // 方式一：getMapper（）
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            List<User> userList = mapper.getUserList();
            for (User user : userList) {
                System.out.println(user);
            }
        } finally {
            //关闭SqlSession
            sqlSession.close();
        }
    }


    @Test
    public void testupdateUser() {
        SqlSession sqlSession = null;
        //第一步：获得sqlSession对象
        try {
            sqlSession = MybatisUtils.getSqlSession();
            //第二步：执行SQL
            // 方式一：getMapper（）
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            int res= mapper.updateUser("fmj",2);
            if (res==1)
            {
                System.out.println("更新成功！");
            }
            System.out.println();
        } finally {
            //关闭SqlSession
            sqlSession.close();
        }

    }
}