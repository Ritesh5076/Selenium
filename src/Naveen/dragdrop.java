package Naveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop 

{

	public static void main(String[] args) throws InterruptedException
	
	{
		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    //driver.manage().deleteAllCookies();
	    
	    driver.get("https://jqueryui.com/droppable/");
	    
	    Thread.sleep(2000);
	    
	    driver.switchTo().frame(0);

	    Actions act= new Actions(driver);
	    
	    act.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
	    
	    
	    
	    
	    
	    
		

	}

}
