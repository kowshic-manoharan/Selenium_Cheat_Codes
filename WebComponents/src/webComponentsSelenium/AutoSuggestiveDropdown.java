/**
 * This is the program to learn the autoSuggestive Dropdown function
 * 1)Check if the autoSuggestive is displayed
 * 2)Check if the autoSuggestive is enabled
 * 3)Positive From value check
 * 4)Positive To value check
 * 5)Negative Case Check
 */

package webComponentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author kowshic 
 * @version Selenium 3.0
 */
public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// System Property for Chrome driver
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Drivers\\chrome driver 83\\chromedriver_win32\\chromedriver.exe");

		// Initiate the Chrome Driver Class
		WebDriver driver = new ChromeDriver();

		// Maximize the browser Window
		driver.manage().window().maximize();

		// Launch the website
		driver.get("https://www.ixigo.com/");

		from_to_displayCheck(driver);
		from_to_enabledCheck(driver);
		fromPlace(driver);
		toDestination(driver);
		negativeToDestination(driver);
		
		// Close the Browser
		driver.close();

	}

	private static void negativeToDestination(WebDriver driver) throws InterruptedException {
		System.out.println("Inside Negative");
		driver.navigate().refresh();
		Thread.sleep(5000);
		WebElement to = driver.findElement(By.xpath(
				"//div[@class='dstn u-ib u-v-align-bottom u-text-left']//input[@placeholder='Enter city or airport']"));
		to.click();
		Thread.sleep(2000);
		to.clear();
		Thread.sleep(2000);
		to.sendKeys("bom");
		Thread.sleep(2000);
		to.sendKeys(Keys.ENTER);
		WebElement from = driver.findElement(By.xpath(
				"//div[@class='orgn u-ib u-v-align-bottom u-text-left']//input[@placeholder='Enter city or airport']"));
		from.click();
		Thread.sleep(2000);
		from.clear();
		Thread.sleep(2000);
		from.sendKeys("bom");
		Thread.sleep(2000);
		from.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		//need to handle alerts 
	}

	/**
	 * from_to_displayCheck method is used to check the source and destination is displayed or not
	 * 
	 * @param driver
	 */
	private static void from_to_displayCheck(WebDriver driver) {
		WebElement from = driver.findElement(By.xpath(
				"//div[@class='orgn u-ib u-v-align-bottom u-text-left']//input[@placeholder='Enter city or airport']"));
		from.click();
		boolean statusValueFrom = from.isDisplayed();
		if (statusValueFrom == true) {
			System.out.println("From autosuggestive is displayed");
		} else {
			System.out.println("From autosuggestive is not displayed");
			driver.close();
		}
		WebElement to = driver.findElement(By.xpath(
				"//div[@class='dstn u-ib u-v-align-bottom u-text-left']//input[@placeholder='Enter city or airport']"));
		boolean statusValueTo = to.isDisplayed();
		if (statusValueTo == true) {
			System.out.println("To autosuggestive is displayed");
		} else {
			System.out.println("To autosuggestive is not displayed");
			driver.close();
		}
	}

	/**
	 *  from_to_enabledCheck method is used to check source and destination is enabled or not
	 *  
	 * @param driver
	 */
	private static void from_to_enabledCheck(WebDriver driver) {
		WebElement from = driver.findElement(By.xpath(
				"//div[@class='orgn u-ib u-v-align-bottom u-text-left']//input[@placeholder='Enter city or airport']"));
		from.click();
		boolean statusValueFrom = from.isEnabled();
		if (statusValueFrom == true) {
			System.out.println("From autosuggestive is enabled");
		} else {
			System.out.println("From autosuggestive is not enabled");
			driver.close();
		}

		WebElement to = driver.findElement(By.xpath(
				"//div[@class='dstn u-ib u-v-align-bottom u-text-left']//input[@placeholder='Enter city or airport']"));
		boolean statusValueTo = to.isEnabled();
		if (statusValueTo == true) {
			System.out.println("To autosuggestive is enabled");
		} else {
			System.out.println("To autosuggestive is not enabled");
			driver.close();
		}
	}

	/**
	 * toDestination method is used to give destination place
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	private static void toDestination(WebDriver driver) throws InterruptedException {
		WebElement to = driver.findElement(By.xpath(
				"//div[@class='dstn u-ib u-v-align-bottom u-text-left']//input[@placeholder='Enter city or airport']"));
		to.clear();
		Thread.sleep(2000);
		to.sendKeys("che");
		Thread.sleep(2000);
		to.sendKeys(Keys.ENTER);
	}

	/**
	 * fromPlace method is used to give source place
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	private static void fromPlace(WebDriver driver) throws InterruptedException {
		WebElement from = driver.findElement(By.xpath(
				"//div[@class='orgn u-ib u-v-align-bottom u-text-left']//input[@placeholder='Enter city or airport']"));
		from.click();
		Thread.sleep(2000);
		from.clear();
		Thread.sleep(2000);
		from.sendKeys("bom");
		Thread.sleep(2000);
		from.sendKeys(Keys.ENTER);
	}
}
