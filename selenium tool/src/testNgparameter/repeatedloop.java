package testNgparameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class repeatedloop 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	@Test
	@Parameters({"user","url"})
	public void repeat(String user,String url)
	{
	
		Reporter.log("User Name++"+user,true);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		for(int i=0;i<200;i++)
		{
		 WebElement usrt = driver.findElement(By.id("username"));
		 usrt.clear();
		usrt.sendKeys(user);
		
	}
	

}
}