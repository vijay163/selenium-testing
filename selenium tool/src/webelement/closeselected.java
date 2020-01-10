package webelement;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeselected {

	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
        driver.get("http://www.naukri.com");
        String titleH = driver.getTitle();
        System.out.println("title of the home page"+titleH);
        String Wh = driver.getWindowHandle();
        System.out.println(Wh);
        Set<String> WHL = driver.getWindowHandles();
        System.out.println(WHL);
        int count = WHL.size();
        System.out.println("no of sub pages present in "+count);
        System.out.println("*******************************************");
         for(String w:WHL)
         {
        	driver.switchTo().window(w);
        	String t = driver.getTitle();
        	System.out.println(t);
            if(t.contains("Prokarma"))
            {
            	driver.close();
            }
              WHL.size();
         }
         driver.quit();
         }

}