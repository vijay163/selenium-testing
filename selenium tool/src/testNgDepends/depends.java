package testNgDepends;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class depends 
{
	@Test(priority=3)
	public void deleteUser()
	{
		Reporter.log("delete user",true);
	}
	@Test(priority=2)
	public void editeUser()
	{
		Reporter.log("edit user",true);
	}
	@Test(priority=1,invocationCount=5)
	public void createteUser()
	{
		Reporter.log("create user",true);
	}

}
