package me.sherafgan.spring.core.c_constructorinjection;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 * @version 6/10/17
 */
public class Triangle {
    private String type;
    private int height;

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(int height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

    //    public void setType(String type) {
//        this.type = type;
//    }

    public void draw() {
        System.out.println(getType() + " Triangle of height " + getHeight());
    }
}
