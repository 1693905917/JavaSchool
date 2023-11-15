package com.hzp.homework5.test3;

public class SaveMoney {
	public static void main(String args[]) {
		int amount=8000;
		ConstructionBank bank1 = new ConstructionBank();
		bank1.savedMoney = amount;
		bank1.year = 8.236;
		bank1.setInterestRate(0.035);
		double interest1 = bank1.computerInterest();
		BankOfChina bank2 = new BankOfChina();
		bank2.savedMoney = amount;
		bank2.year = 8.236;
		bank2.setInterestRate(0.035);
		double interest2=bank2.computerInterest();
		System.out.printf("两个银行利息相差%f 元\n",interest2-interest1);
		}
}
