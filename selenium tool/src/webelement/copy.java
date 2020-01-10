package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author vijay
 *
 */
public class copy {


	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.opensourcebilling.org");
	    WebElement user = driver.findElement(By.id("email"));
	    user.clear();
	    Thread.sleep(1000);
	    user.sendKeys("vijay",Keys.CONTROL+"ac");
	      WebElement pass = driver.findElement(By.id("password"));
	      pass.clear();
	  Thread.sleep(2000);
	  pass.sendKeys(Keys.CONTROL+"v");
	}
}