package testng_practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testng11 {

	@Test
	public void google()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Desktop\\Chrome_Selenium\\84\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void facebook()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Desktop\\Chrome_Selenium\\84\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.get("https://www.facebook.com/");
	}
}
