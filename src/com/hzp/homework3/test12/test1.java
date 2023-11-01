package com.hzp.homework3.test12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.homework3.test12
 * @Author: ASUS
 * @CreateTime: 2023-11-01  21:25
 * @Description: TODO
 * @Version: 1.0
 */
public class test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList list=new ArrayList();
        System.out.println("随机取出:");
        int n=sc.nextInt();
        Double c;
        System.out.println("最大值到:");
        int m=sc.nextInt();
        Random r=new Random();
        //生成1-10的随机数
        double d;
        int a=1,sum=0,end;
        int num[]=new int[n];
        for(int i=0;i<n;i++) {
            int number=1+r.nextInt(m);
            num[i]=number;
            System.out.print(number+"\t");
        }
        System.out.println();
        int i,j;
        Arrays.sort(num);
        for (int x : num) {
            System.out.print(x+"\t");
        }
        System.out.println();
        c=(double)n;
        for(i=0;i<num.length;i++) {
            for(j=i+1;j<num.length;j++) {
                if(num[i]==num[j]) {
                    a++;//获取出现次数
                }else {
                    System.out.println(num[i]+"出现次数："+a+"出现概率:"+a/c);
                    sum+=a;
                    i=j;
                    a=1;
                }
            }
        }
        end=n-sum;
        System.out.println(num[9]+"出现次数："+end+"出现概率:"+end/c);
    }
}
