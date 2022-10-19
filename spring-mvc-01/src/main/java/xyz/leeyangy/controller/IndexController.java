package xyz.leeyangy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Package: xyz.leeyangy.controller
 * @Author: LEEYANGYANG
 * @Create: 2022/10/20 0:41
 * @Description:
 */
@Controller
//@RequestMapping("login")
public class IndexController {


    @RequestMapping("/")
    public String index(){
        System.out.println("访问了首页");
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        System.out.println("访问了首页");
        return "login";
    }

    @RequestMapping(value = "/login/success",
            method = {RequestMethod.GET},
            params = {"username=admin","password=admin"},
            headers = {"Hots=127.0.0.1:8080"})
    public String success(){
        System.out.println("登录成功");
        return "success";
    }

}
