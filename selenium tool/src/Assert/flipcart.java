package Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class flipcart
{
	public static WebDriver driver;
	@BeforeClass
	public void setDrivers()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@BeforeMethod
	public void launchBrowser()
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-Notifications");
		driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
	}
      @Test
      public void amazonLogin() throws InterruptedException
      {
    	  driver.get("http://www.myntra.com");
    	  driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("t-shirt",Keys.ENTER);
    	  WebElement item = driver.findElement(By.xpath("//span[contains(.,'1499')]"));
   	   int yaxis = item.getLocation().getY();
   	   System.out.println("yaxis");
   	   JavascriptExecutor js = (JavascriptExecutor)driver;
   	   Thread.sleep(2000);
   	   js.executeScript("window.scrollTo(0,"+yaxis+")");
   	   Thread.sleep(3000);
   	   driver.findElement(By.xpath("(//span[contains(.,'1139')])[1]")).click();

      }
     /* @AfterMethod
     public void closeApp()
      {
    	  driver.close();
      }*/
}
