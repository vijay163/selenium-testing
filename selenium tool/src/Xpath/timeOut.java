package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.remote.server.handler.WebElementHandler;

public class timeOut {
static
{
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://www.facebook.com");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8333828163",Keys.ENTER);
    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("vijay1",Keys.ENTER);
   // driver.findElement(By.xpath("//input[@value='Log In']")).click();
    Thread.sleep(3000);
     List<WebElement> links = driver.findElements(By.xpath("//a"));
    Thread.sleep(2000);
     int s1 = links.size(); 
    System.out.println("number of links in the webpage======="+s1);
    Thread.sleep(2000);
    for(WebElement link:links)
    {
    	String title = driver.getTitle();
        System.out.println("titles of the webelements======"+title);
    }
    
//driver.findElement(By.xpath("//li[contains(.,'Log Out')]")).click();

}
}
