package webdriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri2 {
	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
		String wh = driver.getWindowHandle();
		System.out.println("reference of the page==="+wh);
		System.out.println("******************");
		Set<String> whs = driver.getWindowHandles();
	   System.out.println(whs); 
	    int	count=whs.size();
	    System.out.println(count);
	    
	     for(String w:whs)
	     {
	    	 driver.switchTo().window(w);
	
	    	 if(w.equals(wh))
	    	 {
	        	 String title=driver.getTitle();
		    	 System.out.println(title);
		    	
	    	 }
	    	 else {
	    		 driver.close();
	    	 }
	    		 
	     }
	}

}
