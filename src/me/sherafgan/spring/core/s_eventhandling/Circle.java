package me.sherafgan.spring.core.s_eventhandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 */
//@Service
//@Repository
//@Controller
@Component
public class Circle implements Shape, ApplicationEventPublisherAware {
    private Point center;
    private ApplicationEventPublisher eventPublisher;

    @Autowired
    private MessageSource messageSource;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public Point getCenter() {
        return center;
    }

    @Resource(name = "pointC")
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println(this.messageSource.getMessage
                ("drawing.circle", null, "Default Drawing Circle", null)
        );
        System.out.println(this.messageSource.getMessage
                ("drawing.point", new Object[]{center.getX(), center.getY()}, "Default Point Circle", null)
        );
        DrawEvent drawEvent = new DrawEvent(this);
        eventPublisher.publishEvent(drawEvent);
//        System.out.println("Circle: Point is: (" + getCenter().getX() + ", " + getCenter().getY() + ")");
//        System.out.println(this.messageSource.getMessage("greeting", null, "Default Greeting", null));
    }

    @PostConstruct
    public void intializeCircle() {
        System.out.println("Init of Circle");
    }

    @PreDestroy
    public void destroyCircle() {
        System.out.println("Destroy of Circle");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }
}
