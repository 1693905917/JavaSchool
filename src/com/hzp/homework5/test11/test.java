package com.hzp.homework5.test11;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "My name is Networkcrazy";
        System.out.println(name.length()); 
        System.out.println(name.charAt(0)); 
        System.out.println(name.charAt(name.length() - 1)); 
        System.out.println(name.substring(0, 2)); 
        System.out.println(name.indexOf("crazy")); 
        System.out.println(name.toUpperCase()); 
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
        String[] words = name.split(" "); 
        for (String word : words) {
            System.out.println(word); 
        }
        System.out.print("请输入单词：");
        String input = sc.nextLine();
        if (name.contains(input)) {
            System.out.println(input + "在字符串中的位置是：" + name.indexOf(input));
        } else {
            System.out.println(input + "不在字符串中");
        }
    }
}
