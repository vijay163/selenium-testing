package takesscreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
static 
{
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
}
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://www.facebook.com");
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8333828163",Keys.ENTER);
    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("vijay1",Keys.ENTER);
   // driver.findElement(By.xpath("//input[@value='Log In']")).click();
   
    TakesScreenshot ts = (TakesScreenshot)driver;
    File chandana = ts.getScreenshotAs(OutputType.FILE);
    Thread.sleep(2000);
    File pandit=new File("./screenshot/fb1.png");
    FileUtils.copyFile(chandana, pandit);
    driver.close();
}
}