package me.sherafgan.spring.core.i_beandefinheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 */
public class DrawingApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("me/sherafgan/spring/core/i_beandefinheritance/spring-config.xml");
        Triangle triangle = (Triangle) context.getBean("triangle1");
        triangle.draw();
    }
}
