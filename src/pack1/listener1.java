/* suppose, we want to take screenshot or print some message of only Failure testCases
at that time we can write logic in onTestFailure()-- of screenshot or print some message */

//here I have written logic for taking screenshot for only failure testcase
//import commons-io-2.7 jar files


package pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class listener1 implements ITestListener
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
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Desktop\\Chrome_Selenium\\84\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("d://screenshot123.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done...!!!");

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
