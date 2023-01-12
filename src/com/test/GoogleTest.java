package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest 

{
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp()
	{
		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
	     driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    
	    driver.get("https://www.google.com");
	}
	
	
	

	@Test(priority=2,groups="title")
	
	public void googleTitle () throws InterruptedException
	
	{
		
		String tit = driver.getTitle();
		
		System.out.println(tit);
		
		
	}
	
	
   @Test(priority=1,groups="Logo")
	
	public void googleLogoTest () throws InterruptedException
	
	{
		
		boolean LOGO=driver.findElement(By.xpath("//*['html/body/div[1]/div[2]/div/img']")).isDisplayed();
		
		System.out.println(LOGO);
		
		
	}

@Test(priority=3,groups="test")

public void Test1 () throws InterruptedException

{
	
	
	System.out.println("Test1");
	
	
}

@Test(priority=4,groups="test")

public void Test2 () throws InterruptedException

{
	
	
	
	System.out.println("Test2");
	
	
	
}

@Test(priority=5,groups="test")

public void Test3 () throws InterruptedException

{
	
	
	
	System.out.println("Test3");
	
	
	
}

	
	@AfterMethod
	
	public void tearDown()
	{
	driver.quit();
	
	}
	
	
	
	
	
	
	
}
