package action1;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class composit {

	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
         driver.get("http://localhost/login.do");
	      WebElement link = driver.findElement(By.xpath(" //a[text()='actiTIME Inc.']"));
	      String t = link.getText();
	      System.out.println(t);
	     Thread.sleep(3000);
	      Actions ac = new Actions(driver);
	      ac.click().click(link).perform();
	
	}

}
