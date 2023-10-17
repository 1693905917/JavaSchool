package com.hzp.homework4.test;





import com.hzp.homework4.pojo4_15.BankBusiness;
import com.hzp.homework4.pojo7_14.Person;

import java.util.*;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.homework4.test
 * @Author: ASUS
 * @CreateTime: 2023-10-17  13:17
 * @Description: TODO
 * @Version: 1.0
 */
//主程序类，定义两个时钟对象，输入一个时间值，初始化时钟对象1，然后输出两个时钟的值。
//请在下面的【】处补充代码。

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankBusiness.welcome();
        System.out.println("请输入开户需要的姓名、密码:");
        String name=sc.next();
        String password=sc.next();
        BankBusiness account = new BankBusiness(name, password);
        //输入正确密码、存款金额
        password=sc.next();
        int money=sc.nextInt();
        account.deposit(password,money);
        //输入错误密码、取款金额
        password=sc.next();
        money=sc.nextInt();
        account.withdraw(password,money);
        //输入正确密码、大于余额的取款金额
        password=sc.next();
        money=sc.nextInt();
        account.withdraw(password,money);
        //输入正确密码、小于余额的取款金额
        password=sc.next();
        money=sc.nextInt();
        account.withdraw(password,money);
        BankBusiness.welcomeNext();
    }
}


