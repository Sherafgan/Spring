package me.sherafgan.spring.core.r_messagesource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 */
public class DrawingApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "me/sherafgan/spring/core/r_messagesource/spring-config.xml"
                );
        Shape shape = (Shape) context.getBean("circle");
        shape.draw();
    }
}
