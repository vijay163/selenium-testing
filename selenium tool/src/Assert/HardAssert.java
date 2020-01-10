package Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert 
{
	@Test
	public void testAssert()
	{
		System.out.println("Test is start");
		String actual="mahesh";
		String expected="tarak";
		Assert.assertEquals(actual, expected);
	   System.out.println("Click on compose module");
	
	}
	@Test
	public void testAssertHard()
	{
		System.out.println("After failing the test1()");
	}

}
