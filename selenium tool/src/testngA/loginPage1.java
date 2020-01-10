package testngA;

import org.testng.annotations.Test;

public class loginPage1 extends BaseClass {

	@Test
	public void loginManager()
	{
		System.out.println("manager is login");
	}
	@Test
	public void loginUser()
	{
		System.out.println("user is login");
	}
}
