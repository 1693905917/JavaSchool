package com.hzp.test;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.test
 * @Author: ASUS
 * @CreateTime: 2023-10-08  14:20
 * @Description: TODO
 * @Version: 1.0
 */
public class test9 {
    public static void main(String[] args) {
        int sum=0;
        int i;
        for (i= 1; i <= 100; i++) {
            sum+=i;
            if(i==78||sum>=1000){
                break;
            }
            System.out.print(i+"\t");
            if(i%10==0){
                System.out.println();
            }
        }
        System.out.println("最后一个数:"+i);
    }
}
