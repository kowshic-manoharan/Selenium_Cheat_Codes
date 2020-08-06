/**
 * This code is used to handle the window Authentication
 */
package webComponentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author kowshic
 * @version Selenium 3.0
 *
 */
public class WindowAuthentication {

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
//		driver.get("https://the-internet.herokuapp.com");

		// Syntax -> http://username:password@SiteURL
		driver.get("http://admin:admin@the-internet.herokuapp.com");

		driver.findElement(By.xpath("//a[contains(text(),'Basic Auth')]")).click();

	}
}
