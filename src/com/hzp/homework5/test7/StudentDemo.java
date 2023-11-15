package com.hzp.homework5.test7;

class Student{
	private String name;
	private int classA,classB,classC;
	public Student(String name,int classA,int classB,int classC){
		this.name=name;
		this.classA=classA;
		this.classB=classB;
		this.classC=classC;
	}
	public String getName(){
		return name;
	}
	public int getAverage(){
		return (classA+classB+classC)/3;
	} 
}
class UnderGraduate extends Student{
	public UnderGraduate(String name,int classA,int classB,int classC){
		super(name,classA,classB,classC);
	}
	public void isPass(){
		if(getAverage()>=60)
		System.out.println("本科生"+getName()+"的三科平均分为："+getAverage()+",可以拿到学士学位。");
		else
		System.out.println("本科生"+getName()+"的三科平均分为："+getAverage()+",不能拿到学士学位。");
	} 
}
class Graduate extends Student{
	public Graduate(String name,int classA,int classB,int classC){
		super(name,classA,classB,classC);
	}
	public void isPass(){
	if(getAverage()>=80)
	System.out.println("研究生"+getName()+"的三科平均分为："+getAverage()+",可以拿到硕士学位。");
	else
	System.out.println("研究生"+getName()+"的三科平均分为："+getAverage()+",不能拿到硕士学位。");
	} 
}
public class StudentDemo{
	public static void main(String[] args){
		UnderGraduate s1=new UnderGraduate("Tom",55,75,81);
		Graduate s2=new Graduate("Mary",72,81,68);
		s1.isPass();
		s2.isPass();
	} 
}
