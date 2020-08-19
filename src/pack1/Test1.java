package pack1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
  @BeforeSuite
  public void login() 
  {
	  System.out.println("Login");
  }
  
  @AfterSuite
  public void logot() 
  {
	  System.out.println("Logout");
  }
  @Test
  public void instagram_login() 
  {
	  System.out.println("instagram_login");
  }
  @Test
  public void twitter_login()
  {
	  System.out.println("Twitter Login");
  }
}
