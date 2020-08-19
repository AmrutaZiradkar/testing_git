package pack1;

import org.testng.annotations.Test;

public class dependsongroups {

	@Test
	public void balance_check()
	{
		System.out.println("balance_check");
	}
	@Test(enabled=false)
	public void B()
	{
		System.out.println("B");
	}
	@Test
	public void C()
	{
		System.out.println("C");
	}
}
