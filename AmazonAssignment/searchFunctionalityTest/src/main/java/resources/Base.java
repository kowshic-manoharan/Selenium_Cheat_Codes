/**
 * This code describe and decide the browser and the URL used in the application
 */
package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author kowshic
 * @since 17-12-2020
 *
 */
public class Base {

	public WebDriver driver;
	public Properties prop;

	/**
	 * initializeBrowserDriver method helps to choose the browser and url used for
	 * application
	 * 
	 * @return driver
	 * @throws IOException
	 */
	public WebDriver initializeBrowserDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\browserDetails.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		String path = System.getProperty("user.dir");
		String chromeDriverPath = prop.getProperty("chrome_driver_path");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", path + chromeDriverPath);
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", ""); // path for firefox driver exe have to give here
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.edge.driver", ""); // path for edge driver exe have to give here
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	/**
	 * getScreenShotPath method is used to take the screenshot of failed testcases
	 * 
	 * @param testcaseName
	 * @param driver
	 * @return
	 * @throws IOException
	 */
	public String getScreenShotPath(String testcaseName, WebDriver driver) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\reports\\" + testcaseName + ".png";
		FileUtils.copyFile(SrcFile, new File(destinationFile));
		return destinationFile;
	}
}
