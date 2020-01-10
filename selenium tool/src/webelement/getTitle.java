package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver=new ChromeDriver();
	    Thread.sleep(1000);
	    driver.manage().window().maximize();
	    driver.get("http://demo.opensourcebilling.org");
	    Thread.sleep(1000);
         String title = driver.findElement(By.tagName("title")).getAttribute("textContent");
	     System.out.println(title);
	     WebElement userT = driver.findElement(By.id("email"));
         String userTV = userT.getAttribute("value");	
         WebElement pass = driver.findElement(By.id("password"));
        pass.clear();
        pass.sendKeys(userTV);
	}

}
