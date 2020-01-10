package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {


	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://localhost/login.do");
	    WebElement userT = driver.findElement(By.id("username"));
	    String size = userT.getCssValue("font-size");
        System.out.println("font size is==="+size);
        System.out.println("*****************************");
        String color = userT.getCssValue("color");
	     System.out.println("color of the data======="+color);
	     System.out.println("******************************");
	     String text = userT.getCssValue("font-family");
	     System.out.println("text type is===="+text);
	     System.out.println("****************************************");
	    WebElement pass = driver.findElement(By.name("pwd"));
	    pass.sendKeys("jai balayya");   
	    String size1 = pass.getCssValue("font-size");
	    System.out.println("size of the element*************"+size);
	   String style = pass.getCssValue("font-family");
	   System.out.println("style of the system*****"+style);
	
	}

}
