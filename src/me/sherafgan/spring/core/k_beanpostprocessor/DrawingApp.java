package me.sherafgan.spring.core.k_beanpostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 */
public class DrawingApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "me/sherafgan/spring/core/k_beanpostprocessor/spring-config.xml"
                );
        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();
    }
}
