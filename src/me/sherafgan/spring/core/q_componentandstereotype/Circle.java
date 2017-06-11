package me.sherafgan.spring.core.q_componentandstereotype;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 * @version 6/11/17
 */
//@Service
//@Repository
//@Controller
@Component
public class Circle implements Shape {
    private Point center;

    public Point getCenter() {
        return center;
    }

    @Resource(name = "pointC")
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
        System.out.println("Circle: Point is: (" + getCenter().getX() + ", " + getCenter().getY() + ")");
    }

    @PostConstruct
    public void intializeCircle() {
        System.out.println("Init of Circle");
    }

    @PreDestroy
    public void destroyCircle() {
        System.out.println("Destroy of Circle");
    }
}
