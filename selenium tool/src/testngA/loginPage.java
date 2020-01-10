package testngA;

import org.testng.annotations.Test;

public class loginPage extends BaseClass {
@Test(priority=0)
public void userName()
{
System.out.println("admin");	
}
@Test(priority=1)
public void passWord()
{
System.out.println("manager");	
}
}
