package com.te.memberaccess;

public class StringMethods {
	
	public static void main(String[] args) {
		
		StringOperation sop = new StringOperation();
		
	    String s1 = "dhoni";
		String s2 = "shewag";
		String s3 = "dhoni";
		String s4 = "SACHIN";
		
		boolean res = sop.stringEqual(s1, s3);
		System.out.println((res == true) ? "string equal" : "string not equal");
		
		String reverseresult = sop.stringReverse(s2);
		System.out.println(reverseresult);
		
		String lowercaseseresult = sop.lowerCase(s4);
		System.out.println(lowercaseseresult);
		
		String uppercaseseresult = sop.upperCase(s2);
		System.out.println(uppercaseseresult);
		
		
		
	}

}
