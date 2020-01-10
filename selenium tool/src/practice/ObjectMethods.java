package practice;

import java.lang.reflect.Method;

public class ObjectMethods {
public static void main(String[] args) throws ClassNotFoundException {
	int count=0;
	Class c = Class.forName("org.openqa.selenium.WebDriver");
	Method[] ms=c.getDeclaredMethods();
	for(Method m:ms)
	{
		count++;
		System.out.println(m.getName());
	}
	System.out.println("****number of the methods in the object***=="+count);
}
}
