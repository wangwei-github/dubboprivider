package service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.EmpService;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/spring-*.xml"});
        context.start();
        // Obtaining a remote service proxy
        EmpService userService = (EmpService) context.getBean("EmpServiceImpl");
        // Executing remote methods
        String hello = userService.sayHelloEmp("=========");
        // Display the call result
        System.out.println(hello);
    }
}
