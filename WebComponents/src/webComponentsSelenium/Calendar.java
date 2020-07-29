/**
 * This is the generic code to handle the calendar in the travel Web-site by input the desired Month and Date
 */
package webComponentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author kowshic
 * @version Selenium 3.0
 */
public class Calendar {

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
		driver.get("https://www.goindigo.in/");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//body/div[@id='body']/section/div/div/div/div/div/div/div[@id='bookFlightTab']/form[@name='flight-search']/div/div/div[1]/div[1]/input[1]"))
				.click();
		
		//optimed code 
		while (!driver.findElement(By.cssSelector("[class='ui-datepicker-group ui-datepicker-group-first'] [class='ui-datepicker-month']")).getText()
				.contains("November")) {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}

		int count = driver.findElements(By.className("ui-state-default")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("ui-state-default")).get(i).getText();
			if (text.equalsIgnoreCase("24")) {
				driver.findElements(By.className("ui-state-default")).get(i).click();
				break;
			}
		}
	}
}
