package top.leeyangy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.leeyangy.pojo.User;

/**
 * Created by leeyangy on 2021/7/25 2:13
 */
@Configuration
public class LeeyangyConfig {
    @Bean
    public User getUser(){
        return new User();
    }
}
