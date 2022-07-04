package xyz.leeyangy.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author LEEYANGY
 * @date 2022/7/4 13:46
 */
@Controller
public class AboutController {
    @GetMapping("/about")
        public String about(){
        System.out.println("--------- about ---------");
        return "/about";
    }

}
