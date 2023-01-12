package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest 

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
	
	
	

	@Test
	
	public void googleTitle () throws InterruptedException
	
	{
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Assert.assertEquals(title, "Google123");
		
		
	}
	
public void googleLogoTest () throws InterruptedException
	
	{
		
		boolean LOGO=driver.findElement(By.xpath("//*['html/body/div[1]/div[2]/div/img']")).isDisplayed();
		
		System.out.println(LOGO);
		
		Assert.assertTrue(LOGO);
		
		
	}
	

	@AfterMethod
	
	public void tearDown()
	{
	driver.quit();
	
	}

}
