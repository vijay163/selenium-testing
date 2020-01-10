package testNgDepends;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class group 
{
	@Test(priority=3,groups="del")
	public void deleteUser()
	{
		Reporter.log("delete user",true);
	}
	@Test(priority=2,groups="edit")
	public void editeUser()
	{
		Reporter.log("edit user",true);
	}
	@Test(priority=1,groups= {"edit","del"})
	public void createteUser()
	{
		Reporter.log("create user",true);
	}

}
