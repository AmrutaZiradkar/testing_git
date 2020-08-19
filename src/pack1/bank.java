package pack1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class bank {

	@BeforeTest
	public void bank_login()
	{
		System.out.println("Bank LogIn");
	}
	
	@AfterTest
	public void bank_logout()
	{
		System.out.println("Bank LogOut");
	}
	@Test
	public void A()
	{
		System.out.println("A");
	}
	@Test(dependsOnGroups="first")
	public void B()
	{
		System.out.println("B");
	}
	
	@Test(groups="first")
	public void balance_check()
	{
		System.out.println("balance_check");
	}
	@Test(groups="first")
	public void mini_statement()
	{
		System.out.println("mini_statement");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("***start***");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("***after***");
	}
}
