/**
 * This program is used to learn the Action class in selenium like mouse hover and Keyboard events
 */
package webComponentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author kowshic
 * @version Selenium 3.0
 *
 */
public class ActionClassDemo {

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
		driver.get("https://www.amazon.in/");

		Actions ac = new Actions(driver);
		/* Move to the Element */
		ac.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		ac.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT)
				.sendKeys("kowshic").build().perform();
		Thread.sleep(2000);
		ac.contextClick(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).build().perform();
		
	}

}
