/* we can run multiple classes at a time, Use of listener- we can give suppose,  
 onTestStart (s.o.p. "start") and onTestSuccess(s.o.p. "successful")*/

/* another example,, suppose, we want to take screenshot or print some message of only Failure testCases
at that time we can write logic in onTestFailure()-- of screenshot or print some message */


package pack1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class listener implements ITestListener
{
		
	public void onFinish(ITestContext arg0) {
	// TODO Auto-generated method stub

	}

	public void onStart(ITestContext arg0) {
	// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult arg0) {
	// TODO Auto-generated method stub
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Desktop\\Chrome_Selenium\\84\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	System.out.println(driver.getTitle());
	System.out.println("fail");

	}

	public void onTestSkipped(ITestResult arg0) {
	// TODO Auto-generated method stub

	}

	public void onTestStart(ITestResult arg0) {
	// TODO Auto-generated method stub
		System.out.println("start");
	}

	public void onTestSuccess(ITestResult arg0) {
	// TODO Auto-generated method stub
	System.out.println("success");

	}

}
