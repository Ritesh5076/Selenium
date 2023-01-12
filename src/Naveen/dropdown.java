package Naveen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown 

{

	public static void main(String[] args) throws InterruptedException 
	
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com");
	    
	    driver.findElement(By.linkText("Sign Up")).click();
	    
	    Thread.sleep(2000);
	    
	    WebElement day= driver.findElement(By.id("day"));
	    
	    
	    WebElement month= driver.findElement(By.id("month"));
	    
	    WebElement year= driver.findElement(By.id("year"));
	    
	   //Select select= new Select(day);
	    
	    //select.selectByVisibleText("10");
	    
	    Thread.sleep(2000);
	    
	    //Select Month=new Select(month);
	    
	    //Month.selectByVisibleText("May");
	    
	    Thread.sleep(2000);
	    
	    
	    //Select Year= new Select(year);
	    
	    //Year.selectByVisibleText("1990");
	    
	    //WebElement r1=  driver.findElement(By.xpath("//input[@type='radio'and @name='sex'and @value='1']"));
	    
	    //r1.click(); */
	    
	    DropDown(day,"10");
	    
	   // DropDown(month,"May");
	    //DropDown( year,"1990");
	    
	    List<WebElement> linklist= driver.findElements(By.tagName("a"));
	    
	    System.out.println(linklist.size());
	    
	   for(int i=0; i<linklist.size(); i++)
	    {
	    	System.out.println(linklist.get(i).getText());
	    }
	    
	}  
	
	    public static void DropDown(WebElement element, String value)
	    {
	    
	    	Select select= new Select(element);
	    	
	    	select.selectByVisibleText(value);
	    	
	    	//select.getOptions();
	    	
	    	System.out.println(select.isMultiple());
	    	
	    	List<WebElement> l1 =select.getOptions();
	    	System.out.println(l1.size());
	    	
	    }
	    
	   
}


