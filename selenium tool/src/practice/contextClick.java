package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextClick {
	static
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
       driver.get("http://www.localhost/login.do");
     WebElement act = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")); 
     Thread.sleep(2000);
	 Actions a = new Actions(driver);
 a.contextClick(act).perform();
 Thread.sleep(2000);
 Robot r = new Robot();
	r.keyPress(KeyEvent.VK_T);
	}
}
