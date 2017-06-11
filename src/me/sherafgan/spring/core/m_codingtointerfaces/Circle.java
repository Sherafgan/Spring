package me.sherafgan.spring.core.m_codingtointerfaces;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 * @version 6/11/17
 */
public class Circle implements Shape {
    private Point center;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
        System.out.println("Circle: Point is: (" + getCenter().getX() + ", " + getCenter().getY() + ")");
    }
}
