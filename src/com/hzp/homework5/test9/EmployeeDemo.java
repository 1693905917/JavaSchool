package com.hzp.homework5.test9;

abstract class Employee{
	private String name;
	public Employee(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public abstract double computeSalary();
}
class Manager extends Employee{
	private double monthSalary;
	public Manager(String name,double monthSalary){
	super(name);
	this.monthSalary=monthSalary;
	}
	public double computeSalary(){
	return monthSalary;
	} 
}
class Salesman extends Employee{
	private double baseSalary;
	private double commision;
	private int qualtities;
	public Salesman(String name,double baseSalary,double commision,int qualtities){
	super(name);
	
	this.baseSalary=baseSalary;
	this.commision=commision;
	this.qualtities=qualtities;
	}
	public double computeSalary(){
	return baseSalary+commision*qualtities;
	} 
}
class Worker extends Employee{
	private double dailySalary;
	private int days;
	public Worker(String name,double dailySalary,int days){
	super(name);
	this.dailySalary=dailySalary;
	this.days=days;
	}
	public double computeSalary(){
	return dailySalary*days;
	} 
}
public class EmployeeDemo{
	public static void main(String args[]){
	Manager e1=new Manager("张三",10000);
	Salesman e2=new Salesman("李四",2000,50.4,63);
	Worker e3=new Worker("王五",79.5,28);
	System.out.println("经理"+e1.getName()+"的月工资为："+e1.computeSalary());
	System.out.println("销售人员"+e2.getName()+"的月工资为："+e2.computeSalary());
	System.out.println("工人"+e3.getName()+"的月工资为："+e3.computeSalary());
}
	}
