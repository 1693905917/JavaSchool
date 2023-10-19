package com.hzp.JavaTest2.test8;

import java.util.Scanner;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.JavaTest2.test8
 * @Author: ASUS
 * @CreateTime: 2023-10-19  15:20
 * @Description: TODO
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        int balance=0;
        String password;
        System.out.println("为您申请开会，请输入个人信息:");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        balance=sc.nextInt();
        Account account = new Account();
        //给用户开户
        if(balance>0){
            account.CreateAccount(name,balance);
        }else{
            account.CreateAccount(name);
        }
        //存款
        System.out.println("用户存款中:---------");
        System.out.println("请输入金额:");
        balance=sc.nextInt();
        System.out.println("请输入密码:");
        password=sc.next();
        account.deposit(password,balance);

        //用户修改密码:
        System.out.println("用户修改密码中:---------");
        password=sc.next();
        account.setPassword(password);

        //存款
        System.out.println("用户取款中:---------");
        System.out.println("请输入金额:");
        balance=sc.nextInt();
        System.out.println("请输入密码:");
        password=sc.next();
        account.withdraw(password,balance);

        //查询信息
        System.out.println("获取当前用户信息："+account.toString());


    }
}
