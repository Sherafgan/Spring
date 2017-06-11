package me.sherafgan.spring.core.n_requiredannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 * @version 6/10/17
 */
public class DrawingApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "me/sherafgan/spring/core/n_requiredannotation/spring-config.xml"
                );
        Shape shape = (Shape) context.getBean("circle");
        shape.draw();
    }
}
