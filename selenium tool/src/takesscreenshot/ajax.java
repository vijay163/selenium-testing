package takesscreenshot;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ajax {
	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
        driver.get("http://www.google.com");
       driver.findElement(By.name("q")).sendKeys("java");
       Thread.sleep(2000);
	  List<WebElement> search = driver.findElements(By.xpath("//span[contains(.,'java')]"));
	   int count = search.size();
	   System.out.println("===========no.of searches in search box=============="+count);
	   Thread.sleep(2000);
	   for(WebElement s:search)
	   {
		   String t = s.getText();
	        System.out.println("*****links are the**********"+t);
	   
	   }
	   Thread.sleep(2000);
	   search.get(7).click();
	   Thread.sleep(2000);
	   String title = driver.getTitle();
	   System.out.println("==title of the pages=="+title);
	   Thread.sleep(2000);
	   List<WebElement> links = driver.findElements(By.xpath("//a[contains(.,java)]"));
	   Thread.sleep(2000);
	   int count1 = links.size();
	   System.out.println("no.of link matches are$$$$"+count1);
	   Thread.sleep(2000);
	   for(WebElement link:links)
	   {
		   String te = link.getText();
	      System.out.println("###text###"+te);
	   
	   }
	   Thread.sleep(2000);
	   driver.close();
	}
  
}
