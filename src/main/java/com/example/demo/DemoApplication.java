package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		String hello = "Hello moto";
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        log.info("Spring without cache:" + obj.printHello(hello));
        log.info("Spring with cache:" + obj.printHello(hello));
        log.info("Spring with cache 2:" + obj.printHello(hello));

		//((ClassPathXmlApplicationContext) context).close();

	}
}
