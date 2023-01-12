package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics 

{
	@BeforeSuite
	
public void setUp()
	
	{
		
		System.out.println("setup system property for chrome");
		
		}
	
	
	
	@BeforeClass
	
	public void launchbrowser()
	
	{
		
		System.out.println("open chrome browser");
		
		}
	
	/*
          @BeforeTestCase
          @Test1
          @AfterTestCase
          

           @BeforeTestCase
           @Test2
           @AfterTestCase
           
           
           @BeforeTestCase
           @Test2
           @AfterTestCase
           
           
           1. @Beforesuite
           2. @BeforeTest
           3. @BeforeClass
           
           


	 */
	
	@BeforeMethod
	
	public void enterUrl()
	
	{
		
		System.out.println("enter url");
	}
	
	@BeforeTest
	
	public void login()
	
	{
		System.out.println("login");
		
	}
	
	@Test
	
   public void googleTitleTest()
	
	{
		System.out.println("google title test");
		
	}
	
   @AfterMethod
	
	public void logOut()
	
	{
		
		System.out.println("logout");
	}
   
   @AfterTest
	
  	public void deleteAllCookies()
  	
  	{
  		
  		System.out.println("deleteAllCookie");
  	}
   
   
   @AfterClass
	
 	public void closeBrowser()
 	
 	{
 		
 		System.out.println("closeBrowser");
 	} 

}
