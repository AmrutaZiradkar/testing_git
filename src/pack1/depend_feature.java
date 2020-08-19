package pack1;

import org.testng.annotations.Test;

public class depend_feature {
	
	@Test(dependsOnMethods="login1")
	public void balance_check()
	{
		System.out.println("balance_check");
	}
	@Test(dependsOnMethods="login1")
	public void mini_statement()
	{
		System.out.println("mini_statement");
	}
	
	@Test
	public void title()
	{
		System.out.println("title");
	}
	@Test
	public void login1()
	{
		System.out.println("Login");
	}
	
}
