package auto_labs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class facebook_login 
{
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Desktop\\Chrome_Selenium\\84\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
	}
	@Test(priority=1)
	public void title_test()
	{
		
		System.out.println(driver.getTitle());
	}
	
	@Test(priority=2)
	public void login_test()
	{
		driver.findElement(By.name("email")).sendKeys("jwamruta");
		driver.findElement(By.name("pass")).sendKeys("amruta@123");
		
		driver.findElement(By.name("login")).click();
	}
	
	@AfterMethod
	public void tearDown()
	{
		
		driver.close();
	}
	
	
	
}
