package com.mdd;

import com.mdd.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 *
 */
public class ComsumeApp
{
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:applicationContext.xml");
        context.start();
        System.out.println("0000");
        DemoService demoService = (DemoService) context.getBean("demoServiceImpl"); // 获取远程服务代理
        String hello = demoService.getName(); // 执行远程方法
        System.out.println(hello); // 显示调用结果
    }
}
