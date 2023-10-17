package com.hzp.homework4.pojo4_8;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.homework4.pojo4_8
 * @Author: ASUS
 * @CreateTime: 2023-10-17  14:43
 * @Description: TODO
 * @Version: 1.0
 */
public class Rectangle {

    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle [width="+width+", length="+length+"]";
    }

    //周长
    public int getPerimeter(){
        return 2*(width+length);
    }

    //面积
    public int getArea(){
        return width*length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }



}
