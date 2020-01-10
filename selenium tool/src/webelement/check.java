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
public class check {


	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.opensourcebilling.org");
       WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
      check.click();
      if(check.isSelected())
      {
    	System.out.println("check box is selected");  
      }
      else
      {
    	  System.out.println("check box is not selected");
      }
      }
	
	}
