package com.te.memberaccess;

public class StringOperation {
	
	public boolean stringEqual(String str1, String str2) {
		
		return (str1.equals(str2) ? true : false);
	}
    
    public String stringReverse(String str) {
		
		StringBuilder s2 = new StringBuilder(str);
		s2.reverse();
		return s2.toString();
	}
    
    public String lowerCase(String str) {
		
    	return str.toLowerCase();
	}
    
    public String upperCase(String str) {
		
    	return str.toUpperCase();
	}
}
