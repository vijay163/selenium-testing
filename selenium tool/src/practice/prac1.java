package practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class prac1 {
	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("http://www.amazon.com");
	    driver.findElement(By.xpath("(//input[@type='submit'])[2]")).sendKeys(Keys.ENTER);
	    WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    search.sendKeys("casualshoes",Keys.ENTER);
	    Thread.sleep(6000);
	   // driver.findElement(By.xpath()).sendKeys(Keys.ENTER);
	    
	    
    
	
}

}
