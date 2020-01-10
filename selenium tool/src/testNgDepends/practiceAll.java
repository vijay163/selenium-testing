package testNgDepends;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class practiceAll 
{
	@Test(priority=3,dependsOnMethods="createUser",groups="D")
	public void deleteUser()
	{
		Reporter.log("User can be Deleted",true);
	}
	@Test(priority=2,dependsOnMethods="createUser",groups="E")
	public void editUser()
	{
		Reporter.log("user Can be Edited",true);
	}
	@Test(priority=1,groups= {"D","E"})
	public void createUser()
	{
		//Assert.fail();
		Reporter.log("User can Be Created",true);
	}

}
