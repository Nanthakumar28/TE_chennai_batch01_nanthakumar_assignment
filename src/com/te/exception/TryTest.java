package com.te.exception;

import java.util.Scanner;

public class TryTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("enter the array size");
			int size = scanner.nextInt();
			int [] arr = new int[size];
			System.out.println("enter the array index");
			int index = scanner.nextInt();
			int num = scanner.nextInt();
			arr[index] = num;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("please give the index withih array size");
		} catch (NegativeArraySizeException e) {
			e.printStackTrace();
			System.out.println("please give the array sizw in positive number");
		}
		scanner.close();
	}
}
