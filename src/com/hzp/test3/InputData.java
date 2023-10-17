package com.hzp.test3;
import java.util.Scanner;

public class InputData {
	public static void main(String args[]) {
		Scanner reader=new Scanner(System.in); 
		int amount =0 ; 
		float price=0,sum=0;
		System.out.println("输入产品数量(回车确认):");
		amount=reader.nextInt(); //从键盘为 amount 赋值
		System.out.println("输入产品单价(回车确认):");
		price=reader.nextFloat(); //从键盘为 price 赋值
		sum = price*amount;
		System.out.printf(" 数 量 :%d, 单 价 :%5.2f, 总 价值:%5.2f",amount,price,sum);
		}
}
