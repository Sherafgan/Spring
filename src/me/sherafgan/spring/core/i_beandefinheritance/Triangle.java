package me.sherafgan.spring.core.i_beandefinheritance;

import java.util.List;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 */
public class Triangle {
    List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw() {
        for (int i = 0; i < points.size(); i++) {
            System.out.println("Point " + (i + 1) + " = (" + points.get(i).getX() + ", " + points.get(i).getY() + ")");
        }
    }
}
