package testNgParameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter2 
{
	@Test
	@Parameters({"un","pw","url","browser"})
	public void loginTest(@Optional("admin")String un,@Optional("manager")String pw,@Optional("http://localhost/login.do")String url,@Optional("chrome")String browser)
	{
		Reporter.log("**userName**"+un,true);
		Reporter.log("**passWord**"+pw,true);
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get(url);
	    driver.findElement(By.id("username")).sendKeys(un);
	    driver.findElement(By.name("pwd")).sendKeys(pw);
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	}

}
