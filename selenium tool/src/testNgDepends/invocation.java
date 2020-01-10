package testNgDepends;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocation 
{
	@Test(priority=3,dependsOnMethods="createUser")
	public void deleteUser()
	{
		Reporter.log("delete user",true);
	}
	@Test(priority=2,dependsOnMethods="createUser")
	public void editeUser()
	{
		Reporter.log("edit user",true);
	}
	@Test(priority=1)
	public void createUser()
	{ 
		Assert.fail();
		Reporter.log("create user",true);
	}

}
