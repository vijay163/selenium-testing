package framework1;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.NewSessionPipeline;
import org.openqa.selenium.support.PageFactory;

public class loginPageTest1 {
	static
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
       driver.get("http://localhost/login.do");
       Thread.sleep(2000);
	   loginPage1 l1=new loginPage1();
	   PageFactory.initElements(driver,l1);
	   l1.setUser("admin");
	   Thread.sleep(2000);
	   l1.setPass("manager");
	   Thread.sleep(2000);
	   l1.setLogin();
	
	}

}
