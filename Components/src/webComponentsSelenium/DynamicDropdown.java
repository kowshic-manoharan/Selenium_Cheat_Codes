/**
 * This is the program to learn the Dynamic dropdown function
 * Example From and To Dropdown
 * 
 */
package webComponentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author kowshic 
 * @version Selenium 3.0
 *
 */
public class DynamicDropdown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// System Property for Chrome driver
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Drivers\\chrome driver 83\\chromedriver_win32\\chromedriver.exe");

		// Initiate the Chrome Driver Class
		WebDriver driver = new ChromeDriver();

		// Maximize the browser Window
		driver.manage().window().maximize();

		// Launch the website
		driver.get("https://www.spicejet.com/");

		// if an element is not located then the “ElementNotVisibleException” appears.
		// Selenium Wait commands help resolve this issue.
		WebDriverWait wait = new WebDriverWait(driver, 30);
		positiveFromToCheck(driver, wait);
		
		// Close the Browser
		driver.close();
	}

	/**
	 * This method is used for positive flow Check for From and then To
	 * 
	 * @param driver
	 * @param wait
	 */
	private static void positiveFromToCheck(WebDriver driver, WebDriverWait wait) {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")))
				.click();
		driver.findElement(By.xpath("//a[@text='Coimbatore (CJB)']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath(
				"//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Bengaluru (BLR)'][contains(text(),'Bengaluru (BLR)')]"))
				.click();
	}
}
