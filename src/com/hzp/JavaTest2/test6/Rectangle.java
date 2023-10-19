package com.hzp.JavaTest2.test6;

import java.util.Objects;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.JavaTest2.test6
 * @Author: ASUS
 * @CreateTime: 2023-10-19  13:54
 * @Description: TODO
 * @Version: 1.0
 */
public class Rectangle implements Comparable {
    private double width;
    private double height;
    private String color;

    public Rectangle() {
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getArea(){
       return width*height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 && Double.compare(rectangle.height, height) == 0 && Objects.equals(color, rectangle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, color);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if("red".equalsIgnoreCase(color)||"green".equalsIgnoreCase(color)||"blue".equalsIgnoreCase(color)){
            this.color = color;
        }
    }

    @Override
    public int compareTo(Object o) {

        return 0;
    }
}
