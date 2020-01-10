package testNgPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import practice.webElement;

public class ActitimeLoginPage {
	@FindBy(id = "username")
	private WebElement user;
	@FindBy(name = "pwd")
	private WebElement pass;

	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement login;

	@FindBy(xpath = "//span[contains(text(), 'invalid')]")
	private WebElement errmsg;

	WebDriver driver = null;

	public ActitimeLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void setUserName(String un) {
		user.sendKeys(un);
	}

	public void setPass(String pw) {
		pass.sendKeys(pw);
	}

	public void clickLogin() {
		login.click();
	}

	public void errorMsg() {
		try {
			if (errmsg.isDisplayed()) {
				Reporter.log("Error message is displayed:" + errmsg.getText(), true);
			}
		} catch (StaleElementReferenceException e) {
			errmsg = driver.findElement(By.xpath("//span[contains(text(), 'invalid')]"));

			if (errmsg.isDisplayed()) {
				Reporter.log("Error message is displayed:" + errmsg.getText(), true);
			}
		}
	}
}