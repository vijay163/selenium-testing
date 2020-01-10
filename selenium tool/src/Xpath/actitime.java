package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		String titleL = driver.getTitle();
		System.out.println(titleL);
	   WebElement us= driver.findElement(By.xpath("//input[@id='username']"));
	    us.sendKeys("admin");
	     WebElement pass =driver.findElement(By.xpath("//input[@name='pwd']"));
	     pass.sendKeys("manager");
	     
	        driver.findElement(By.xpath("//div[.='Login ']")).click();
	        System.out.println("*******************"); 
	        String titleH=driver.getTitle();
	        System.out.println(titleH);
	        Thread.sleep(5000);
	         driver.findElement(By.xpath("//div[contains(text(),'USERS')]")).click();
	     // String title1 = driver.getTitle();
	     // System.out.println(title1);
	    driver.findElement(By.xpath("//div[contains(@class,'addUser')]")).click(); 
	       //  String title2 = driver.getTitle();
	        //System.out.println(title2);
	    
           Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[contains(@id,'firstNameField')]")).sendKeys("vijay");
           Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[contains(@id,'middleNameField')]")).sendKeys("g");
	           Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[contains(@id,'lastNameField')]")).sendKeys("kumar");
	           Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[contains(@id,'emailField')]")).sendKeys("vijay1.gali@gmail.com");
	           Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[contains(@id,'usernameField')]")).sendKeys("Aijay");
	           Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[contains(@id,'passwordField')]")).sendKeys("Aijay1");
	           Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[contains(@id,'passwordCopyField')]")).sendKeys("Aijay1");
	           Thread.sleep(4000);
	        driver.findElement(By.xpath("//span[contains(.,'Create User')]")).click();
	           Thread.sleep(4000);
	        driver.close();
	           Thread.sleep(4000);
	       driver.findElement(By.xpath("//a[contains(.,'TASKS')]")).click();
	       
	    
	}

}
