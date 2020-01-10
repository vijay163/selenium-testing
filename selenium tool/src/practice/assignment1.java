package practice;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {
	static
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
       driver.get("http://www.localhost/login.do");
	   driver.findElement(By.id("username")).sendKeys("macha");
	   Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[text()='Login ']")).click();
	  Thread.sleep(2000);
	  WebElement error = driver.findElement(By.xpath("(//span[@class='errormsg'])[1]"));
	  Thread.sleep(2000);
	  System.out.println("*error massage is**"+error.getAttribute("textContent"));
	  Thread.sleep(2000);
	  System.out.println("**error message is displayed**"+error.isDisplayed());
	  TakesScreenshot pic = (TakesScreenshot)driver;
	  Thread.sleep(2000);
	  File src = pic.getScreenshotAs(OutputType.FILE);
	  File des = new File("./screenshot/error.png");
	  Thread.sleep(2000);
	FileUtils.copyFile(src, des);
	}
}
