package com.hzp.test1;

public class Hello {
	public static void main (String args[ ]) {
		System.out.println("你好，很高兴学习 Java");  //在命令行窗口输出"你好，很高兴学习 Java"
		A a = new A();
		a.fA();
		} 
	}

class A {
		void fA() {
			System.out.println("We are students"); //命令行窗口输出"We are students"
		} 

}
