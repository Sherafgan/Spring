package me.sherafgan.spring.aop.xmlaspect.model;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 */
public class Circle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        this.name = name;
        System.out.println("setName of Circle called.");
        throw new RuntimeException();
    }

    public String setNameAndReturn(String name) throws Exception {
        this.name = name;
        System.out.println("setName of Circle called.");
        return name;
    }
}
