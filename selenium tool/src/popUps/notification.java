package popUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class notification {

	static 
	{
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver1.exe");	
	}
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
 driver.get("http://seleniumhq.org/download");
   Thread.sleep(2000);
       driver.findElement(By.xpath("(//a[text()='Download'])[1]")).sendKeys(Keys.ENTER);
      Thread.sleep(2000);
	   WebElement text = driver.findElement(By.xpath("//h3[text()='Selenium Client & WebDriver Language Bindings']"));
	 int yaxis=text.getLocation().getY();
	 Thread.sleep(2000);
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,"+yaxis+")");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//td[text()='Java']/../td[4]/a")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
   Robot r = new Robot();
   Thread.sleep(1000);
   r.keyPress(KeyEvent.VK_TAB);
   r.keyPress(KeyEvent.VK_ENTER);
	
	
	}

}
