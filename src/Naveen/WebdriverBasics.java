package Naveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics

{
	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.google.com");
	    
	   String title= driver.getTitle();
	   
	   System.out.println(title);
	   
	   if(title.equals("Google"))
		   
	   {
		   System.out.println("correct title");
	   }
		   
		   else
		   {
		   
			   System.out.println("incorrect title");
	   }
	   
	   String url= driver.getCurrentUrl();
	   
	   System.out.println(url);
	   
	  // System.out.println(driver.getPageSource());
	   
	   driver.quit();
	   }
	
	}
	
	


