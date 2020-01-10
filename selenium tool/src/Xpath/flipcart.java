package Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;

import net.bytebuddy.asm.Advice.Enter;

public class flipcart {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	//WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
    driver.navigate().to("http://www.flipkart.com");
    Thread.sleep(2000);
 driver.findElement(By.xpath("//button[contains(.,'✕')]")).click();
 Thread.sleep(2000);
 driver.findElement(By.name("q")).sendKeys("Apple Iphone XR (White, 64 GB)",Keys.ENTER);
 Thread.sleep(3000);
 String actualP = driver.findElement(By.xpath("//div[text()='Apple iPhone XR (White, 64 GB)']/../../../div[2]/div[2]/div/div/div[2]")).getText();
Thread.sleep(3000);
 System.out.println(actualP);
 driver.close();
}
}
