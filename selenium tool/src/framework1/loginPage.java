package framework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
private WebElement user;
private WebElement pass;
private WebElement login;
public  loginPage(WebDriver driver)
{
	user=driver.findElement(By.id("username"));
	pass=driver.findElement(By.name("pwd"));
	login=driver.findElement(By.xpath("//div[text()='Login ']"));
	
}
public void setUser()
{
user.sendKeys("admin");	
}
public void setPass()
{
pass.sendKeys("manager");	
}
public void setLogin()
{
login.click();	
}
public void getTitle()
{
System.out.println("***title of the page is*** "+login.getAttribute("textContent"));	
}
public void getUser()
{
System.out.println(user.getText());	
}
public void getPass()
{
System.out.println(pass.getText());	
}
}
