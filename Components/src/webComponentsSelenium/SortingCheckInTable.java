/**
 * This code is used to check values in the grid are changing in ascending and descending
 */
package webComponentsSelenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * @author kowshic
 * @version Selenium 3.0
 */
public class SortingCheckInTable {

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
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		Thread.sleep(2000);
		ascendingOrder(driver);
		
		Thread.sleep(2000);
		descendingOrder(driver);
	}

	/**
	 * @param driver
	 */
	public static void ascendingOrder(WebDriver driver) {
		// getting the column values in the list
		List<WebElement> listValue = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
		// click two time to make the column header as ascending
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		
		
		// ArrayList is easy to search
		ArrayList<String> originalList = new ArrayList<String>();
		for(int i=0;i<listValue.size();i++) {
			originalList.add(listValue.get(i).getText());
		}
		
		// Creating an array and stored the original values
		ArrayList<String> copiedList = new ArrayList<String>();
		for(int i=0;i<originalList.size();i++) {
			copiedList.add(originalList.get(i));
		}
		
		// Sort the newly created array
		Collections.sort(copiedList);
		
		// Comparing the original values with the sorted array values
		Assert.assertEquals(originalList, copiedList);
	}
	
	/**
	 * @param driver
	 */
	public static void descendingOrder(WebDriver driver) {
		// getting the column values in the list
		List<WebElement> listValue = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
		// click one time to make the column header as descending
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		
		// ArrayList is easy to search
		ArrayList<String> originalList = new ArrayList<String>();
		for(int i=0;i<listValue.size();i++) {
			originalList.add(listValue.get(i).getText());
		}
		
		// Creating an array and stored the original values
		ArrayList<String> copiedList = new ArrayList<String>();
		for(int i=0;i<originalList.size();i++) {
			copiedList.add(originalList.get(i));
		}
		
		// Sort the newly created array
		Collections.sort(copiedList);
		Collections.reverse(copiedList);
		
		// Comparing the original values with the sorted array values
		Assert.assertEquals(originalList, copiedList);
	}
}
