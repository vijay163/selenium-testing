package Practise;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Myntra 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	@Test
	public void testCart() throws InterruptedException
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-Notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.myntra.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("t-shirts",Keys.ENTER);
	    Thread.sleep(3000);
		WebElement item = driver.findElement(By.xpath("//span[contains(.,'1499')]"));
	   int yaxis = item.getLocation().getY();
	   System.out.println("yaxis");
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   Thread.sleep(2000);
	   js.executeScript("window.scrollTo(0,"+yaxis+")");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//span[contains(.,'2974')])[1]")).click();
	}

}
