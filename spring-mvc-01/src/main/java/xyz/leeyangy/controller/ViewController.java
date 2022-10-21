package xyz.leeyangy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Package: xyz.leeyangy.controller
 * @Author: LEEYANGYANG
 * @Create: 2022/10/21 22:00
 * @Description:
 */
@Controller
public class ViewController {

    @RequestMapping("/testThymeleafView")
    public String testThymeleafView(){
        System.out.println("--- testThymeleafView ---");
        return "success";
    }

}
