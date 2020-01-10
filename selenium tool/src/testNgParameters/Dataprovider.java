package testNgParameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dataprovider
{
	
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	     System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
    @DataProvider
	public Object[][] invalidLogin()
	{
    	Object[][] s = new String[5][2];
    	s[0][0]="userA";
    	s[1][0]="manager";
    	
    	s[1][0]="UserB";
    	s[1][1]="manager";
    	
    	s[2][0]="userC";
    	s[2][1]="manager";
    	
    	s[3][0]="UserD";
    	s[3][1]="manager";
    	
    	s[4][0]="UserE";
    	s[4][1]="manager";
    	
    			
    	return s;		
    	
	}
	public static WebDriver driver;
	@Test(dataProvider="invalidLogin")
	@Parameters({"un","pw"})
	public void loginPage(String un,String pw) 
	{
		Reporter.log("username==="+un,true);
		Reporter.log("passWord==="+pw,true);
	    driver=new FirefoxDriver();
	    		
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     //driver.manage().window().maximize();
	     driver.get("http://localhost/login.do");
	     driver.findElement(By.id("username")).sendKeys(un);
	     driver.findElement(By.name("pwd")).sendKeys(pw);
	     driver.findElement(By.xpath("//div[text()='Login ']")).click();
	

}
}