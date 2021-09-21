import com.zty.dao.UserMapper;
import com.zty.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.InputStream;


public class MyTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void before() throws FileNotFoundException {
        InputStream inputStream = ClassLoader.getSystemResourceAsStream("MybatisConfig.xml");

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        this.sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
    }

    @Test
    public void testQuery() {
        SqlSession sqlSession = this.sqlSessionFactory.openSession();

        User user = sqlSession.selectOne("com.zty.dao.UserMapper.findById", 2);

        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void testProxyQuery() {
        SqlSession sqlSession = this.sqlSessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.findById(1);

        System.out.println(user);
    }

//    日志测试
//    static Logger logger = Logger.getLogger(MyTest.class);
//    @Test
//    public void testlog4j() {
//        logger.info("info:进入了testlog4j");
//        logger.debug("debug:进入了testlog4j");
//        logger.error("error:进入了testlog4j");
//    }

}
