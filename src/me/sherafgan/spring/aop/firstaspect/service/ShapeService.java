package me.sherafgan.spring.aop.firstaspect.service;

import me.sherafgan.spring.aop.firstaspect.aspect.Loggable;
import me.sherafgan.spring.aop.firstaspect.model.Circle;
import me.sherafgan.spring.aop.firstaspect.model.Triangle;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 */
public class ShapeService {
    private Circle circle;
    private Triangle triangle;

    @Loggable
    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}
