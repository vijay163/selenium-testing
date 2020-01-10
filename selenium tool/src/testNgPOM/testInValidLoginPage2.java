package testNgPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testInValidLoginPage2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@Test
	public void validLogin() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");

		ActitimeLoginPage lp = new ActitimeLoginPage(driver);
		lp.setUserName("mahesh");
		lp.setPass("manager");
		lp.clickLogin();
		lp.errorMsg();
		Thread.sleep(1000);

		lp.setUserName("1234");
		lp.setPass("4567");
		lp.clickLogin();
		lp.errorMsg();
		Thread.sleep(3000);
		lp.setUserName("admin");
		lp.clickLogin();
		lp.errorMsg();
	}
}
