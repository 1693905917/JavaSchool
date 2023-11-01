package com.hzp.homework3.test8;

import java.util.Random;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.homework3.test8
 * @Author: ASUS
 * @CreateTime: 2023-11-01  19:39
 * @Description: TODO
 * @Version: 1.0
 */
public class Matrix {
    private int arr[][];

    public Matrix() {
        arr=new int[10][10];
    }

    public Matrix(int n,int m)  {
        arr=new int[n][m];
        Random r=new Random();
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                int number=1+r.nextInt(10);
                arr[i][j]=number;
            }
        }
    }

    public Matrix(int table[][]){
        this.arr=table;
    }

    //输出 Matrix 类中数组的元素值
    public void output(){
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
        }
    }

    //输出一个矩阵的转置矩阵
    public void transpose() {
        //arr[0].length 列4  arr.length：行3
        int brr[][]=new int[arr[0].length][arr.length];
        //System.out.println(arr[0].length+"-----"+arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                brr[j][i] = arr[i][j];//进行转置
                //System.out.print(arr[i][j] + " ");
            }
            //System.out.println();
        }

        System.out.println("矩阵转置后为 ");
        for(int i=0;i<arr[0].length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
    }


}
