package com.zty.dao;

import com.zty.pojo.User;
import com.zty.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = null;
        //第一步：获得sqlSession对象
        try{
            sqlSession = MybatisUtils.getSqlSession();
            //第二步：执行SQL
            // 方式一：getMapper（）
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            List<User> userList = mapper.getUserList();
            for (User user:userList)
            {
                System.out.println(user);
            }
        }
        finally {
            //关闭SqlSession
            sqlSession.close();
        }
    }

    //增删改需要提交事务，必须提交事务才能对于数据库信息进行操作
    @Test
    public void testAddUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int res=mapper.addUser(new User(1,"zty","1234"));
        if (res>0){
            System.out.println("插入成功！");
        }
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testUpdateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int res=mapper.updateUser("12345",2);
        if (res>0){
            System.out.println("更新成功！");
        }
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testdeleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int res=mapper.deleteUser(1);
        if (res>0){
            System.out.println("删除成功！");
        }
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }
}
