/**
 * This code is used to handle the SSL Certification in the Browser using Desired Capabilities
 */
package webComponentsSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author kowshic
 * @version Selenium 3.0
 */
public class HandlingSSLCertification {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Desired Capabilities is a class used to declare a set of basic requirements
		 * such as combinations of browsers, operating systems, browser versions, etc
		 */

		DesiredCapabilities ch = DesiredCapabilities.chrome();
//		ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		/*
		 * ChromeOptions class extends MutableCapabilities. We can use ChromeOptions
		 * class to manage options specific to ChromeDriver.
		 */
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);//here passing the DesiredCapability object

		// System Property for Chrome driver
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Drivers\\chrome driver 83\\chromedriver_win32\\chromedriver.exe");

		// Initiate the Chrome Driver Class
		WebDriver driver = new ChromeDriver(c); //here passing the chromeOption object
	}
}
