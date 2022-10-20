package xyz.leeyangy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Package: xyz.leeyangy.controller
 * @Author: LEEYANGYANG
 * @Create: 2022/10/21 1:55
 * @Description:
 */
@Controller
public class ParamCOntroller {

    @RequestMapping("/testServletAPI")
//    形参位置的request表示当前请求
    public String testServletAPI(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username="+username+" password="+password);
        return "success";
    }

}
