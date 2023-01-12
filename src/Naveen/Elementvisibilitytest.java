package Naveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementvisibilitytest

{

	public static void main(String[] args) throws InterruptedException 
	
	{
		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    //driver.manage().window().maximize();
	    
	    //driver.manage().deleteAllCookies();
	    
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    
	    driver.get("https://www.facebook.com/");
	    
	    // IS DISPLAYED METHOD- is applicable for all the elements
	    
	    boolean b= driver.findElement(By.xpath("//button['@name=login and @type=button']")).isDisplayed();
	    
	    System.out.println(b);
	    
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.xpath("//*[@title='Sign up for Facebook']")).click();
	    
	    //IS Enabled
	    
	    Thread.sleep(2000);
	    boolean c=  driver.findElement(By.xpath("//*['@name=sex and @value=1']")).isEnabled();
	    
	    System.out.println(b);
	    
	    
	    
	  
	    
	    
	    

	}

}
