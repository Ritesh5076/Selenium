package Naveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreensortnavigate

{

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    
		    //driver.manage().deleteAllCookies();
		    
		    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		    
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    
		    Thread.sleep(2000);
		    
		    driver.get("https://google.com");
		    
		    driver.navigate().to("https://amazon.com");
		    
		    Thread.sleep(2000);
		    
		    driver.navigate().back();
		    
		   
		     Thread.sleep(2000);
		    
		    driver.navigate().forward();
		    
		    Thread.sleep(2000);
		    
		    driver.navigate().back();
		    
		    driver.navigate().refresh();
		    
	}

}
