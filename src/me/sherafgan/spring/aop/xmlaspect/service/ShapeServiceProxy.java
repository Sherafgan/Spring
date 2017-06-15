package me.sherafgan.spring.aop.xmlaspect.service;

import me.sherafgan.spring.aop.xmlaspect.aspect.LoggingAspect;
import me.sherafgan.spring.aop.xmlaspect.model.Circle;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 * @version 6/15/17
 */
public class ShapeServiceProxy extends ShapeService {

    @Override
    public Circle getCircle() {
        new LoggingAspect().loggingAdvice();
        return super.getCircle();
    }
}
