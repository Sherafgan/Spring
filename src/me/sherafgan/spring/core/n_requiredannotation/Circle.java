package me.sherafgan.spring.core.n_requiredannotation;

import org.springframework.beans.factory.annotation.Required;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 */
public class Circle implements Shape {
    private Point center;

    public Point getCenter() {
        return center;
    }

    @Required
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
        System.out.println("Circle: Point is: (" + getCenter().getX() + ", " + getCenter().getY() + ")");
    }
}
