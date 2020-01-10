package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class disabled {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("D://sky.html");
	WebElement user = driver.findElement(By.id("pandit"));
	String a = user.getAttribute("id");
	System.out.println("===attribute is==="+a);
	Thread.sleep(2000);
	user.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
	user.sendKeys("hello bava");
	if(user.isDisplayed())
	{
		System.out.println("user text box is displayed");
	}
	else
	{
		System.out.println("user text box disabled");
	}
	System.out.println("********************************");
	WebElement pass = driver.findElement(By.id("hari"));
	
	//pass.sendKeys("macha");
	Thread.sleep(3000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	Thread.sleep(2000);
	js.executeScript("document.getElementById('hari').value='sujay'");
	if(pass.isDisplayed())
	{
		System.out.println("user text box is displayed");
	}
	else
	{
		System.out.println("passward text box disabled");
	}
	}
}
