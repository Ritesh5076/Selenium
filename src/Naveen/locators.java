package Naveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators 
{

	public static void main(String[] args) throws InterruptedException
	
	{
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	    
	    // LOCATORS  -------ID...WILL BE ALWAYS IN INVERTED COMMAS---IT RETUNS VALUE AS WEBELEMENT
	    
	   // WebElement username =driver.findElement(By.id("email"));
	   // 
	   // username.sendKeys("ritesh");
	    
	    //WebElement username2 =driver.findElement(By.id("pass"));
	    
	   // username2.sendKeys("ritesh");
	    
	    Thread.sleep(2000);
	    
	    //String RITESH= driver.findElement(By.xpath("//*[@id='u_0_4_xO']/i")).getText();
	    //System.out.println(RITESH);
	    
	    //Name
	    
	    //WebElement r1=driver.findElement(By.name("email"));
	    
	   // r1.sendKeys("ritesh");
	    
	   // WebElement r1=driver.findElement(By.xpath("//input[@id='email']"));
	   // r1.sendKeys("ritesh");
	    
	    
	    //driver.findElement(By.linkText("Sign Up")).click();
	   // r1.click();
	    
	    WebElement r1=driver.findElement(By.name("pass"));
		    r1.sendKeys("ritesh/");
	    
	    
	}

}
