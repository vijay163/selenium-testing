package action;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {


	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
        driver.get("http://www.vtiger.com");
        WebElement res = driver.findElement(By.xpath("//a[text()='Resources']"));
         Actions ac = new Actions(driver);
         ac.moveToElement(res).perform();
         driver.findElement(By.xpath("//a[text()='Contact']")).click();
         WebElement other = driver.findElement(By.xpath("//span[text()='Other Communication']"));
	     int loc = other.getLocation().getY();
	     System.out.println("=====location of the others text===="+loc);
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	     js.executeScript("window.scrollTo(0,"+loc+")");
	     WebElement phno = driver.findElement(By.xpath("//div[text()='Human Resources']/../div[2]"));
	     Thread.sleep(2000);
	     String t = phno.getText();
	     System.out.println("===phone number of the HR====="+t);
	    driver.quit();
	}

}
