package Naveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandling 
{

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		
       System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    //driver.manage().deleteAllCookies();
	    
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS );
	    
	    driver.get("https://freecrm.com/");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("username")).sendKeys("naveenk");
	    
	    driver.findElement(By.name("password")).sendKeys("test@123");
	    
	    driver.findElement(By.xpath("//*input[@type='submit']"));
	    
	    driver.switchTo().frame("mainpanel");
	    
	    driver.findElement(By.xpath("//*a[@text()='Contacts']")).click();
	    
	    
	    
	    
	    
	    
	    

	}

}
