package popUps;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertPopUP {
     static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
          driver.navigate().to("http://www.localhost/login.do");
          Thread.sleep(2000);
          driver.findElement(By.id("username")).sendKeys("admin");
          Thread.sleep(2000);
          driver.findElement(By.name("pwd")).sendKeys("manager");
       //    WebDriverWait wait = new WebDriverWait(driver,30);	
         Thread.sleep(2000);
          driver.findElement(By.xpath("//div[text()='Login ']")).click();
          //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Login ']")));
          Thread.sleep(2000);
          driver.findElement(By.xpath("(//div[contains(@class,'popup_menu_button ')])[1]")).click();
	     Thread.sleep(2000);
         // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'popup_menu_button ')])[1]")));
	     driver.findElement(By.xpath("//a[contains(.,'Logo & Color Scheme')]")).click();
	    // logo.click();
	    Thread.sleep(2000);
	     //wait.until(ExpectedConditions.elementToBeClickable(logo));
	     driver.findElement(By.xpath("(//label[contains(text(),' Use custom logo')])[1]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[text()='Save']")).click();
	     Thread.sleep(2000);
	     Alert al = driver.switchTo().alert();
	     al.accept();
	     
	}

}
