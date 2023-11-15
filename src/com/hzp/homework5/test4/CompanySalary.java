package com.hzp.homework5.test4;

public class CompanySalary {
	public static void main(String args[]) {
		Employee [] employee=new Employee[29]; //公司有 29 名雇员
		for(int i=0;i<employee.length;i++) { //雇员简单地分成三类
		if(i%3==0)
		employee[i]=new WeekWorker();
		else if(i%3==1)
		employee[i]=new MonthWorker();
		else if(i%3==2)
		employee[i]=new YearWorker();
		} 
		Company company=new Company(employee);
		System.out.println("公司薪水总额:"+company.salariesPay()+"元");
		}
}

abstract class Employee {
	public abstract double earnings();
}
class YearWorker extends Employee {
	public  double earnings() {//重写 earnings()方法，具体薪水多少可自行取值
		return 10000;
	}
}
class MonthWorker extends Employee {
	public  double earnings() {//重写 earnings()方法，具体薪水多少可自行取值
		return 5000;
	}
} 
class WeekWorker extends Employee {
	public  double earnings() {//重写 earnings()方法，具体薪水多少可自行取值
		return 1000;
	}
}
class Company {
	Employee[] employee;
	double salaries=0;
	Company(Employee[] employee) {
	this.employee=employee;
	}
	public double salariesPay() {
	salaries=0;
	for(int i=0;i<employee.length;i++) {//计算 salaries。
		salaries+=employee[i].earnings();
	}
	return salaries;
	} 
}
