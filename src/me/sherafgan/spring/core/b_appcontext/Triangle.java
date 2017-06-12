package me.sherafgan.spring.core.b_appcontext;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 */
public class Triangle {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void draw() {
        System.out.println(getType() + " Triangle");
    }
}
