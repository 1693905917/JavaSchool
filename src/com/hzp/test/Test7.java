package com.hzp.test;

import java.util.Scanner;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.test
 * @Author: ASUS
 * @CreateTime: 2023-10-08  13:33
 * @Description: TODO
 * @Version: 1.0
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入成绩:");
        double score=sc.nextDouble();

        if(score>=90){
            System.out.println("你的成绩等级:A");
        }else if(score>=80){
            System.out.println("你的成绩等级:B");
        } else if(score>=70){
            System.out.println("你的成绩等级:C");
        } else if(score>=60){
            System.out.println("你的成绩等级:D");
        }
        else {
            System.out.println("你的成绩等级:F");
        }
    }
}
