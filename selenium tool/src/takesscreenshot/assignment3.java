package takesscreenshot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment3 {

	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
       driver.get("http://localhost/login.do");
       driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
       driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
       WebDriverWait wait=new WebDriverWait(driver,20);
       wait.until(ExpectedConditions.titleContains("actiTIME - Login"));
       String login = driver.getTitle();
       System.out.println("================login page title=========="+login);
       driver.findElement(By.xpath("//div[text()='Login ']")).click(); 
       wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
       String home = driver.getTitle();
      System.out.println("===================home page titile====="+home);
      
       WebElement settings = driver.findElement(By.xpath("//div[contains(@class,'popup_menu_icon')]/div"));
	   if(settings.isDisplayed())
	   {
		   System.out.println("*******************settings page is diplayed******************* ");
	   }
	   else
	   {
		   System.out.println("not selected");
	   }
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'popup_menu_icon')]/div")));
	   settings.click();
	    WebElement license = driver.findElement(By.xpath(" //a[text()='Licenses']"));
	   license.sendKeys(Keys.ENTER);
	    wait.until(ExpectedConditions.titleContains("actiTIME - Licenses"));
	    String l = driver.getTitle();
	   System.out.println("======================license page title==========="+l);
	    WebElement product = driver.findElement(By.xpath("//b[.='actiTIME 2017.4']"));
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
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='Logout']")));
	  driver.findElement(By.xpath("//a[.='Logout']")).click();
	  System.err.println("*******************suceess fully created*********************");
	

}
}