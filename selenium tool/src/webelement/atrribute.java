package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class atrribute {


	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.opensourcebilling.org");
	    WebElement userT = driver.findElement(By.id("email"));
          String data = userT.getAttribute("value");
          System.out.println(data);
          userT.clear();
          System.out.println("*************************");
         userT.sendKeys("vijay");
         String data1 = userT.getAttribute("value");
         System.out.println(data1);
         System.out.println("******************************");
         String idvalue = userT.getAttribute("id");
         System.out.println(idvalue);
	}

}
