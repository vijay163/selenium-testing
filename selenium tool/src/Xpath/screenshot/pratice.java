package Xpath.screenshot;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Enter;

public class pratice 
{
	private static final CharSequence Enter = null;
	static
	{
		System.setProperty("webdriver.chome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-Notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.naukri.com");
		String pt = driver.getTitle();
		System.out.println("**parent window title***"+pt);
		String pwh = driver.getWindowHandle();
		System.out.println("***reference address of parent window***"+pwh);
		System.err.println("**child window handle**************");
		Set<String> cwh = driver.getWindowHandles();
		int count = cwh.size();
		System.out.println("****number of  browesrs are****"+count);
		cwh.remove(pwh);
		int count1 = cwh.size();
		System.out.println("**after remove"+count1);
		Thread.sleep(2000);
	Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		al.dismiss();
	for(String h:cwh)
		{
			driver.switchTo().window(h);
			String t = driver.getTitle();
			System.out.println("**titles of the pages are***"+t);
			if(t.contains("Tech Mahindra"))
			{
			driver.close();
		} 
			Thread.sleep(2000);
			 WebElement element = driver.findElement(By.xpath("//div[text()='Tools']"));
			element.sendKeys(Keys.ENTER);
			Select s = new Select(element);
	        s.selectByVisibleText("People Flow (β)");
		
		}
	}
}
