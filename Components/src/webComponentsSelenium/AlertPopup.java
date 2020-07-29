/**
 * This is the program to learn the alert popup function
 * 1) Click on the Ok button in the alert
 * 2) Click on the Cancel button in the alert
 */
package webComponentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author kowshic 
 * @version Selenium 3.0
 */
public class AlertPopup {

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
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		/* This code is for handling alert contains ok button */
		alertOkClick(driver);

		/* This code is for handling alert contains cancel button */
		alertCancelClick(driver);
		
		// Close the Browser
		driver.close();
	}

	/**
	 * alertCancelClick method used to click the Cancel button in alert popup
	 * 
	 * @param driver
	 */
	public static void alertCancelClick(WebDriver driver) {
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Kowshic");
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		//switchTo().alert() is used to instruct the selenium to check alert in the screen
		System.out.println("Content in the alert is : " + driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}

	/**
	 * alertOkClick method used to click the Ok button in alert popup
	 * 
	 * @param driver
	 */
	public static void alertOkClick(WebDriver driver) {
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Kowshic");
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		//switchTo().alert() is used to instruct the selenium to check alert in the screen
		System.out.println("Content in the alert is : " + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}
}
