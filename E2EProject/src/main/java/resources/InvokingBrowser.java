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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\InvokeDetails.properties");

		prop.load(fis);

		String browserName = System.getProperty("browser"); // to run in maven
		// String browserName = prop.getProperty("browser"); // getting value from the
		// property file
                      
		if (browserName.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Selenium Drivers\\chrome driver 83\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			if (browserName.contains("headless")) {
				options.addArguments("headless");
			}
			driver = new ChromeDriver(options);
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\Selenium Drivers\\geckodriver-v0.27.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.edge.driver", "D:\\Selenium Drivers\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		return driver;
	}

	public String getScreenShotPath(String testcaseName, WebDriver driver) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\reports\\" + testcaseName + ".png";
		FileUtils.copyFile(SrcFile, new File(destinationFile));
		return destinationFile;
	}

}
