package pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test3 {
	@BeforeClass
		public void beforeclass() 
	  {
		  System.out.println("Before Class");
	  }
	 
	@AfterClass
	public void afterclass() 
  {
	  System.out.println("After Class");
  }
 
	@Test(groups="first")
	  public void mobile() 
	  {
		  System.out.println("Mobile Login");
	  }
	  
	 @BeforeSuite
	  public void beforesuite() 
	  {
		  System.out.println("Before Suite");
	  }
	  
	 @AfterSuite
	  public void aftersuite() 
	  {
		  System.out.println("After Suite");
	  }
	  
}
