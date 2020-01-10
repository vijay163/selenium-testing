package Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class VerifieByAss 
{
	public static WebDriver driver;
	@BeforeClass
	public void setDRiver()
	{
	
	
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    System.out.println("***its From before Class********");
	}
	@BeforeMethod
	public void launchbrowser()
	{
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	System.out.println("****its From before method***");	
	}
	@Test(priority=1)
	public void login() throws InterruptedException
	{
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    Thread.sleep(2000);
	    String actual = driver.getTitle();
	    String expected="actiTIME - Enter Time-Track";
	    WebDriverWait wait = new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
	   Assert.assertEquals(actual, expected);
	   System.out.println("***title is matching From the data****");
	   System.out.println(actual);
	}
	@Test(priority=2)
	public void clickSetting()
	{
		
	}
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}

}
