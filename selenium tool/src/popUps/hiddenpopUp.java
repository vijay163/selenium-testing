package popUps;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.tools.JavaFileManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hiddenpopUp {
	 static 
		{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
		}
		public static void main(String[] args) throws IOException, InterruptedException, AWTException {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			WebDriver driver=new ChromeDriver(option);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    driver.manage().window().maximize();
	         driver.get("https://www.irctc.co.in/nget/train-search");
	         Thread.sleep(2000);
	         driver.findElement(By.xpath("(//i[@class='fa fa-align-justify'])[1]")).click();
             Thread.sleep(2000);
		     driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		     Thread.sleep(2000);
		     WebElement user = driver.findElement(By.xpath("//input[@id='userId']"));
		     user.sendKeys("vijay_163",Keys.ENTER);
		     Thread.sleep(2000);
		   //hiddenpopUp h = new hiddenpopUp();
		    driver.findElement(By.xpath(" //a[contains(@class,'fa fa-window-close')]")).click();
		  
		  
		
		
		}
}