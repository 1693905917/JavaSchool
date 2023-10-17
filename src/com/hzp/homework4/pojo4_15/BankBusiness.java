package com.hzp.homework4.pojo4_15;

import java.util.Objects;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.homework4.pojo4_15
 * @Author: ASUS
 * @CreateTime: 2023-10-17  18:04
 * @Description: TODO
 * @Version: 1.0
 */
public class BankBusiness {
    public static String bankName;
    private String name;
    private String password;
    private int balance;

    static {
        bankName="中国银行";
    }

    public BankBusiness() {
        //bankName="中国银行";
    }

    //完成开户操作
    public BankBusiness(String name, String password) {
        this.name = name;
        this.password = password;
        this.balance=0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankBusiness that = (BankBusiness) o;
        return balance == that.balance && Objects.equals(name, that.name) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, balance);
    }

    public static void welcome(){
        //bankName="中国银行";
        System.out.println(bankName+"欢迎您的到来！");
    }
    public static void welcomeNext(){
        System.out.println("请收好您的证件和物品，欢迎您下次光临！");
    }
    //存款操作
    public void deposit(String password,int money){
        if(this.password.equals(password)){
            this.balance+=money;
            System.out.println("您的余额有"+this.balance+".0元。");
            //return 1;
        }else {
            System.out.println("您的密码错误！");
           //return 0;
        }
    }

    //取款操作
    public void withdraw(String password,int money){
        if(this.password.equals(password)){
            if(money>this.balance){
                System.out.println("您的余额不足！");
            }else{
                this.balance-=money;
                System.out.println("请取走钞票，您的余额还有"+this.balance+".0元。");
            }
        }else {
            System.out.println("您的密码错误！");
        }
    }



}
