package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class absolutepath {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///D:/selenHTML/web.html");
	     WebElement customer=driver.findElement(By.xpath("//div[2]/input[1]"));
	     customer.clear();
	    customer.sendKeys("manager");
	     
	    driver.close();
	    
	    
	}

}
