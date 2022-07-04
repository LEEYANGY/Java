package xyz.leeyangy.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import xyz.leeyangy.blog.service.BlogService;

/**
 * @author LEEYANGY
 * @date 2022/7/4 13:52
 */
@Controller
public class ArchivesShowController {
    @Autowired
    BlogService blogService;

    @GetMapping("/archives")
    public String archives(Model model) {
        model.addAttribute("archiveMap", blogService.archiveBlog());
        model.addAttribute("blogCount", blogService.countBlog());
        System.out.println("--------- archives ---------");
        return "archives";
    }
}
