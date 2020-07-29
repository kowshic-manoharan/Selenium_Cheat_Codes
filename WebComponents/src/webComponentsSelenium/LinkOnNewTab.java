/**
 * This program help to learn and limit the scope of webdriver
 * Opening of link in Newtab and print the Title
 */
package webComponentsSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author kowshic
 * @version Selenium 3.0
 */
public class LinkOnNewTab {

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
		driver.get("https://www.w3schools.com/");
		
		WebElement exercise = driver
				.findElement(By.cssSelector("div[class='w3-row-padding w3-content w3-hide-medium w3-hide-small']"));
		exercise.findElements(By.tagName("a")).size();
		for (int i = 0; i < exercise.findElements(By.tagName("a")).size(); i++) {
			String clickOnTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			exercise.findElements(By.tagName("a")).get(i).sendKeys(clickOnTab);
		}
		
		Set<String> linkPage = driver.getWindowHandles();
		Iterator<String> it = linkPage.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}
}
