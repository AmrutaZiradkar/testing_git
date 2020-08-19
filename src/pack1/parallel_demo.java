//to execute our test_cases parallely. ( <test thread-count="2" parallel="test_cases" name="Parallel Tests">)
//to execute our methods parallely.  <test thread-count="2" parallel="methods" name="Parallel Tests">
//to execute our classes parallely.  <test thread-count="2" parallel="classes" name="Parallel Tests">
package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel_demo {
	WebDriver driver;
	
	@Test
	public void test1()
	{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Desktop\\Chrome_Selenium\\84\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://google.com/");
	
	}
	
	@Test
	public void test2()
	{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Desktop\\Chrome_Selenium\\84\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://facebook.com/");
	
	}
	

}
