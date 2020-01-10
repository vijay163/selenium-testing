package testNgparameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class parallelexe2 
{
  

static
   {
	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	   System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
   }
   
   @Test
  @Parameters({"browser","user","url"})
   public void loginPageTest(String browser,String user,String url)
   {
	   Reporter.log("UserName=="+user,true);
	  // Reporter.log("passWord=="+pass,true);
	   if(browser.equals("chrome"))
	   {
    WebDriver driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   driver.manage().window().maximize();
   driver.get(url);
   for(int i=0;i<200;i++)
   {
      WebElement u = driver.findElement(By.id("username"));
      u.clear();
    u.sendKeys(user);
  /* driver.findElement(By.name("pwd")).sendKeys(pass);
   driver.findElement(By.xpath("//div[text()='Login ']")).click();
   */}
	   }
	   else
	  {
	   Reporter.log("UserName=="+user,true);
	   //Reporter.log("passWord=="+pass,true);
    WebDriver driver1=new FirefoxDriver();
   driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   driver1.manage().window().maximize();
   driver1.get(url);
   for(int i=0;i<200;i++)
   {
    WebElement u1 = driver1.findElement(By.id("username"));
    u1.clear();
    u1.sendKeys(user);
  /* driver1.findElement(By.name("pwd")).sendKeys(pass);
   driver1.findElement(By.xpath("//div[text()='Login ']")).click();
   */}
	  }
}
}
