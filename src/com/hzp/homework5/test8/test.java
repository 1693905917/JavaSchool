package com.hzp.homework5.test8;

import java.util.Scanner;

public class test {
	  public static void main(String[] args) {
		  Graduate graduate=new Graduate("张三","男",23);
		     Scanner sc=new Scanner(System.in);
		     System.out.print("请输入研究生的月输入：");
		     int pay=sc.nextInt();
		     System.out.println("请输入研究生一学期的学费：");
		     int fee=sc.nextInt();
		     graduate.setPay(pay);
		     graduate.setFee(fee);
		     graduate.loan();
		    
	  }
	
}
