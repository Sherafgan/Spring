package me.sherafgan.spring.aop.a_firstaspect.service;

import me.sherafgan.spring.aop.a_firstaspect.model.Circle;
import me.sherafgan.spring.aop.a_firstaspect.model.Triangle;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 * @version 6/12/17
 */
public class ShapeService {
    private Circle circle;
    private Triangle triangle;

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
