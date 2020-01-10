package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
static 
{
System.setProperty("webdriver.chrome.driver" ,"./driver/chromedriver.exe");	
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://www.amazon.com");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[contains(@id,'searchtextbox')]")).sendKeys("iphone",Keys.ENTER);
     Thread.sleep(1000);
     driver.findElement(By.xpath("//span[1][text()='Shop now']")).click();
     Thread.sleep(5000);
     String cost = driver.findElement(By.xpath("//a[text()='Apple Leather Case (for iPhone 11 Pro Max) - Saddle Brown']/../div[1]/span[1]")).getText();
     System.out.println("discount price for you======="+cost);
     Thread.sleep(5000);
     String original = driver.findElement(By.xpath("//a[text()='Apple Leather Case (for iPhone 11 Pro Max) - Saddle Brown']/../div[1]/span[2]")).getText();
      System.out.println("original price of the iteam============="+original);
      Thread.sleep(3000);
      String currency = driver.findElement(By.xpath("//a[text()='Apple Leather Case (for iPhone 11 Pro Max) - Saddle Brown']/../div[1]/span[1]/span/span[1]")).getText();
      System.out.println("currency symball============"+currency);
}
}
