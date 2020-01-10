package Assert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert1 
{
	@Test
	public void AssertTest()
	{
		System.out.println("****Test is Start****** ");
		String actual="mahesh";
		String expect="mahesh";
		Assert.assertEquals(actual, expect);
		System.out.println("*******click On Compose module****");
	}
   @Test
   public void assertTest()
   {
	   System.out.println("*****Test is Started****");
	   String act="hari";
	   String exp="ravi";
	   SoftAssert s = new SoftAssert();
	   s.assertEquals(act, exp);
	   System.out.println("***Click On the acti-Time***");
	   s.assertAll();
	   System.err.println("****the Expected result is failed****");
   }
}
/*Write a selenium script for invalid login page 
-open the browser enter the url enter the invalid user name and invalid password
click on login button and verfie weather error message is diplayed or not with usig 'HardAssertion'
"Assert.assertTrue(errMsg.Displayed())=use this for invalid login"
*/