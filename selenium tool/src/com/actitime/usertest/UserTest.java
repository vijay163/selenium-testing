package com.actitime.usertest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UserTest 
{
	@Test(groups= {"smokeTest"})
	public void createUser()
	{
		Reporter.log("UserTest is Executed",true);
	}
	@Test(groups= {"regressionTest"})
	public void modifyTest()
	{
		Reporter.log("ModifyTest is Executed");
	}

}
