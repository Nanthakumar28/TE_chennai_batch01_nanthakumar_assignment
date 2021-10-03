package com.te.bank;

public class Withdraw extends BankDetails{

	public static void withdrawProcess(int amount) {
		
		if (accountbalance > amount) {
			System.out.println("withdraw success");
			accountbalance = accountbalance - amount;
			System.out.println("remaining amount is:" + accountbalance);
		} else {
			System.out.println("withdraw not success");
		}
		
	}
}
