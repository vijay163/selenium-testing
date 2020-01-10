package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author viajy
 *
 */
public class isdisabled {


	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.opensourcebilling.org");
	    WebElement clear = driver.findElement(By.id("email"));
	    Thread.sleep(1000);
	    if(clear.isDisplayed())
	    {
	    System.out.println("the user name text box is displayed");	
	    }
	    else
	    {
	    	System.out.println("the user name text box is not displayed");
	    }

}
}