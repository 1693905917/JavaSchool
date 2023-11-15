package com.hzp.homework5.test5;

interface DogState {
	public void showState();
}
class SoftlyState implements DogState {
public void showState() {
	System.out.println("听主人的命令");//可按照此句的语句模式编写其它类中的此方法
	} 
}
class MeetEnemyState implements DogState {
	public void showState() {
		System.out.println("进行攻击，保护主人");
	} //重写 public void showState()
} 

class MeetFriendState implements DogState {
	public void showState() {
		System.out.println("Friend摇尾巴");
	} //重写 public void showState()方法
}
class MeetAnotherDog implements DogState {
	public void showState() {
		System.out.println("AnotherDog摇尾巴");
	}  //重写 public void showState()方法
}
class Dog {
	DogState state;
	public void show() {
		state.showState();
	}
	public void setState(DogState s) {
		state = s;
	} 
}
public class CheckDogState {
	public static void main(String args[]) {
	Dog yellowDog =new Dog();
	System.out.print("狗在主人面前:");
	yellowDog.setState(new SoftlyState());
	yellowDog.show();
	System.out.print("狗遇到敌人:");
	yellowDog.setState(new MeetEnemyState());
	yellowDog.show();
	System.out.print("狗遇到朋友:");
	yellowDog.setState(new MeetFriendState());
	yellowDog.show(); 
	System.out.print("狗遇到同伴:");
	yellowDog.setState(new MeetAnotherDog());
	yellowDog.show(); 
	} 
}
