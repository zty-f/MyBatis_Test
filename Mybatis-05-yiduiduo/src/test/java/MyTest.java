import com.zty.dao.StudentMapper;
import com.zty.dao.TeacherMapper;
import com.zty.pojo.Student;
import com.zty.pojo.Teacher;
import com.zty.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {

    @Test
    public  void testgetStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher student = mapper.getTeacher(1);
        System.out.println(student);
        sqlSession.close();
    }

    @Test
    public  void testgetStudent2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher2 = mapper.getTeacher2(1);
        System.out.println(teacher2);
        sqlSession.close();
    }
}
