package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngFeatures 


{
	


	
	
    @Test
	
	public void loginTest () throws InterruptedException
	
	{
		
		
		
		System.out.println("logintest");
		
		int i=9/0;
		
		
	}
	
   @Test(dependsOnMethods="loginTest")
	
	public void homePageTest () throws InterruptedException
	
	{
		
		
		
		System.out.println("homePage");
		
		
	}

//@Test

//public void searchPageTest () throws InterruptedException

 //{
	
	
	
	//System.out.println("searchPge");
	
	
}

//}
