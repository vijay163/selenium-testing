package practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://www.naukri.com");
	//driver.navigate().back();
	String h = driver.getWindowHandle();
	String pt = driver.getTitle();
	System.out.println(pt);
    System.out.println("===parent=="+h);
    System.out.println("******************************************");
    Set<String> hs = driver.getWindowHandles();
    int hss = hs.size();
    System.out.println(hss);
    System.out.println("childs===="+hs);
    
    for(String childs:hs)
    {
   driver.switchTo().window(childs);
   String hst = driver.getTitle();
   System.out.println(hst);
   Thread.sleep(2000);
   /* if(hst.contains("Prokarma"))
    {
    	driver.close();
    }
	*/}
	}
	}