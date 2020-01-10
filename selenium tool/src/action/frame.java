package action;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {



	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("file:///D:/selenium%20IDE/frame.html");
	    WebElement user = driver.findElement(By.id("hari"));
	    Thread.sleep(2000);
        user.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        Thread.sleep(2000);
        user.sendKeys("my name is ..............");
        String t = user.getAttribute("value");
        System.out.println("*text is*"+t);
	    driver.switchTo().frame(0);
	    //  driver.switchTo().frame("pwd");
        //driver.switchTo().frame("h1.html");
        WebElement pass = driver.findElement(By.id("pwd"));
        Thread.sleep(2000);
	    pass.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
	    pass.sendKeys("vijay");
	    Thread.sleep(2000);
	    String a = pass.getAttribute("value");
	    System.out.println("*text is*"+a);
	    System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	    WebElement go = driver.findElement(By.id("g"));
	    go.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	   //System.out.println("*google is displayed*"+ go.isSelected());
	  // Thread.sleep(2000);
	      driver.navigate().back();
        driver.switchTo().parentFrame();
        user.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        Thread.sleep(2000);
	    user.sendKeys("pandit lover is");
	    Thread.sleep(2000);
	    String t1 = user.getAttribute("value");
	    System.out.println("*text is*"+t1);
	    Thread.sleep(2000);
		/*driver.switchTo().frame(0);
	    pass.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
	    pass.sendKeys("chandana");
	    Thread.sleep(2000);
	    */driver.switchTo().frame(1);
	     WebElement user2 = driver.findElement(By.id("hari1"));
	     Thread.sleep(2000);
	    user2.clear();
	    user2.sendKeys("iam the king");
	    String t3 = user2.getAttribute("value");
	    System.out.println("$text in the box$"+t3);
	}

}
