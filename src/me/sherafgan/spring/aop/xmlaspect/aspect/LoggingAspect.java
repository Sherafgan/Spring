package me.sherafgan.spring.aop.xmlaspect.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 */
@Aspect
public class LoggingAspect {

    public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        Object returnValue = null;
        try {
            System.out.println("Before advice");
            returnValue = proceedingJoinPoint.proceed();
            System.out.println("After Returning");
        } catch (Throwable e) {
            System.out.println("After Throwing");
        }
        System.out.println("After Finally");
        return returnValue;
    }

    public void loggingAdvice() {
        System.out.println("Logging from the advice");
    }

}
