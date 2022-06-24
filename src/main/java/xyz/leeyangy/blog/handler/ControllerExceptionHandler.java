package xyz.leeyangy.blog.handler;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author LEEYANGY
 * @date 2022/6/23 1:58
 */
@ControllerAdvice
public class ControllerExceptionHandler {
    //    获取日志
    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandle(HttpServletRequest request, Exception e) throws Exception {
//        记录日志
        logger.error("Request Url :{},Exception :{}", request.getRequestURL(), e);

        ModelAndView mv = new ModelAndView();
        mv.addObject("url", request.getRequestURL());
        mv.addObject("exception", e);
        mv.setViewName("error/error");
        return mv;
    }
}
