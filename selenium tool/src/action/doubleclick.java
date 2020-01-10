package action;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class doubleclick {

	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
        driver.get("https://www.google.com");
       //driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("vijay1.gali@gmail.com",Keys.ENTER);
       //driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8333828163",Keys.ENTER);
	  driver.findElement(By.xpath("//span[text()='QCCM12']")).click();
	}
	}
