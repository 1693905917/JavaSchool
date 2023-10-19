package com.hzp.JavaTest2.test8;

import java.util.Date;
import java.util.Objects;
import java.util.Random;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.JavaTest2.test8
 * @Author: ASUS
 * @CreateTime: 2023-10-19  15:06
 * @Description: TODO
 * @Version: 1.0
 */
public class Account {
    private String id;//唯一性标识 （11个长度的字符和数字的组合)
    private String name;
    private Date dateTime;
    private String password;
    private int balance;

    //初始化  不存储钱
    public  void CreateAccount(String name){
        Random random = new Random();
        this.id=String.valueOf(random);
        this.name=name;
        this.dateTime=new Date();
        this.password="123456";
        this.balance=0;
    }

    //初始化 存储钱
    public  void CreateAccount(String name,int balance){
        Random random = new Random();
        this.id=String.valueOf(random);
        this.name=name;
        this.dateTime=new Date();
        this.password="123456";
        this.balance=balance;
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

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateTime=" + dateTime +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return balance == account.balance && Objects.equals(id, account.id) && Objects.equals(name, account.name) && Objects.equals(dateTime, account.dateTime) && Objects.equals(password, account.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateTime, password, balance);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
