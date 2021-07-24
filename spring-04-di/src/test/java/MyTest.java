import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.leeyangy.pojo.Student;
import top.leeyangy.pojo.User;

/**
 * Created by leeyangy on 2021/7/24 1:42
 */
public class MyTest {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        Student student = (Student) context.getBean("student");
//        System.out.println(student.getName());
//        System.out.println(student.getAddress());
//        System.out.println(student.toString());

    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user = (User) context.getBean("user",User.class);
//        System.out.println(user.toString());
        System.out.println(user);
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user = (User) context.getBean("user2",User.class);
//        System.out.println(user.toString());
        System.out.println(user);
    }

//    scope="singleton"
    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user1 = (User) context.getBean("user3",User.class);
        User user2 = (User) context.getBean("user3",User.class);
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1==user2);
    }

//    scope="prototype"
    @Test
    public void test5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user3 = (User) context.getBean("user4",User.class);
        User user4 = (User) context.getBean("user4",User.class);
        System.out.println(user3.hashCode());
        System.out.println(user4.hashCode());
        System.out.println(user3==user4);
    }

}
