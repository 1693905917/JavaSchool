package com.hzp.test3;
import java.util.Scanner;
public class GreekAlphabet {
	public static void main (String args[ ]) {
		int startPosition=0,endPosition=0;
		char cStart='α',cEnd='ω';
		startPosition=(int)cStart; //cStart 做 int 型转换据运算，并将结果赋值给
		endPosition=(int)cEnd; //cEnd 做 int 型转换运算，并将结果赋值给 endPosition 
		System.out.println(" 希 腊 字 母 \'α\' 在 unicode 表 中 的 顺 序 位置:"+startPosition);
		System.out.println("希腊字母表：");
		for(int i=startPosition;i<=endPosition;i++) {
		char c='\0';
		c=(char)i; //i 做 char 型转换运算，并将结果赋值给 c
		System.out.print(" "+c);
		if((i-startPosition+1)%10==0)
		System.out.println(""); 
		} }
}
