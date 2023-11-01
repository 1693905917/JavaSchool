package com.hzp.homework3.test9;

import java.util.Scanner;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.homework3.test9
 * @Author: ASUS
 * @CreateTime: 2023-11-01  20:58
 * @Description: TODO
 * @Version: 1.0
 */
public class test1 {
    public static void main(String[] args) {
        //String s="My name is Carrol";
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(s);
        System.out.println("字符串的长度:"+s.length());
        System.out.println("打印字符串的第一个字符:"+s.charAt(0));
        System.out.println("打印字符串的最后一个字符:"+s.charAt(s.length()-1));
        String[] split = s.split(" ");
        System.out.println("字符串的第一个单词"+split[0]);
    }
}
