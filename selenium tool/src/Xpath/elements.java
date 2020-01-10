package Xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elements {
static 
{
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
     
    //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  // driver.get("http://www.google.com");
   driver.get("D://selenium IDE/facebook.html");
   driver.findElement(By.xpath("//a[@id='a']")).click();
     Thread.sleep(1000);     
     List<WebElement> links = driver.findElements(By.xpath("//a"));
   
     
     System.out.println(links);
     int count = links.size();
     System.out.println(count);
    for(WebElement link:links)
     {
    	 String l = link.getText();
    	 System.out.println(l);
     }


}
}