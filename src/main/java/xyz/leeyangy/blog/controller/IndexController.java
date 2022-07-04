package xyz.leeyangy.blog.controller;

/**
 * @author LEEYANGY
 * @date 2022/6/22 1:24
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index() {
        System.out.println("--------- index ---------");
        return "index";
    }

    @GetMapping("/blog")
    public String blog() {
        System.out.println("--------- Blog ---------");
        return "Blog";
    }

    @GetMapping("/news")
    public String news() {
        System.out.println("--------- admin/blogs-input ---------");
        return "admin/blogs-input";
    }

}
