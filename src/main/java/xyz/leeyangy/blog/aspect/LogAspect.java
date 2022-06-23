package xyz.leeyangy.blog.aspect;

import jakarta.servlet.Servlet;
import jakarta.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Arrays;

/**
 * @author LEEYANGY
 * @date 2022/6/23 12:01
 */
@Aspect
@Component
public class LogAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    //    @Pointcut是切点
    @Pointcut("execution(* xyz.leeyangy.blog.controller.*.*(..))")
    public void log() {


    }

    @Before("log()")
//    JoiPoint是springboot提供的一个查看类名方法名的方法
    public void doBefore(JoinPoint joinPoint) {
        logger.info("--------------deBefore------------");
//        调用servlet方法，获取到一些参数
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        String url = request.getRequestURI().toString();
        String ip = request.getRemoteAddr();
        String classMethod = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

//        新建对象
        RequestLog requestLog = new RequestLog(url, ip, classMethod, args);
        logger.info("Request : {} "+requestLog);
    }

    @After("log()")
    public void doAfter() {
        logger.info("--------------deAfter------------");
    }

    @AfterReturning(returning = "result", pointcut = "log()")
    public void AfterReturn(Object result) {
        logger.info("Result : {} " + result);
    }


    private class RequestLog {
        private String url;
        private String ip;
        private String classMethod;
        private Object[] args;

//        全参构造
        public RequestLog(String url, String ip, String classMethod, Object[] args) {
            this.url = url;
            this.ip = ip;
            this.classMethod = classMethod;
            this.args = args;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getClassMethod() {
            return classMethod;
        }

        public void setClassMethod(String classMethod) {
            this.classMethod = classMethod;
        }

        public Object[] getArgs() {
            return args;
        }

        public void setArgs(Object[] args) {
            this.args = args;
        }

        @Override
        public String toString() {
            return "RequestLog{" +
                    "url='" + url + '\'' +
                    ", ip='" + ip + '\'' +
                    ", classMethod='" + classMethod + '\'' +
                    ", args=" + Arrays.toString(args) +
                    '}';
        }
    }
}
