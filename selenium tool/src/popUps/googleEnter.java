package popUps;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleEnter {
	 static 
		{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
		}
		public static void main(String[] args) throws IOException, InterruptedException, AWTException {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    driver.manage().window().maximize();
	        driver.get("http://www.google.com");
	        WebElement ac = driver.switchTo().activeElement();
            ac.sendKeys("facebook.com",Keys.ENTER);
		}
}