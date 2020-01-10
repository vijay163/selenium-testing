package practice;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://www.google.in");
	Thread.sleep(3000);
	List<WebElement> element = driver.findElements(By.xpath("//a"));
	Thread.sleep(3000);
	int s = element.size();
	System.out.println("===no.of elements are===="+s);
	System.out.println(element);
	for(WebElement e:element)
	{
	   String el = e.getText();	
	   System.out.println("++elements===="+el);
	}

}
}
