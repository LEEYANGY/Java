import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.leeyangy.config.LeeyangyConfig;
import top.leeyangy.pojo.User;

/**
 * Created by leeyangy on 2021/7/25 2:20
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(LeeyangyConfig.class);
        User getUser = (User) context.getBean("getUser", User.class);
        System.out.println(getUser.getName());
    }
}
