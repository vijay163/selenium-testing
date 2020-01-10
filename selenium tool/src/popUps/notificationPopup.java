package popUps;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificationPopup {
	 static 
		{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
		}
		public static void main(String[] args) throws IOException, InterruptedException, AWTException {

			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			WebDriver driver=new ChromeDriver(option);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    driver.manage().window().maximize();
	        driver.get("http://www.myntra.com");
	       
}
}