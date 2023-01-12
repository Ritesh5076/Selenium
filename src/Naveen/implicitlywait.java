package Naveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitlywait 

{

	public static void main(String[] args)
	
	{
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.google.com");
	    
	    
          driver.manage().window().maximize();
	    
	    //driver.manage().deleteAllCookies();
	    
	    //page load is for loading a page
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
        //	 implicitlyWait is for loading a element   
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	    

	}

}
