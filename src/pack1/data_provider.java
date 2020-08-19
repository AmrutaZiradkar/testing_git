package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_provider {
	
	WebDriver driver;
	@Test
	public void a()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Desktop\\Chrome_Selenium\\84\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	public void b()
	{
		
		driver.get("https://www.facebook.com/");
	}
	
	@Test(dataProvider="credentials")
	public void c(String name, String password)
	{
		
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys(password);
		
	}
	
	@Test
	public void d()
	{
		
		System.out.println("Data processing");
	}
	
	@Test
	public void e()
	{
		System.out.println("Logout");
	}
	
	@DataProvider(name="credentials")
	public Object[][] getdata()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="first user";
		data[0][1]="first pass";
		data[1][0]="2nd user";
		data[1][1]="2nd pass";
		data[2][0]="3rd user";
		data[2][1]="3rd pass";
		
		return data;
		
	}
}
