package takesscreenshot;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {
	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
       driver.get("http://localhost/login.do");
       driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//div[text()='Login ']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//a[contains(.,'USERS')]")).sendKeys(Keys.ENTER);
       Thread.sleep(1000);
      // driver.findElement(By.xpath("//div[text()='Add User']")).click();
       //Thread.sleep(2000);
       List<WebElement> boxes = driver.findElements(By.xpath("//span[contains(@class,'TTIcon')]"));
       Thread.sleep(1000);
       int count = boxes.size();
       System.out.println(count);
         for(WebElement check:boxes)
       {
        	   check.click();
        	   Thread.sleep(2000);
        	   
    	//   driver.getTitle();
    	   
       }
         Thread.sleep(2000);
    /*     for(WebElement k:boxes)
         {
        	  k.sendKeys(Keys.ZENKAKU_HANKAKU);
         }
      */   

}

}
