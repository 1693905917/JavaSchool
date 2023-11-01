package com.hzp.homework3.test6;

import java.util.Arrays;
import java.util.Random;

public class test1 {
	public static void main(String[] args) {
		Random r=new Random();
		//生成1-10的随机数
		double d;
		int a=1,sum=0,end;
		int num[]=new int[10];
		for(int i=0;i<10;i++) {
			int number=1+r.nextInt(10);
			num[i]=number;
			System.out.print(number+"\t");
		}
		System.out.println();
		int i,j;
		Arrays.sort(num);
		for (int x : num) {
			System.out.print(x+"\t");
		}
		System.out.println();
		for(i=0;i<num.length;i++) {
			for(j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					a++;//获取出现次数
				}else {
					System.out.println(num[i]+"出现次数："+a+"出现概率:"+a/10.0);
					sum+=a;
					i=j;
					a=1;
				}
			}
		}
		end=10-sum;
		System.out.println(num[9]+"出现次数："+end+"出现概率:"+end/10.0);
	}
}
