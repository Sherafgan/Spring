package me.sherafgan.spring.aop.xmlaspect.service;

import me.sherafgan.spring.aop.xmlaspect.model.Circle;
import me.sherafgan.spring.aop.xmlaspect.model.Triangle;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 * @version 6/15/17
 */
public class FactoryService {

    public Object getBean(String beanType) {
        if (beanType.equals("shapeService")) {
            return new ShapeServiceProxy();
        }
        if (beanType.equals("circle")) {
            return new Circle();
        }
        if (beanType.equals("triangle")) {
            return new Triangle();
        }
        return null;
    }
}
