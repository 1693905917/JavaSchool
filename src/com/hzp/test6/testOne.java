package com.hzp.test6;
import java.util.Arrays;
import java.util.Scanner;
//编写一个应用程序，求若干个数的平均数、最大值、最小值、数的个数，原始的若干个数要求从键盘输入。
public class testOne {
	public static void main (String args[ ]) {
		Scanner reader = new Scanner(System.in);
		int sum=0;
		System.out.println("请输入:");
		int[] a=new int[reader.nextInt()];
		for(int i=0;i<a.length;i++) {
			a[i]=reader.nextInt();
		}
		Arrays.sort(a);
		double avg=0.0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		avg=(double)(sum)/a.length;
		System.out.println("平均数:"+avg+"\t"+"最大值:"+a[0]+"\t"+"最小值:"+a[a.length-1]+"数的个数:"+a.length);
	}
}
