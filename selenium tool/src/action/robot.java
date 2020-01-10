package action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robot {

	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);				
	    driver.manage().window().maximize();
         Robot r=new Robot();
         r.keyPress(KeyEvent.VK_H);
         r.keyPress(KeyEvent.VK_SHIFT);
         Thread.sleep(1000);
         r.keyPress(KeyEvent.VK_SHIFT);
         r.keyPress(KeyEvent.VK_I);
         for(int i=10;i<=500;i=+10)
         {
        	 r.mouseMove(200+i, 500);
        	 Thread.sleep(1000);
         }
         
		}

}
