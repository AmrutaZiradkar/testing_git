package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class optional_parameter_passing {

	
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
			driver.get("https://www.facebook.com/");	
		}
		
		@Test(dependsOnMethods={"openbrowser","geturl"})
		@Parameters({"val1","val2"})
		public void login(@Optional("default")String id,@Optional("default")String pass)
		{
			driver.findElement(By.id("email")).sendKeys(id);
			driver.findElement(By.id("pass")).sendKeys(pass);
			
			driver.findElement(By.name("login")).click();
			
		}
	}


