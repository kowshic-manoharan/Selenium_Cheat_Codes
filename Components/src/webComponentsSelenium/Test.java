/**
 * This is the dummy progarm file where we can check(TEST) the code
 *
 */
package webComponentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * @author kowshic
 * @version Selenium 3.0
 *
 */
public class Test {

	public static void main(String[] args) {
		// System Property for Chrome driver
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Drivers\\chrome driver 83\\chromedriver_win32\\chromedriver.exe");

		// Initiate the Chrome Driver Class
		WebDriver driver = new ChromeDriver();

		// Maximize the browser Window
		driver.manage().window().maximize();

		// Launch the website
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Ind");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script);
		
		
		while(!text.equalsIgnoreCase("India")) {
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
		}
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.TAB); 
	}
}
