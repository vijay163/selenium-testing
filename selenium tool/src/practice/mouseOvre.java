package practice;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mouseOvre {
	 static 
		{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
		}
		public static void main(String[] args) throws IOException, InterruptedException, AWTException {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    driver.manage().window().maximize();
	        driver.get("http://www.localhost/login.do");
	         WebDriverWait wait = new WebDriverWait(driver, 20);
	        driver.findElement(By.id("username")).sendKeys("admin");
	        //wait.until(ExpectedConditions.elementToBeSelected(By.id("username")));
	       driver.findElement(By.name("pwd")).sendKeys("manager");
	       // wait.until(ExpectedConditions.elementToBeClickable(By.name("pwd")));
	       Thread.sleep(3000); 
	       driver.findElement(By.xpath("//div[text()='Login ']")).click();
           //wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//div[text()='Login ']")));
	       WebElement rep = driver.findElement(By.xpath("//div[text()='REPORTS']"));
	       Thread.sleep(2000);
	       Actions al = new Actions(driver);
		   al.moveToElement(rep).perform();
		   rep.click();
		   Thread.sleep(2000);
		   WebElement mon = driver.findElement(By.xpath("//div[text()='Monthly Billable Totals']"));
		   al.moveToElement(mon);
		
		
		
		
		
		
		
		
		}
		}        
