package testNgPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ProductvarPage {
	@FindBy(xpath="(//div[contains(.,'settings')])[4]")
	private WebElement settings;
	@FindBy(xpath="//a[text()='Licenses']")
	private WebElement license;
	@FindBy(xpath="//nobr[contains(.,'Product')]/../../td[2]")
	private WebElement edition;
	public ProductvarPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
public void clickSetings()
{
settings.click();	
}
   public void clickLic()
   {
	   license.click();
   }
   public void getEdition()
   {
	System.out.println(edition.getText());
   }
}
