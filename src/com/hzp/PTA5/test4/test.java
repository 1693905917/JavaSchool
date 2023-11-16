package com.hzp.PTA5.test4;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.PTA5.test4
 * @Author: ASUS
 * @CreateTime: 2023-11-16  23:10
 * @Description: TODO
 * @Version: 1.0
 */
class Circle {
    private double radius;

    public
    Circle()
    {
        radius = 1;
    }

    public Circle(double radius) {

        this.radius
                = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {

        return Math.PI * radius * radius;

    }
    public String toString() {

        return "Cirlce: radius = " + radius;

    }
}

class ComparableCircle
        extends
        Circle
        implements
        Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {

        super(radius);

    }

    @Override // Implement the compareTo method defined in Comparable
    public int compareTo(
            ComparableCircle o
    ) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return
                super.toString()
                        + "\nArea: " + getArea();
    }
}
public class test {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(7);
        ComparableCircle c2 = new ComparableCircle(5);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(
                c1.compareTo(c2)>0
                        ?"c1较大":"c2较大");

    }
}
