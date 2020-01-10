package practice;

import java.lang.reflect.Method;

public class webElement {
public static void main(String[] args) throws ClassNotFoundException {
	int count=0;
	Class cl = Class.forName("java.lang.String");
     Method[] st = cl.getMethods(); 
    for(Method s:st)
    {
    	count++;
    	System.out.println(s);
    }
System.out.println("no.of classes in that package==="+count);
}
}
