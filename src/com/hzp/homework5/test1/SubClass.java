package com.hzp.homework5.test1;

public class SubClass extends SuperClass {
	 int x;
	 SubClass() {
	 super(); //调用父类的构造方法
	 x=5; //super( ) 要放在方法中的第一句
	 System.out.println("in SubClass :x="+x);
	 } 
	 void doSomething( ) {
	 super.doSomething(); //调用父类的方法
	 System.out.println("in SubClass.doSomething()");
	 System.out.println("super.x="+super.x+" sub.x="+x);
	 }
}
