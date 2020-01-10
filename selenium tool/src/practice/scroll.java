package practice;

import java.io.IOException;

import org.apache.commons.io.input.WindowsLineEndingInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.amazon.com");
	WebElement home = driver.findElement(By.xpath("//span[text()='Home Décor Under $20']/../../span[1]"));
   int ya = home.getLocation().getY();
   System.out.println(ya);
   JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,"+ya+")");

	home.click();
	}

}
