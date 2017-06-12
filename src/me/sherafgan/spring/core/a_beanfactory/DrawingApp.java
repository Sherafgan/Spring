package me.sherafgan.spring.core.a_beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 */
public class DrawingApp {
    public static void main(String[] args) {
//        Triangle triangle = new Triangle();
//        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/me.sherafgan.spring-config.xml"));
        BeanFactory beanFactory =
                new ClassPathXmlApplicationContext("me/sherafgan/spring/core/a_beanfactory/spring-config.xml");
        Triangle triangle = (Triangle) beanFactory.getBean("triangle");
        triangle.draw();
    }
}
