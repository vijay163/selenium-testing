package practice;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assigment2 {
	static
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
       driver.get("http://www.localhost/login.do");
       Thread.sleep(2000);
       driver.navigate().refresh();
       driver.findElement(By.id("username")).sendKeys("admin");
       Thread.sleep(2000);
       driver.findElement(By.name("pwd")).sendKeys("manager");
       Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
}
