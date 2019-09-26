package service.impl;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.util.Log4jConfigListener;

public class Provider {
    public static void main(String[] args) throws Exception {
//        Logger logger = LoggerFactory.getLogger(Provider.class);
//
//        logger.info(",,,,,,,,,,,,,,,,,,,,,,,,,,");
        //BasicConfigurator.configure();
        System.err.println("dddddd");
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-*.xml"});
        context.start();
        System.out.println("Provider started.");
        System.in.read(); // press any key to exit
    }
}
