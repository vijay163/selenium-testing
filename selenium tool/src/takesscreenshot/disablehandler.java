package takesscreenshot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class disablehandler {

	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("D://selenium IDE/isdisbled.html");
	    WebElement user = driver.findElement(By.id("pandit"));
	    user.clear();
	    Thread.sleep(2000);
	     user.sendKeys("i like you");
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    Thread.sleep(2000);
	    js.executeScript("document.getElementById('hari').value='Prakash'");
	    //js.executeScript("document.get");
	    
	
}

}
