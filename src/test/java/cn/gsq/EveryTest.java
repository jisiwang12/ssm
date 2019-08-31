package cn.gsq;

import cn.gsq.dao.UserDao;
import cn.gsq.domain.User;
import cn.gsq.service.Impl.UserServiceImpl;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class EveryTest {
    @Test
    public void userServiceTest() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = ac.getBean("userService", UserServiceImpl.class);
        userService.findAll();

    }
@Test
    public void testUserDao() throws IOException {
        InputStream is = EveryTest.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(is);
        SqlSession session = build.openSession();
        UserDao mapper = session.getMapper(UserDao.class);
        List<User> all = mapper.findAll();
    for (User user:
         all) {
        System.out.println(user);
    }
    User user = new User();
    user.setSex('男');
    user.setUsername("小红");
    mapper.addUser(user);
    session.commit();
        session.close();
        is.close();
    }
}
