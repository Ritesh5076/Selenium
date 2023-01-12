package Naveen;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle 

{

	public static void main(String[] args) throws InterruptedException
	
	{
       System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    //driver.manage().deleteAllCookies();
	    Thread.sleep(2000);
	    
	    driver.get("http://www.popuptest.com/goodpopups.html");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id='   ']/i")).click();
	    
	    Set<String> handler = driver.getWindowHandles();
	    
	   Iterator<String>itr = handler.iterator();
	   
	   
	   //parent window id
	   
	  String  parentWindowId =itr.next();
	  
	  System.out.println(parentWindowId);
	  
	  
	  //cild window id
	  
    String  childWindowId =itr.next();
	  
	  System.out.println(childWindowId);  
	  driver.switchTo().window(childWindowId);
	  
	  System.out.println(driver.getTitle());
	  
	  
	  //dont use quiet , it will close both windows
	  
	  driver.close();
	  
	  // to comeback to parent window
	  
	  driver.switchTo().window(parentWindowId);
	  
	  System.out.println(driver.getTitle());
	  
	 
	    
	    

	}

}
