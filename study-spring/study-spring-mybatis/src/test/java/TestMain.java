import com.edu.dao.UserMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: study-spring
 * @description:
 * @author: lihangyu
 * @create: 2020-12-21 18:20
 */
public class TestMain {


    @Test
    public void mybatisTest(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        UserMapper userMapper = (UserMapper) classPathXmlApplicationContext.getBean("userMapper");
        System.out.println(userMapper.selectAll());
    }
}
