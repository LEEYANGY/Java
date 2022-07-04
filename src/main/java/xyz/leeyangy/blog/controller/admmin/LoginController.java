package xyz.leeyangy.blog.controller.admmin;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import xyz.leeyangy.blog.domain.User;
import xyz.leeyangy.blog.service.UserService;

/**
 * @author LEEYANGY
 * @date 2022/6/24 17:07
 */
@Controller
@RequestMapping("/admin")
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String loginPage() {
        return "admin/login";
    }

    String nicknames;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, HttpSession session, RedirectAttributes attributes, Model model) {
        User user = userService.checkUser(username, password);
        if (user != null) {
            user.setPassword(null);
            session.setAttribute("user", user);
            nicknames=username;
            System.out.println("用户 "+"'"+nicknames+"'"+" 登录，成功登录到后台了，请关注!");
            return "admin/index";
        }else {
            attributes.addFlashAttribute("message","用户名或密码错误");
            System.out.println("有用户尝试登录了，失败了，请及时关注服务器!");
            return "redirect:/admin";
        }
    }

    @GetMapping("/loginout")
    public String logintout(HttpSession session){

        session.removeAttribute("user");
        System.out.println("用户 " + "'" +  nicknames + "'" + " 注销了登录");
        nicknames=null;
        return "redirect:/admin";
    }

}
