package me.sherafgan.spring.aop.firstaspect;

import me.sherafgan.spring.aop.firstaspect.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 */
public class AopMain {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "me/sherafgan/spring/aop/firstaspect/spring-config.xml"
        );
        ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
//        shapeService.getCircle().setName("dummy name");
//        System.out.println(shapeService.getCircle().getName());
        shapeService.getCircle();
    }
}
