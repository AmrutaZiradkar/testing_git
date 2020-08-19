package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class depends_On_feature {

	WebDriver driver;
	@Test
	public void openbrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Desktop\\Chrome_Selenium\\84\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test(dependsOnMethods="openbrowser")
	public void geturl()
	{
	
		driver.get("https://google.com");
			
	}
	
	@Test(dependsOnMethods={"openbrowser","geturl"})
	public void title()
	{
		
	System.out.println(driver.getTitle());
			
	}
	
	
}
