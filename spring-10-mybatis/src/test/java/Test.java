import com.hwd.mapper.UserMapper;
import com.hwd.pojo.User;
import jdk.nashorn.internal.ir.CallNode;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.security.util.Resources_de;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    @org.junit.Test
    public void test() throws IOException {
        String resources="mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resources);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();
        for (User user:users){
            System.out.println(user);
        }
    }
    @org.junit.Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper  = context.getBean("userMapper",UserMapper.class);
        List<User> users = userMapper.selectUser();
        for (User user:users){
            System.out.println(user);
        }
    }
}
