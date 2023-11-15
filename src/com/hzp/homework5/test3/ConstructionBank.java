package com.hzp.homework5.test3;

public class ConstructionBank  extends Bank {
	double year;
	public double computerInterest() {
	super.year=(int)year;
	double r = year-(int)year;
	int day=(int)(r*1000);
	double yearInterest =super.computerInterest(); //super 调用隐藏（覆盖）的 computerInterest()方法
	double dayInterest = day*0.0001*savedMoney;
	interest= yearInterest+dayInterest;
	System.out.printf("%d 元存在建设银行%d 年零%d 天的利息:%f 元\n",
	savedMoney,super.year,day,interest);
	return interest;
	}
}
