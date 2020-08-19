package pack1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
	
	
/*if we don't give priority to any testcase so, it will automatically set priority as 0, 
and if we have implicitly set priority as 0, and for other testcase we havn't give priority
so we have two testcases as priority =0,, so in that case it will consider by alphabetically*/
	@Test(priority=1)
	public void facebook()
	{
		
		System.out.println("Facebook");
	}
	@Test(priority=0)
	public void google()
	{
		
		System.out.println("google");
	}
	@Test(priority=2)
	public void yahoo()
	{
		
		System.out.println("yahoo");
	}
	@Test(priority=-1)
	public void instagram()
	{
		
		System.out.println("instagram");
		Reporter.log("Instagram task completed..");
	}
	@Test
	public void hotmail()
	{
		
		System.out.println("hotmail");
		Reporter.log("Hotmail task completed..",true);
	}

}
