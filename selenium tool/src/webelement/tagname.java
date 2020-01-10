package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {


	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.opensourcebilling.org");
	    WebElement logo = driver.findElement(By.className("logo"));
	    String tn = logo.getTagName();
       System.out.println("tag name is========"+tn);
       WebElement userT = driver.findElement(By.id("email"));
       String tag = userT.getTagName();
	    System.out.println("tag name of the user ======="+tag);
	}
}