package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart2 {
static 
{
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http:www.flipkart.com");
	Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[contains(.,'✕')]")).click();;
	 Thread.sleep(1000);
	 driver.findElement(By.name("q")).sendKeys("Redmi Note 7S (Sapphire Blue, 64 GB)",Keys.ENTER);
	 Thread.sleep(1000);
	 String mi = driver.findElement(By.xpath("//div[text()='Redmi Note 7S (Sapphire Blue, 64 GB)']/../../../div[2]/div[2]/div[1]/div/div[2]")).getText();
	Thread.sleep(1000);
	 System.out.println("actual price of the mobile:::::"+mi);
	 Thread.sleep(3000);
	 String discount = driver.findElement(By.xpath("//div[text()='Redmi Note 7S (Sapphire Blue, 64 GB)']/../../../div[2]/div[2]/div[1]/div/div[3]")).getText();
	 System.out.println("discount on the actual price:::::"+discount);
	 Thread.sleep(2000);
	 String price = driver.findElement(By.xpath("//div[text()='Redmi Note 7S (Sapphire Blue, 64 GB)']/../../../div[2]/div[2]/div[1]/div/div[1]")).getText();
	 Thread.sleep(2000);
	 System.out.println("discount price is::::::"+price);
	 Thread.sleep(2000);
	 String warrenty = driver.findElement(By.xpath("//div[text()='Redmi Note 7S (Sapphire Blue, 64 GB)']/../../../div[2]/div[1]/div[3]/ul/li[8]")).getText();
	Thread.sleep(2000);
	System.out.println("warrenty to the mobile++++++"+warrenty);
	 driver.close();
}
}
