package testNgparameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class invalidLogin 
{
	

	static
	   {
		   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		   System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	   }
	 @DataProvider
	 public String[][] dataValue()
	 {
	 String[][] s=new String[5][2];
	 s[0][0]="userA";
	 s[0][1]="1234";
	 
	 s[1][0]="userB";
	 s[1][1]="243";
	 
	 s[2][0]="userC";
	 s[2][1]="456";
	 
	 s[3][0]="userD";
	 s[3][1]="678";
	 
	 s[4][0]="userE";
	 s[4][1]="896";
	 return s;
		 
	 }
	   
	   @Test(dataProvider="dataValue")
	   @Parameters({"user","pass"})
	   public void loginPageTest(String user,String pass)
	   {
		   
		   Reporter.log("UserName=="+user,true);
		   Reporter.log("passWord=="+pass,true);
	    WebDriver driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   driver.get("http://localhost/login.do");
	   driver.findElement(By.id("username")).sendKeys(user);
	   driver.findElement(By.name("pwd")).sendKeys(pass);
	   driver.findElement(By.xpath("//div[text()='Login ']")).click();
	 

}
}
