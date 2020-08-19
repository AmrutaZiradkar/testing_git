import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void google() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Desktop\\Chrome_Selenium\\84\\chromedriver.exe");
		
		//driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		System.out.println("hello...");
  }
}
