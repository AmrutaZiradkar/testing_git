package pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
  @BeforeClass
  public void login() 
  {
	  System.out.println(" Web_Login");
  }
  
  @Test(groups="first")
  public void web_login1() 
  {
	  System.out.println("Welcome Web_Login1");
  }
  
  @Test
  public void web_login2() 
  {
	  System.out.println("Welcome Web_Login2");
  }
  @Test
  public void web_login3() 
  {
	  System.out.println("Welcome Web_Login3");
  }
  @AfterClass
  public void logout() 
  {
	  System.out.println("LogOut");
  }
  
  @BeforeMethod
  public void before() 
  {
	  System.out.println("***start***");
  }
  @AfterMethod
  public void after() 
  {
	  System.out.println("***after***");
  }
  
}
