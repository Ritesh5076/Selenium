package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest 


{
	
	
	@Test(invocationTimeOut=2000)
	
	public void test1()
	
	{
		
		int i =1;
		
		while(i ==1)
			
		{
			
			System.out.println(i);
		}
			
		
	}

}
