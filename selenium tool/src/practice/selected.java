package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selected {
	static
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("file:///D:/selenium%20IDE/heros.html");
	    WebElement h = driver.findElement(By.id("heros"));
	    Select s = new Select(h);
	    Thread.sleep(2000);
	    s.selectByIndex(4);
	    Thread.sleep(2000);
	    s.selectByValue("m");
	    Thread.sleep(2000);
	    s.selectByVisibleText("rana");
	    Thread.sleep(2000);
	    System.out.println("**its a multi selected box**"+s.isMultiple());
	   WebElement first = s.getFirstSelectedOption();
	 System.out.println("*first selected option is*"+first.getText());
	 System.out.println("********************************************");
	 List<WebElement> all = s.getOptions();
	 int her = all.size();
	 System.out.println("**no.of heros are**"+her);
	for(WebElement op:all)
	{
		System.out.println("**hero name is***"+op.getText());
	}
	System.out.println("**************************");
	WebElement wrapp = s.getWrappedElement();
	System.out.println(wrapp.getText());
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	System.out.println( s.getClass());
 System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
 List<WebElement> selected = s.getAllSelectedOptions();
 int sel = selected.size();
System.out.println("*no.of selected items are*"+sel);	
 for(WebElement list:selected)
 {
	 System.out.println(list.getText());
 }
	
	}

}
