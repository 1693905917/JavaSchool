package com.hzp.test4;
import java.util.Scanner;
public class Computer {
	public static void main(String args[]) {
		Scanner reader=new Scanner(System.in); 
		double amount = 0;
		double price = 0;
		System.out.print("输入电量:");
		amount =reader.nextDouble();
		if(amount <= 90 && amount>=1){
			price=amount*(0.558);//计算 price 的值，每千瓦时(度)0.558 元; 
			}
		else if(amount <= 150 && amount>=91){
			price=amount*(0.608);//计算 price 的值,每千瓦时(度)0.608 元 
			}
		else if(amount>150){
			price=amount*(0.858);//计算 price 的值,每千瓦时(度)0.858 元;
		}
		else {
		System.out.println("输入电量:"+amount+"不合理");
		}
		System.out.printf("电费:%5.2f",price);
		}
}
