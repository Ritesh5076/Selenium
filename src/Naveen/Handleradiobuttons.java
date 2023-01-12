package Naveen;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleradiobuttons 

{

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		//driver.manage().window().fullscreen();
		
		List<WebElement>radio = driver.findElements(By.xpath("//input[@name='lang'and @type='radio']"));
		
		
		for (int i=0 ;i<radio.size(); i++)
		{
			System.out.println(radio.size());
			
			Thread.sleep(2000);
			
			System.out.println(radio.get(i).getAttribute("value"));
			
			
			
		}
		
		
		
          List<WebElement>check = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		
		for (int i=0 ;i<check.size(); i++)
		{
			System.out.println(check.size());
			
			
		}
	}

}
