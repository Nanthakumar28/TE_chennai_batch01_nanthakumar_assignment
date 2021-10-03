package com.te.numbers;


public class FactorialTest {
	
	int res = 1;
	
	public int facResult(int num) {
		
		if(num>1)
		{
			res=res*num--;
			facResult(num);
		}
		return res;
	}
}
