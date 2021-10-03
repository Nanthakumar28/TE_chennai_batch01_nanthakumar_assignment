package com.te.bank;

public class Deposit extends Withdraw{
	
	public static void depositAmount(int damount) {
        
		accountbalance = accountbalance + damount;
		System.out.println("totalbalance is" + accountbalance);
	}
}
