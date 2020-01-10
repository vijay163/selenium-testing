package takesscreenshot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmen2 {
	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
       driver.get("http://localhost/login.do");
       driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
       driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
       Thread.sleep(2000);
       String login = driver.getTitle();
       System.out.println("================login page title=========="+login);
       driver.findElement(By.xpath("//div[text()='Login ']")).click(); 
       Thread.sleep(2000);
       String home = driver.getTitle();
      System.out.println("===================home page titile====="+home);
       Thread.sleep(2000);
       WebElement settings = driver.findElement(By.xpath("//div[contains(@class,'popup_menu_icon')]/div"));
	   if(settings.isDisplayed())
	   {
		   System.out.println("*******************settings page is diplayed******************* ");
	   }
	   else
	   {
		   System.out.println("not selected");
	   }
	   settings.click();
	   Thread.sleep(2000);
	    WebElement license = driver.findElement(By.xpath(" //a[text()='Licenses']"));
	    license.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    String l = driver.getTitle();
	   System.out.println("======================license page title==========="+l);
	    Thread.sleep(2000);
	    Thread.sleep(2000);
	    WebElement product = driver.findElement(By.xpath("//b[.='actiTIME 2017.4']"));
	    Thread.sleep(2000);
	    if(product.isDisplayed())
	    {
	    	System.out.println("================license page is displayed===========");
	    }
	    else
	    {
	    	System.out.println("not displayed");
	    }
	 
	   String p = product.getText();
	  System.out.println("================text============"+p);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[.='Logout']")).click();
	  System.err.println("*******************suceess fully created*********************");
	}
    
}
