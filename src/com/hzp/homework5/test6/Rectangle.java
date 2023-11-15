package com.hzp.homework5.test6;

public class Rectangle implements Area {
	private float length;
    private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

}
