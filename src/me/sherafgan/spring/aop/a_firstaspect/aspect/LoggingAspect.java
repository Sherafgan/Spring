package me.sherafgan.spring.aop.a_firstaspect.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 * @version 6/12/17
 */
@Aspect
public class LoggingAspect {

    @Before("execution(public String getName())")
    public void loggingAdvice() {
        System.out.println("Advice run. Get Method called");
    }
}
