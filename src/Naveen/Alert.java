package Naveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert

{

	public static void main(String[] args) 
	
	
	{
		
		
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    
         driver.manage().window().maximize();
	    
	    //driver.manage().deleteAllCookies();
	    
	    
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    driver.findElement(By.name("proceed")).click();
	    
	    
	    org.openqa.selenium.Alert alert= driver.switchTo().alert();
	    
	    
	    System.out.println(alert.getText());
	    
	    alert.accept(); //click on open button
	    
	    
	    
	    //alert.dismiss(); //click on cancel button
	    
	  
	    
	    
	    
	     //org.openqa.selenium.Alert alert= driver.switchTo().alert();
	     
	     
	    
	    
	    
	    


	}

}
