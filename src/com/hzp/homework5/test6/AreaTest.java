package com.hzp.homework5.test6;

public class AreaTest {
	public static void main(String[] args) {
        Area[] shapes = {new Square(2.0f), new Rectangle(5.0f, 4.0f),
                new Trapezoid(2.0f, 3.0f, 4.0f), new Circle(5.0)};

        for (Area shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " area: " + shape.getArea());
        }
    }
}
