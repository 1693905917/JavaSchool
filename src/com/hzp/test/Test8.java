package com.hzp.test;

import java.util.Scanner;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.test
 * @Author: ASUS
 * @CreateTime: 2023-10-08  14:14
 * @Description: TODO
 * @Version: 1.0
 */
public class Test8 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=100;i<=300;i++){
            if(i%3==0){
                continue;
            }
            sum++;
            System.out.println("不能被 3 整除的数："+i);
            System.out.println("总数："+sum);
        }

    }

}
