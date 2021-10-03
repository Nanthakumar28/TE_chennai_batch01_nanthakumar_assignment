package com.te.numbers;

import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		Primelogic plogic = new Primelogic();
		
		boolean res = plogic.primeTest(num);
		if (res) {
			System.out.println("Prime number");
		} else {
			System.out.println(" not a primt number");
		}
		scanner.close();
	}
}
