package testng_practice;

import org.testng.annotations.Test;

public class practice2 {
	
	@Test
	public void test1()
	{
		int a=10,b=30;
		int c=a+b;
		System.out.println("Value of sum= "+c);
		
	}
	
	@Test
	public void test2()
	{
		int a=40,b=30;
		int c=a-b;
		System.out.println("Value of sub= "+c);
		
	}
	
}
