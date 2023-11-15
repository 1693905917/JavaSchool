package com.hzp.homework5.test10;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		System.out.print("请输入浮点数：");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try {
            double num = Double.parseDouble(input);
            String[] parts = input.split("\\.");
            String integerPart = parts[0];
            String decimalPart = parts[1];
            int integerDigits = integerPart.length();
            int decimalDigits = decimalPart.length();
            System.out.println("整数部分为：" + integerPart);
            System.out.println("小数部分为：" + decimalPart);
            System.out.println("整数部分共有" + integerDigits + "位数字");
            System.out.println("小数部分共有" + decimalDigits + "位数字");
        } catch (Exception e) {
            System.out.println("输入不合法，请输入一个浮点数！");
        } 
    }
}
