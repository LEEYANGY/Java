package top.leeyangy.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by leeyangy on 2021/7/25 1:10
 *
 * @Component 组件
 * bean 注入
 * @Component 等价于       <bean id="user" class="top.leeyangy.pojo.User"/>
 * 属性注入
 * @Value     等价于       <property name="name" value="Nemo"/>
 */

@Component
public class User {
//    public String name="LEEYANGY";

//    @Value("Nemo")
//    public String name;


    public String name;
    @Value("NEMO")
    public void setName(String name){
        this.name=name;
    }
}
