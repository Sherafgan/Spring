package me.sherafgan.spring.aop.a_firstaspect;

import me.sherafgan.spring.aop.a_firstaspect.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 * @version 6/12/17
 */
public class AopMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "me/sherafgan/spring/aop/a_firstaspect/spring-config.xml"
        );
        ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
        System.out.println(shapeService.getCircle().getName());
    }
}
