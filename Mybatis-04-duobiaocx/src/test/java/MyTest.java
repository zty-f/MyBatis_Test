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
        StudentMapper mapper =sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        System.out.println(student);
        sqlSession.close();
    }

    @Test
    public  void testgetStudent2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper =sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent2();
        System.out.println(student);
        sqlSession.close();
    }
}
