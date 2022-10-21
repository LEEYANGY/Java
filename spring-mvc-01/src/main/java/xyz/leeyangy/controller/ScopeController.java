package xyz.leeyangy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Package: xyz.leeyangy.controller
 * @Author: LEEYANGYANG
 * @Create: 2022/10/21 18:33
 * @Description:
 */
@Controller
public class ScopeController {

//    servletAPI
    @RequestMapping("/testRequestByServletAPI")
    public String testRequestByServletAPI(HttpServletRequest request){
        request.setAttribute("testRequestScope","hello,servlet");
        return "success";
    }

//    spring提供的向request域共享数据方法

    /**
     *          向request域共享数据，向视图设置视图名称
     * @return  ModelAndView必须做为返回值返回
     */
    @RequestMapping("testModelAndView")
    public ModelAndView testModelAndView(){
        System.out.println("使用了 ModelAndView");
        ModelAndView mav=new ModelAndView();
//        处理模型数据，想请求域request共享数据
        mav.addObject("testRequestScope","hello,ModelAndView");
//        设置视图名称  view
        mav.setViewName("success");
        return mav;
    }


}
