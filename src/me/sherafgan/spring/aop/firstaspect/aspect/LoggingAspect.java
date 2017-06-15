package me.sherafgan.spring.aop.firstaspect.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 */
@Aspect
public class LoggingAspect {

//    @Before("allCircleMethods()")
//    public void loggingAdvice(JoinPoint joinPoint) {
//        Circle circle = (Circle) joinPoint.getTarget();
//        System.out.println("Circle method called");
//    }

    @Before("args(name)")
    public void stringArgumentMethodsBefore(String name) {
        System.out.println("A method that takes string arguments WILL get called. The values is \"" + name + "\"");
    }

    @AfterReturning(pointcut = "args(name)", returning = "returnString")
    public void stringArgumentMethodsAfterReturning(String name, Object returnString) {
        System.out.println("A method that takes string arguments GOT called. The values is \"" + name
                + "\". The output value is \"" + returnString + "\".");
    }

    @AfterThrowing(pointcut = "args(name)", throwing = "ex")
    public void stringArgumentMethodsAfterException(String name, RuntimeException ex) {
        System.out.println("An exception has been thrown -> " + ex);
    }

    @Pointcut("execution(public * get*(..))")
    public void allGetters() {
    }

    @Around("@annotation(me.sherafgan.spring.aop.firstaspect.aspect.Loggable)")
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

    @Pointcut("within(me.sherafgan.spring.aop.firstaspect.model.Circle)")
    public void allCircleMethods() {
    }

    @Pointcut("args(me.sherafgan.spring.aop.firstaspect.model.Circle)")
    public void circleAsArgs() {
        System.out.println("Circle as argument aspect.");
    }
}
