package Naveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemovements 

{

	public static void main(String[] args)
	
	{
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    //driver.manage().deleteAllCookies();
	    
	    driver.get("https://www.facebook.com/.com");
	    
	     WebElement mab= driver.findElement(By.linkText("Sign Up"));
	     
		    Actions act= new Actions(driver);
		    
		    act.doubleClick(mab).build().perform();
		    
		   // act.contextClick(mab).build().perform();

	}

}
