package xyz.leeyangy.blog.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author LEEYANGY
 * @date 2022/7/4 16:27
 */
@Controller
public class VersionDetails {
    @GetMapping("/version")
    public String versionAbout() {
        System.out.println("--------- version/versionAbout ---------");
        return "version/versionAbout";
    }
}
