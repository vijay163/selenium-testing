package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author vijay
 *
 */
public class axis {


	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.opensourcebilling.org");
	    
	    Thread.sleep(1000);
	    WebElement userT = driver.findElement(By.id("email"));
	    Thread.sleep(1000);
         int uht = userT.getLocation().getX(); 
         System.out.println("hieght of the user box 'X' axis===="+uht);
         Thread.sleep(1000);
         int uhw = userT.getLocation().getY();
         System.out.println("weidht of the user box 'y ' axis===="+uhw);
	System.out.println("*********************************************");
	 WebElement userp = driver.findElement(By.id("password"));
     Thread.sleep(1000);
	 int uht1 = userp.getLocation().getX();
     System.out.println("hieght of the passward box 'x'axis===="+uht1);
     Thread.sleep(1000);
     int uhw2 = userp.getLocation().getY();
     System.out.println("weidht of the passward box 'y' axis===="+uhw2);
     System.out.println("==================================hieght of two boxes 'x'-axis ==========================");
     System.out.println(uht==uht1);
    System.out.println("====================width of the two text boxes 'y'-axis   =====================");
    System.out.println(uhw==uhw2);
         
         
}
	

}
