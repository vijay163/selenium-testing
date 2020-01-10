package popUps;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupLoad {
	static
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
       driver.get("https://www.actitime.com/contact-support");
       WebElement company = driver.findElement(By.xpath("//label[text()='Company']"));
	   int yaxis = company.getLocation().getY();
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollTo(0,"+yaxis+")");
	    String path = "C:\\Users\\Public\\Desktop\\Firefox.lnk";
	    driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys(path);
	}   
}
