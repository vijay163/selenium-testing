package action;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class firstselected {
	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("file:///D:/selenium%20IDE/options.html");
		WebElement element = driver.findElement(By.id("hello"));
		Select s = new Select(element);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("b");
		Thread.sleep(1000);
		s.selectByIndex(4);
		Thread.sleep(3000);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	    System.out.println("**selected multiple items **"+s.isMultiple());
	    System.out.println("******************************");
	    WebElement first = s.getFirstSelectedOption();
        Thread.sleep(20000);
	    	 System.out.println("*first selected*"+first.getText());
	    	 driver.close();

	}

}
