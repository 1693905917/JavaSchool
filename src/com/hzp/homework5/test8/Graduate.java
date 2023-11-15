package com.hzp.homework5.test8;

public class Graduate  implements StudentManageInterface,TeacherManageInterface{
	   private String name;
	   private String sex;
	   private int  age;
	   private double fee;
	   private double pay;
	   public Graduate() {
	   }
	   

	 public Graduate(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public Graduate(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}


	public Graduate(String name, String sex, int age, double fee, double pay) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.fee = fee;
		this.pay = pay;
	}


		@Override
	public String toString() {
		return "Graduate [name=" + name + ", sex=" + sex + ", age=" + age + ", fee=" + fee + ", pay=" + pay + "]";
	}


		public void setFee(double f) {
	        this.fee=f;
	    }

	    public double getFee() {
	        return fee;
	    }

	    public void setPay(double p) {
	        this.pay=p;
	    }

	    public double getPay() {
	        return pay;
	    }
	    
	 // 计算是否需要贷款的方法
	    public void loan() {
	        double income = pay * 12; // 年收入
	        double totalFee = fee * 2; // 总学费
	        if (income - totalFee < 2000) {
	            System.out.println("provide a loan");
	        } else {
	            System.out.println("do not provide a loan");
	        }
	    }
	
}
