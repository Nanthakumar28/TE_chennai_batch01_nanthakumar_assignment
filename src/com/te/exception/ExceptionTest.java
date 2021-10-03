package com.te.exception;

public class ExceptionTest {
	
	public void validatation(String name, int age) throws InvalidAgeException {
		
		if (age >= 18) {
			System.out.println("you are eligible");
		} else {
			throw new InvalidAgeException("not eligible");
		}
	}
	
	
}
