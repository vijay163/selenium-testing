package action;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class teest1 {

	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
    	  driver.get("http://192.168.231.128:8080");
    	  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("rashmi@dell.com");
    	  driver.findElement(By.xpath("//input[@id='passWord']")).sendKeys("123456");
    	  Thread.sleep(1000);
    	  String home = driver.getTitle();
    	  System.out.println("====title of the home page==="+home);
    	  WebElement sign = driver.findElement(By.xpath("//input[@title='Sign In']"));
    	  sign .sendKeys(Keys.ENTER);
    	  Thread.sleep(1000);
    	//  boolean select = sign.isSelected();
    	  //System.out.println("===is that page status==="+select);
    	  WebElement rep = driver.findElement(By.xpath("//a[text()='Reports']"));
    	  Thread.sleep(1000);
      Actions ac = new Actions(driver);
	  ac.moveToElement(rep).perform();
	  rep.click();
      WebElement cap = driver.findElement(By.xpath("//a[text()='Campaign Reports']"));	
      Thread.sleep(2000);
	  int yaxis = cap.getLocation().getY();
	   System.out.println("==y-axis==="+yaxis);
	   Thread.sleep(2000);
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0,"+yaxis+")");
	   driver.findElement(By.xpath("//a[text()='Vendor Reports']")).sendKeys(Keys.ENTER);
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[text()='Amount by Vendors']")).sendKeys(Keys.ENTER);
	   Thread.sleep(2000);
	   String ph = driver.findElement(By.xpath("//span[text()='rashu (1)']/../../../td[3]")).getText();
	   System.out.println("*email id of that person*"+ph);
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[contains(.,'Logout [rashmi@dell.com]')]")).sendKeys(Keys.ENTER);
	}

}
