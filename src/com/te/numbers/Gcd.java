package com.te.numbers;


public class Gcd {
	
	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 30;
		
		int min = (num1 < num2) ? num1 : num2;
		
		while (min >= 2) {
			
			if ((num1 % min == 0) && (num2 % min == 0)) {
				 System.out.println("The gcd  of two number is " + min);
			}
			min--;
		}
	}
}

