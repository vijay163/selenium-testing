package testNgparameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelexePassWord
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	@Test
	@Parameters({"browser","pass","url"})
	public void loginPass(String browser,String pass,String url)
	{
		Reporter.log(pass,true);
		if(browser.equals("chrome"))
		{
		WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     driver.get(url);
	     for(int i=0;i<200;i++)
	     {
	     WebElement pw = driver.findElement(By.name("pwd"));
	     pw.clear();
	     pw.sendKeys(pass);
		}
		}
		else
		{
				WebDriver driver = new FirefoxDriver();
			     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			     driver.manage().window().maximize();
			     driver.get(url);
			     for(int i=0;i<200;i++)
			     {
			     WebElement pw = driver.findElement(By.name("pwd"));
			     pw.clear();
			     pw.sendKeys(pass);
				}
		}
	}

}
