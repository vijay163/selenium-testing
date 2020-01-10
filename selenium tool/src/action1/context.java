package action1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class context {

	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
         driver.get("http://localhost/login.do");
	      WebElement link = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
	      Actions ac = new Actions(driver);
	      ac.contextClick(link).perform();
	     Robot r=new Robot();
	    // r.keyPress(KeyEvent.VK_T);
	     r.keyPress(KeyEvent.VK_W);     
	
	}

}
