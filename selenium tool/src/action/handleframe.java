package action;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handleframe {


	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("http://seleniumhq.org/download");
	    driver.findElement(By.xpath("(//a[text()='Download'])[1]")).click();
	    WebDriverWait wait = new WebDriverWait(driver,20);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Download'])[1]")));
	    WebElement text = driver.findElement(By.xpath("//h3[text()='Selenium Client & WebDriver Language Bindings']"));
      Thread.sleep(2000);
	    int yaxis = text.getLocation().getY();
	   System.out.println("*yaxis*"+yaxis);
	   //wait.until(ExpectedConditions.elementToBeSelected("//h3[text()='Selenium Client & WebDriver Language Bindings']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,"+yaxis+")");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//td[text()='Java']/../td[6]")).click();
	WebElement pack = driver.findElement(By.name("classFrame"));
	driver.switchTo().frame(pack);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='com.thoughtworks.selenium']")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='AbstractAnnotations']")));
	}

}
