package com.hzp.JavaTest2.test6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.JavaTest2.test6
 * @Author: ASUS
 * @CreateTime: 2023-10-19  14:38
 * @Description: TODO
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectangle[] rectangles=new Rectangle[10];
        Rectangle[] r=new Rectangle[10];

        for (int i = 0; i < 10; i++) {
            double width=sc.nextDouble();
            double height=sc.nextDouble();
            String color=sc.next();
            rectangles[i]=new Rectangle(width,height,color);
        }
        Arrays.sort(rectangles, new Comparator<Rectangle>() {
            @Override
            public int compare(Rectangle o1, Rectangle o2) {
                int result = o1.getColor().compareTo(o2.getColor());
                if(result==0){
                    if(o1.getArea()>o2.getArea()){
                        result=1;
                    }
                    if(o1.getArea()>o2.getArea()){
                        result=-1;
                    }
                }
                return result;
            }
        });
        for (int i = 0; i < 10; i++) {
            System.out.println(rectangles[i].toString());
        }
    }
}
