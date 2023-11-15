package com.hzp.homework5.test2;

public class BeijingPeople extends ChinaPeople {
	//重写 public void averageHeight()方法, 输出:"北京人的平均身高:172.5 厘米"
	public void averageHeight() {
		height = 172.5 ; 
		System.out.println("北京人的平均身高:"+height+" 厘米"); 
	}
	//重写 public void averageWeight()方法,输出:"北京人的平均体重:70 公斤"
	public void averageWeight() {
		 weight=70;
		 System.out.println("北京人的平均体重:"+weight+" 公斤"); 
	}
	public void beijingOpera() { 
	System.out.println("花脸、青衣、花旦和老生");
	}

}
