package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiattri {


	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://localhost/login.do");
	    WebElement userT = driver.findElement(By.xpath("//input[@id='username']"));
	     String p = userT.getAttribute("placeholder");
         System.out.println("the data is====="+p);
         System.out.println("*******************************");
        WebElement pass = driver.findElement(By.xpath("//input[@name='pwd']"));
	    String pass1 = pass.getAttribute("placeholder");
	    System.out.println("password water mark======"+pass1);
	}

}
