package xyz.leeyangy.blog.controller;

/**
 * @author LEEYANGY
 * @date 2022/6/22 1:24
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {
//    @GetMapping("/{id}/{name}")
//    public String index(@PathVariable Integer id,@PathVariable String name) {
//        System.out.println("--------- index ---------");
//        return "error/error";
//    }

//    @GetMapping("/")
//    public String index() {
//        System.out.println("--------- index ---------");
//        return "index";
//    }

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

    @GetMapping("/archives")
    public String archives() {
        System.out.println("--------- archives ---------");
        return "archives";
    }

    @GetMapping("/tags")
    public String tags() {
        System.out.println("--------- tags ---------");
        return "tags";
    }

    @GetMapping("/types")
    public String types() {
        System.out.println("--------- types ---------");
        return "types";
    }

//    admin
//    @GetMapping("/admin")
//    public String admin() {
//        System.out.println("--------- admin/blogs ---------");
//        return "admin/blogs";
//    }

    @GetMapping("/news")
    public String news() {
        System.out.println("--------- admin/blogs-input ---------");
        return "admin/blogs-input";
    }

    @GetMapping("/version")
    public String versionAbout() {
        System.out.println("--------- version/versionAbout ---------");
        return "version/versionAbout";
    }

//    @GetMapping("/login")
//    public String login() {
//        System.out.println("--------- login ---------");
//        return "admin/login";
//    }

//    @GetMapping("/sign_up")
//    public String sign_up() {
//        System.out.println("--------- sign_up ---------");
//        return "admin/sign_up";
//    }

//    @GetMapping("/success")
//    public String success() {
//        System.out.println("--------- sign_up ---------");
//        return "admin/index";
//    }

}
