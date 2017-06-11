package me.sherafgan.spring.core.m_codingtointerfaces;

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
                        "me/sherafgan/spring/core/m_codingtointerfaces/spring-config.xml"
                );
        Shape shape = (Shape) context.getBean("shape");
        shape.draw();
    }
}
