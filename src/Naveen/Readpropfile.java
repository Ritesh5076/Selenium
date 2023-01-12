package Naveen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readpropfile 

{
	
	 static WebDriver driver ;

	 public static void main(String[] args) throws IOException
	
	{
		
		
		  Properties prop= new  Properties();
		  
		  FileInputStream ip = new  FileInputStream("C:/Users/91988/eclipse-workspace/Test/src/Naveen/config.properties"); 
          
		  prop.load(ip);
		  
		  System.out.println(prop.getProperty("Name"));
		  
		  System.out.println(prop.getProperty("Age"));
		  
		 String link= prop.getProperty("Url");
		 
		 System.out.println(link);
		 
		 String brow= prop.getProperty("browser");
		 
		 System.out.println(brow);
		 
		 
		 
		 if(brow.equals("Chrome"))
		 
		 {
		 
		 
		 
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			
		   driver= new ChromeDriver();
	}
	 
	 else if(brow.equals("fiefox"))
	 {
		    
		 
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			
		   driver= new ChromeDriver();
		  
	 }
		 
		 driver.get(link);
		 
		 driver.findElement(By.xpath(prop.getProperty("Firstname_xpath"))).sendKeys(prop.getProperty("Firstname"));
		 
		 driver.findElement(By.xpath(prop.getProperty("Surname_xpath"))).sendKeys(prop.getProperty("Surname"));
		 
		 driver.findElement(By.xpath(prop.getProperty("mobilenumber_xpath"))).sendKeys(prop.getProperty("mobilenumber"));
	}
	 

}
