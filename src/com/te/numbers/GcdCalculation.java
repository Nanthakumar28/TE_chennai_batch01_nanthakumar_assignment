package com.te.numbers;

public class GcdCalculation {
	
	public int gcdCalc(int num1, int num2) {
		
		int min = (num1 < num2) ? num1 : num2;
		int res = 0;
		
		while (min >= 2) {
			
			if ((num1 % min == 0) && (num2 % min == 0)) {
				 res = min;
			}
			min--;
		}
		return res;
	}

}
