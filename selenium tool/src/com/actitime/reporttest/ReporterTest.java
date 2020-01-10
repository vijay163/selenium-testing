
package com.actitime.reporttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterTest 
{
  @Test(groups= {"smokeTest"})
  public void reporterTest()
  {
	  Reporter.log("customer Test is executed",true);
  }
  @Test(groups= {"regressionTest"})
  public void customerReporterTest()
  {
	  Reporter.log("modify CustomerTest is executed");
  }
}
