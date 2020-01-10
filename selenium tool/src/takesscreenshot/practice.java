package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice {


	static 
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.get("http://www.mintra.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(.,'☰')]")).click();
	   Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[.='Success Stories']")).click();
	    /*TakesScreenshot sc=(TakesScreenshot)driver;
	    File src = sc.getScreenshotAs(OutputType.FILE);
	    File des = new File("./screenshot/mintra3.png");
	    FileUtils.copyFile(src,des);;
	    */WebDriverWait wait=new WebDriverWait(driver,80 );
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //h3[.='BOURBON – A centralised HR solution for a global operation']/../../../div[1]")));
	    driver.findElement(By.xpath("//h3[.='BOURBON – A centralised HR solution for a global operation']/../../../div[1]")).click();
        Thread.sleep(3000); 
	    WebElement je = driver.findElement(By.xpath(" //h3[contains(.,'Important than Safety')]"));
	   Thread.sleep(3000);
	    JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,"+je+")");

}
}