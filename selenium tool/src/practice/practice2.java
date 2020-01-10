package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://localhost/login.do");
String t = driver.getTitle();
System.out.println("====title of the page==="+t);
String url = driver.getCurrentUrl();
System.out.println("==url of the page"+url);
String s = driver.getPageSource();
System.out.println("source"+s);
driver.findElement(By.id("username")).sendKeys("admin");
Thread.sleep(1000);
driver.findElement(By.name("pwd")).sendKeys("manager");
Thread.sleep(2000);
driver.findElement(By.xpath("//div[text()='Login ']")).click();

}


	}


