package com.hzp.homework5.test6;

public class Square implements Area {
	private float side;

    public Square(float side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return side * side;
    }

}
