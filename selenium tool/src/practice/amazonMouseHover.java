package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.lang.reflect.Executable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonMouseHover {
	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
        driver.navigate().to("http://192.168.231.128:8080");
      /* Alert al = driver.switchTo().alert();
	   String text = al.getText();
	 System.out.println("**pop up text is**"+text);
	 al.dismiss();
	*/
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("rashmi@dell.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='passWord']")).sendKeys("123456");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@title='Sign In']")).click();
	Thread.sleep(2000);
	WebElement acc = driver.findElement(By.xpath("//a[text()='Accounts']"));
	Actions al = new Actions(driver);
	al.moveToElement(acc);
	Thread.sleep(2000);
	acc.click();
	driver.findElement(By.xpath("//a[text()='Jspiders']")).click();
	Thread.sleep(2000);
	WebElement closed = driver.findElement(By.xpath("//a[text()='Closed Activities']"));
	int yaxis = closed.getLocation().getY();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,"+yaxis+")");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[text()='Quotes'])[2]/../../td[3]")).click();
	Thread.sleep(2000);
	 WebElement rash = driver.findElement(By.xpath("(//div[contains(.,'rashmi')])[4]"));
	rash.click();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	}
}
