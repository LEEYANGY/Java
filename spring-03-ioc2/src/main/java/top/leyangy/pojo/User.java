package top.leyangy.pojo;

/**
 * Created by leeyangy on 2021/7/24 0:22
 */
public class User {
    private String name;

//    public User(){
//        System.out.println("User的无参构造");
//    }

    public User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public void show() {
        System.out.println("name=" + name);
    }
}
