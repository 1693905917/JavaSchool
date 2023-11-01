package com.hzp.homework3.test5;

public class test1 {

	public static void main(String[] args) {
        int[][] num = new int[10][];
        for (int i = 0; i < num.length; i++) {
            //设定每一行的列数
            num[i] = new int[i+1];
            //每一行的第一个元素与最后一个元素都是1
            num[i][0] = 1;
            num[i][i] = 1;
            for (int j = 1; j < num[i].length - 1; j++) {
                num[i][j] = num[i - 1][j - 1] + num[i - 1][j];
            }

        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + "\t");

            }
            System.out.println();
        }
	}
}
