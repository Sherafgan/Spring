package me.sherafgan.spring.core.o_autowiredannotation;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 */
public class Circle implements Shape {
    private Point center;

    public Point getCenter() {
        return center;
    }

    //    @Required
    @Autowired
//    @Qualifier("circleRelated") //error
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
        System.out.println("Circle: Point is: (" + getCenter().getX() + ", " + getCenter().getY() + ")");
    }
}
