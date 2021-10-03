package com.te.numbers;

public class SumOfNumbers {

	public static void main(String[] args) {

		int sum = 0;
		int count = 0;

		for (int i = 0; i < args.length; i++) {
			sum = sum + Integer.parseInt(args[i]);
			count++;
		}
		System.out.println(sum);
		int avg = sum / count;
		System.out.println(avg);

	}
}