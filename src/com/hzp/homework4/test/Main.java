package com.hzp.homework4.test;

import com.hzp.JavaTest2.test6.Rectangle;
import com.hzp.homework4.pojo4_15.BankBusiness;
import com.hzp.homework4.pojo7_14.Person;

import java.util.*;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.homework4.test
 * @Author: ASUS
 * @CreateTime: 2023-10-17  13:17
 * @Description: TODO
 * @Version: 1.0
 */
//主程序类，定义两个时钟对象，输入一个时间值，初始化时钟对象1，然后输出两个时钟的值。
//请在下面的【】处补充代码。

import java.util.Scanner;

public class Main {
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


