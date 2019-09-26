package service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring/spring-*.xml"});
        context.start();
        // Obtaining a remote service proxy
        UserService userService = (UserService)context.getBean("userService");
        // Executing remote methods
        String hello = userService.sayHello("你好");
        // Display the call result
        System.out.println(hello);
    }
}
