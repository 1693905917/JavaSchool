package com.hzp.homework5.test6;

public class Trapezoid implements Area {
	private float base1;
    private float base2;
    private float height;

    public Trapezoid(float base1, float base2, float height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }

}
