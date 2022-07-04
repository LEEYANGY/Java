package xyz.leeyangy.blog.component;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @author LEEYANGY
 * @date 2022/6/25 1:56
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

    // 目标方法执行之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getSession().getAttribute("user") == null) {
            request.setAttribute("msg", "未登录，没有权限");
//            response.sendRedirect("/admin");
            request.getRequestDispatcher("/admin").forward(request, response);
            return false;
        }
        return true;
    }
}
