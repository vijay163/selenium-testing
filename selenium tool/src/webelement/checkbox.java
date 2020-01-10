package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author vijay
 *
 */
public class checkbox {
	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	   driver.get("http://localhost/login.do");
	   Thread.sleep(1000);
    WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
    checkbox.click();
    Thread.sleep(1000);
    if(checkbox.isSelected())
     {
    	 System.out.println("checkbox is selected");
     }
     else
     {
    	 System.out.println("sorry check box is not selected");
     }
	
	
	}
}
