package com.te.typecasting;

public class Typecast {
	
	public static void main(String[] args) {
		
		//primitivetypecating
		int a = 10;
		long b = a;         //widening
		int c = (int)b;     //narrowing
		System.out.println(c);
		
		//classcasttype casting
		//upcasting
		InterviewProcess1 iprocess1 = new InterviewProcess3();	
		iprocess1.aptitude();
		
		//Downcasting
		InterviewProcess3 iprocess3 = (InterviewProcess3) iprocess1;
		iprocess3.aptitude();
		iprocess3.techicalround();
		iprocess3.hrRound();
	}
}
