package Naveen;

import java.io.File;
import java.util.concurrent.TimeUnit;
import.org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screensort

{

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    
		    //driver.manage().deleteAllCookies();
		    
		    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		    
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    
		    Thread.sleep(2000);
		    
		    driver.get("https://google.com");
		    
		    // in selenium , we can take screenshot using getScreenshotAs
		    
		    File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    
		    FileUtils.(src,new File("C:/Users/91988/Desktop/Resume/google.png"));
		    

	}

}
