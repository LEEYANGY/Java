import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.leeyangy.pojo.User;

/**
 * Created by leeyangy on 2021/7/25 1:10
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User) context.getBean("user",User.class);
        System.out.println(user);
        System.out.println(user.name);
    }
}
