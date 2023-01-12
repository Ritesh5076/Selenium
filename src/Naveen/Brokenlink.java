package Naveen;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink


{

	public static void main(String[] args) throws InterruptedException
	
	
	{
		
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    //driver.manage().deleteAllCookies();
	    
        //page load is for loading a page
	    
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
        //	 implicitlyWait is for loading a element 
	    
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	     driver.get("https://www.freecrm.com");
	     
	     Thread.sleep(2000);
	     
	     //driver.findElement(By.name("username")).sendKeys("naveenk");;
	     
	     //driver.findElement(By.name("password")).sendKeys("test@123");;
	     
	    // driver.switchTo().frame("mainpanel");
	     
	     
	    // 1. get all the links and img
	     
	     
	    List<WebElement> li= driver.findElements(By.tagName("a"));
	    
	  System.out.println(li.size());
	    
	    Thread.sleep(2000);
	    
	    for(int i=0; i<li.size(); i++)
	    {
	   // System.out.println(li.get(i).getText());
	    	
	    	
	    
	    
	    Thread.sleep(2000);
	    
	    //System.out.println(li.get(i).getAttribute("href"));
	    }
    	
    List<WebElement>activeLinks=new ArrayList<WebElement>();
   	
   	
   	for(int i=0; i<li.size(); i++)
    {
   		
   	if(li.get(i).getAttribute("href")!=null);
   	
   	 Thread.sleep(2000);
   	
   	activeLinks.add(li.get(i));
   	
   	System.out.println(activeLinks.size());
   	
   System.out.println(activeLinks);
   	
	    }
	    
	    List<WebElement> lmg= driver.findElements(By.tagName("img"));
	    
         System.out.println(lmg.size());
	    
	    for(int i=0; i<lmg.size(); i++)
	    	
	    {
	    	
	    	System.out.println(lmg.get(i).getAttribute("img"));
	    	
	    	
	    
	    	
	    	
	    	
	    	if(lmg.get(i).getAttribute("href")!=null);
	    	
	    	 Thread.sleep(2000);
	    	
	    	activeLinks.add(lmg.get(i));
	    	
	    
	    }
	    
	    
	    //2. iterate link list
	    
	    
	  /* List<WebElement>activeLinks=new ArrayList<WebElement>();
	    
	    for(int i=0; i<li.size(); i++)
	    	
	    {
	    	
	    	if(lmg.get(i).getAttribute("href")!=null);
	    	activeLinks.add(lmg.get(i));
	    }*/
	    	
	    	
	    }
	    
	    
	    
	    
	    
	     
	     
	     
	     
	}


