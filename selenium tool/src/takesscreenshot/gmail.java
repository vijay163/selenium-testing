package takesscreenshot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vijay1.gali@gmail.com",Keys.ENTER);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8333828163",Keys.ENTER);
        Thread.sleep(2000);
	    String h = driver.getTitle(); 
         System.out.println("=====title of the home page====================="+h);
         Thread.sleep(2000);
         driver.findElement(By.xpath("//span[@class='gb_za gbii']")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//a[text()='Sign out']")).click();
	}

}
