package Naveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload

{

	public static void main(String[] args)
	
	{

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("http://html.com/input-type/");
	    
         driver.manage().window().maximize();
         
         //please dont click on browse/upload/attach  button, just give its xpath and directly use  sendkeys
         
         driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("address of the file");
	    

	}

}
