package xyz.leeyangy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Package: xyz.leeyangy.controller
 * @Author: LEEYANGYANG
 * @Create: 2022/10/20 0:41
 * @Description:
 */
@Controller
//@RequestMapping
public class IndexController {


    @RequestMapping("/")
    public String index(){
        System.out.println("访问了首页");
        return "index";
    }

    @GetMapping("/login/success")
    public String login(){
        System.out.println("登录成功");
        return "success";
    }

}
