import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.leeyangy.pojo.Hello;

/**
 * Created by leeyangy on 2021/7/23 1:57
 */
public class MyTest {
    public static void main(String[] args) {
        //    ApplicationContext context = new ClassPathXmlApplicationContext(可以传入多个xml);
//    获取spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
