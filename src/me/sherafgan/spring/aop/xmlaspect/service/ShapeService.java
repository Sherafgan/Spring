package me.sherafgan.spring.aop.xmlaspect.service;

import me.sherafgan.spring.aop.xmlaspect.model.Circle;
import me.sherafgan.spring.aop.xmlaspect.model.Triangle;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 */
public class ShapeService {
    private Circle circle;
    private Triangle triangle;

    public Circle getCircle() {
        System.out.println("Circle getter called");
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
