package com.hzp.homework5.test6;

public class Circle implements Area {
	 private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    public double getArea() {
	        return Math.PI * radius * radius;
	    }
}
