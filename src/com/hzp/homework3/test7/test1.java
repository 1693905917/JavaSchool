package com.hzp.homework3.test7;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.homework3.test7
 * @Author: ASUS
 * @CreateTime: 2023-11-01  19:01
 * @Description: TODO Fibonacci
 * @Version: 1.0
 */
public class test1 {
    public static void main(String[] args) {
        final int n=10;
        int a[]=new int[n];
        Fb(a);
        for (int i : a) {
            System.out.print(i+"\t");
        }
    }

    static void Fb(int a[]){
        int i;
        a[0]=1;
        a[1]=1;
        for (i=2;i<a.length;i++){
            a[i]=a[i-1]+a[i-2];
        }
    }
}
