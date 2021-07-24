import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.leeyangy.service.UserServiceImpl;

/**
 * Created by leeyangy on 2021/7/22 20:22
 */
public class MyTest {
    //    @Test
    public static void main(String[] args) {
//    UserServiceImpl userService = new UserServiceImpl();
//    userService.getUser();
//    获取ApplicationContex
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//    需要什么直接get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
