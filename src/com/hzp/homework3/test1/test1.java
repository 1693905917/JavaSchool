package com.hzp.homework3.test1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.homework3.test1
 * @Author: ASUS
 * @CreateTime: 2023-11-01  18:22
 * @Description: TODO
 * @Version: 1.0
 */
public class test1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入:");
        double s[]=new double[10];
        int i;
        double min,max=0,sum=0,avg;
        for(i=0;i<s.length;i++) {
            s[i]=sc.nextDouble();
            sum+=s[i];
        }
        Arrays.sort(s);
        avg=sum/10;
        System.out.println("最大:"+s[9]+"最小:"+s[0]+" 10个整数的和:"+sum+"平均值:"+avg);

    }
}
