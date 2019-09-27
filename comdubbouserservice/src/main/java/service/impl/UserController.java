package service.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("hello.do")
    public String hello(HttpServletRequest request){
        System.out.println("运行了子控制器");
        request.setAttribute("user","王维欢迎你！！！");
        return "hello";
    }
}
