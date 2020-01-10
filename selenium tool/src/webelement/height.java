package webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author vijay
 *
 */
public class height {

	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.opensourcebilling.org");
	    
	    Thread.sleep(1000);
	    WebElement userT = driver.findElement(By.id("email"));
	    Thread.sleep(1000);
         int uht = userT.getSize().getHeight(); 
         System.out.println("hieght of the user box===="+uht);
         Thread.sleep(1000);
         int uhw = userT.getSize().getWidth();
         System.out.println("weidht of the user box===="+uhw);
	System.out.println("*********************************************");
	 WebElement userp = driver.findElement(By.id("password"));
     Thread.sleep(1000);
	 int uht1 = userp.getSize().getHeight(); 
     System.out.println("hieght of the passward box===="+uht1);
     Thread.sleep(1000);
     int uhw2 = userp.getSize().getWidth();
     System.out.println("weidht of the passward box===="+uhw2);
     System.out.println("==================================hieght of two boxes==========================");
     System.out.println(uht==uht1);
    System.out.println("====================width of the two text boxes=====================");
    System.out.println(uhw==uhw2);        
}
	
}