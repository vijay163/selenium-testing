package webelement;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childsClose {


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
        System.out.println("************************************888");
     /* for(String w:WHL)
      {
    	  driver.switchTo().window(w);
    	  String s=driver.getTitle();
           System.out.println("title of the page=========================="+s);
          if(w.equals(Wh))
           {
        	   System.out.println(driver.getTitle());
           }
           else
           {
        	   driver.close();
           }
       */
       WHL.remove(Wh);
      
           for(String w:WHL)
           {
           driver.switchTo().window(w);
          String s = driver.getTitle();
          System.out.println("the closing pages are====***"+s);
          driver.close();
           }           
           
      
      }
}
