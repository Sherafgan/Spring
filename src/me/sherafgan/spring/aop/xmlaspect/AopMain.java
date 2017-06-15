package me.sherafgan.spring.aop.xmlaspect;

import me.sherafgan.spring.aop.xmlaspect.service.FactoryService;
import me.sherafgan.spring.aop.xmlaspect.service.ShapeService;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 */
public class AopMain {
    public static void main(String[] args) throws Exception {
//        ApplicationContext context = new ClassPathXmlApplicationContext(
//                "me/sherafgan/spring/aop/xmlaspect/spring-config.xml"
//        );
//        ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
        FactoryService factoryService = new FactoryService();
        ShapeService shapeService = (ShapeService) factoryService.getBean("shapeService");
        shapeService.getCircle();
    }
}
