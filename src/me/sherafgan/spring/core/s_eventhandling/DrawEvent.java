package me.sherafgan.spring.core.s_eventhandling;

import org.springframework.context.ApplicationEvent;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 */
public class DrawEvent extends ApplicationEvent {
    public DrawEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "Draw Event Occured!";
    }
}
