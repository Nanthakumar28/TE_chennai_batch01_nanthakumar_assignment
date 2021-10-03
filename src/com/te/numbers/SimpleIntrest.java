package com.te.numbers;

import java.util.Scanner;

public class SimpleIntrest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		SimpleIntCalc sic = new SimpleIntCalc();
		
		System.out.println("enter the amount");
		int amt = scanner.nextInt();
		System.out.println("enter the rate");
		float rate = scanner.nextFloat();
		System.out.println("enter the months or year");
		int year = scanner.nextInt();
		
		float result = sic.siCalulation(amt, rate, year);
		System.out.println("The Simple intrest is " + result);
		scanner.close();
	}
	
	

}
