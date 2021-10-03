package com.te.exception;

import java.util.Scanner;

public class UserDefinedexp {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ExceptionTest etest = new ExceptionTest();
		
		System.out.println("Enter the name");
		String name = scanner.next();
		System.out.println("enter the age");
		int age = scanner.nextInt();
		
		try {
			etest.validatation(name, age);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		scanner.close();
		
		
		
	}
}
