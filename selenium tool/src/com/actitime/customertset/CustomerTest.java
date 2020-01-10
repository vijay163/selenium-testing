package com.actitime.customertset;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerTest
{
@Test(groups= {"smokeTest"})
public void customerTest()
{
Reporter.log("CustomerTest is Executed",true);	
}
@Test(groups= {"regressionTest"})
public void modifyCustomerTest()
{
Reporter.log("Modify CustomerTest is Executed",true);	
}
}
