package framework1;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPageTest {
	static
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
       driver.get("http://www.localhost/login.do");
	  loginPage l = new loginPage(driver);
	  Thread.sleep(2000);
	 //for valid login
	  l.setUser();
	  Thread.sleep(2000);
	  l.getUser();
	  Thread.sleep(2000);
	 l.setPass();
	 Thread.sleep(2000);
	 l.getPass();
	 Thread.sleep(2000);
	 l.getTitle();
	 Thread.sleep(2000);
	 l.setLogin();

	
	  /*System.out.println("valid logins over");
	for inavlid login case-1
	 l.setPass();
	  l.setLogin();
	 for invalid login case-2
	 l.setUser();
	 l.setLogin();
	*/}
}
