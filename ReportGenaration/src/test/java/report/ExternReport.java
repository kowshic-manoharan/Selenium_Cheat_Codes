/**
 *  This program is used to learn how the extern reports are generated
 */
package report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExternReport {
	ExtentReports extent;

	@BeforeTest
	public void config()
	{
		// ExtentReports , ExtentSparkReporter
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Rahul Shetty");
	}

	@Test
	public void initialDemo()
	{
		ExtentTest test = extent.createTest("Initial Demo");
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Drivers\\chrome driver 83\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.close();
		extent.flush();
	}

}
