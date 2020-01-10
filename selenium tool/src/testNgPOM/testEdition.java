package testNgPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testEdition {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void validLogin() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		ActitimeLoginPage lp=new ActitimeLoginPage(driver);
		lp.setUserName("admin");
		lp.setPass("manager");
	    lp.clickLogin();
	    Thread.sleep(2000);
	    ProductvarPage pv = new ProductvarPage(driver);
	    pv.clickSetings();
	    pv.clickLic();
	    pv.getEdition();
	}
}
