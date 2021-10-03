package com.te.numbers;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		FactorialTest ftest = new FactorialTest();
		int num =scanner.nextInt();
		int res = ftest.facResult(num);
		System.out.println(res);
		scanner.close();
		
	}

}
