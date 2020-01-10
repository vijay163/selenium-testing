package practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://www.amazon.in");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple iPhone 11 (64GB) - Black",Keys.ENTER);
    Thread.sleep(5000);
	//driver.findElement(By.xpath("//span[text()='Shop now']")).sendKeys(Keys.ENTER);
    WebElement t = driver.findElement(By.xpath("//span[text()='Apple iPhone 6s (32GB) - Space Grey']/../../../../../../../div[2]/div[1]/div/div[1]/div[2]/div/a/span[1]"));
	String text = t.getText();
	System.out.println(text);
  TakesScreenshot ts=(TakesScreenshot)driver;
   File src = ts.getScreenshotAs(OutputType.FILE);
         File des = new File("./screenshot/amazon.png");
         FileUtils.copyFile(src, des);
	}
}
