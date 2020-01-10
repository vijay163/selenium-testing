package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id {
static 
{
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///d:/selenHTML/youtube.html");
driver.findElement(By.id("vijay")).click();
}
}
