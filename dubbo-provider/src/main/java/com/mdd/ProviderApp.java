package com.mdd;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 */
public class ProviderApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:applicationContext.xml");
        context.start();
        System.out.println("Dubbo provider start...");
        System.out.println(context.getBean("demoServiceImpl"));
        try {
            System.in.read();    // 按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
