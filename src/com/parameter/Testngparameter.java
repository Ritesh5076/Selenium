package com.parameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngparameter 

{

	WebDriver driver;
	
	@Test
	
	@Parameters({"url" , "Username" , "Password"})
	
	public void facebook( String url, String Username , String Password)
	
	{
		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
	     driver = new ChromeDriver();
	    
	     driver.get(url);
	     
	     driver.findElement(By.xpath("//input[@name='email' and @id='email']")).sendKeys(Username);
	     
	     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	     
	     driver.findElement(By.xpath("//input[@name='pass' and @id='pass']")).sendKeys(Password);
	     
	     driver.findElement(By.xpath("//button[@name='login' and @type='submit']")).click();;
	     
	     
	     
	    
		
	}
	
	
}
