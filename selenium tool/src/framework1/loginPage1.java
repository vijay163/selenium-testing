package framework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage1 {
	@FindBy(id="username") 
	private WebElement user;
	@FindBy(name="pwd")
	private WebElement pass;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement login;
/*	public loginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
  */public void setUser(String un)
  {
	  user.sendKeys(un);
  }
  public void setPass(String pas)
  {
	  pass.sendKeys(pas);
  }
  public void setLogin()
  {
	  login.click();
  }


}
