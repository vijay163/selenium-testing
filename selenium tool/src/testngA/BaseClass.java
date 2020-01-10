package testngA;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass  {
	@BeforeTest
	public void test1()
	{
		System.out.println("BeforeTest");
	}
	@AfterTest
	public void test2()
	{
		System.out.println("AfterTest");
	}
	@BeforeMethod
	public void test3()
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void test4()
	{
		System.out.println("AfterMethod");
	}
	@BeforeClass
	public void test5()
	{
		System.out.println("BeforeClass");
	}
	@AfterClass
	public void test6()
	{
		System.out.println("AfterClass");
	}
	@BeforeSuite
	public void test7()
	{
		System.out.println("BeforeSuit");
	}
	@AfterSuite
	public void test8()
	{
		System.out.println("AfterSuit");
	}
}
