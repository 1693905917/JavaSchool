package com.hzp.homework4.pojo4_8;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.homework4.pojo4_8
 * @Author: ASUS
 * @CreateTime: 2023-10-17  14:44
 * @Description: TODO
 * @Version: 1.0
 */
public class Circle {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return  "Circle [radius="+radius+"]";
    }

    //周长
    public int getPerimeter(){
        return (int)(2*(radius)*(Math.PI));
    }

    //面积
    public int getArea(){
        return (int)(Math.PI*radius*radius);
    }
}
