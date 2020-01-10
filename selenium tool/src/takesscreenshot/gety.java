package takesscreenshot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gety {


	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
         driver.get("http://localhost/license.jsp;jsessionid=owuu7lqmcb5l");
         Thread.sleep(3000);
         WebElement tr = driver.findElement(By.xpath("//h2[text()='7. Termination']"));
         int ya = tr.getLocation().getY();
         JavascriptExecutor js = (JavascriptExecutor)driver;
         Thread.sleep(1000);
	     js.executeScript("window.scrollTo(0,"+ya+")");
	     System.out.println(ya);
	}

}
