/**
 * This is the program to learn the checkbox function
 * 1)Select the Checkbox
 * 2)UnSelect the Checkbox
 * 3)Check if the checkbox is enabled
 * 4)Check if the checkbox is disabled
 * 
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
public class Checkbox {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// System Property for Chrome driver
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Drivers\\chrome driver 83\\chromedriver_win32\\chromedriver.exe");

		// Initiate the Chrome Driver Class
		WebDriver driver = new ChromeDriver();

		// Maximize the browser Window
		driver.manage().window().maximize();

		// Launch the website
		driver.get("https://www.spicejet.com/");

		enableCheck(driver);
		checkCheckBox(driver);
		uncheckCheckBox(driver);

		// Close the Browser
		driver.close();
	}

	/**
	 * uncheckCheckBox method is used to uncheck the checkbox
	 * 
	 * @param driver
	 */
	private static void uncheckCheckBox(WebDriver driver) {
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected();
		boolean no = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected();
		if (no == false) {
			System.out.println("Checked Checkbox is Unchecked properly");
		} else
			System.out.println("Checked Checkbox is not Unchecked properly");
	}

	/**
	 * checkCheckBox method is used to check the desired checkBox
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	private static void checkCheckBox(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		Thread.sleep(4000);
		boolean no = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected();
		if (no == true) {
			System.out.println("Checkbox is checked");
		} else
			System.out.println("Checkbox is not checked");
		Thread.sleep(4000);
	}

	/**
	 * enableCheck method is used to check checkBox is enabled or not
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	private static void enableCheck(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isEnabled();
		boolean no = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isEnabled();
		if (no == true) {
			System.out.println("Checkbox is enabled");
		} else
			System.out.println("Checkbox is not enabled");
		Thread.sleep(4000);
	}
}
