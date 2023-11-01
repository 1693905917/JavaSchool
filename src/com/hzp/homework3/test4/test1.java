package com.hzp.homework3.test4;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入一段英文文字：");
        String s = sc.nextLine();
        int charNum = 0, wordNum = 0, sentenceNum = 0;
        charNum = s.length();//判断字符数
        System.out.println(s);
        String[] s1 = s.split(" ");
        wordNum=s1.length;
//        for (String s2 : s1) {
//            System.out.println(s2);
//        }
        String[] s2 = s.split("\\?、!.");
        sentenceNum= s2.length;
        System.out.println("字符数：" + charNum);
        System.out.println("单词个数：" + wordNum);
        System.out.println("句子数：" + sentenceNum);
		
		
	}
}
