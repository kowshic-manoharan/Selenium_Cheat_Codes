/**
 * This is the base of the framework where decide, which browser have to be initialized to run script
 */
package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author kowshic
 * @version Selenium 3.0
 */
public class InvokingBrowser {
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeBrowserDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\Selenium_workspace\\E2EProject\\src\\main\\java\\resources\\InvokeDetails.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Selenium Drivers\\chrome driver 83\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			// property for firefox
		} else {
			// property for other browser
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	
	public void getScreenShotPath(String testcaseName,WebDriver driver) throws IOException {
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testcaseName+".png";
		FileUtils.copyFile(SrcFile,new File(destinationFile));
	}
	
}
