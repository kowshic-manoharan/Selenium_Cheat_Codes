/**
 * This code is used to learn the concepts in the tables in the web
 */
package webComponentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Kowshic
 * @version Selenium 3.0
 */
public class TablesInWeb {

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
		driver.get("https://www.espncricinfo.com/");

		driver.findElement(By.cssSelector("div[class='slick-list'] div[data-index='2']")).click();

		Thread.sleep(5000);

		WebElement tableValue = driver.findElement(By.xpath(
				"//body/div[@id='__next']/section[@id='pane-main']/section[@id='main-container']/div/div/div/div/div/div[2]/div[1]/div[1]/div[1]"));

		int score = tableValue.findElements(By.cssSelector("tbody td[class='font-weight-bold']")).size();
		
		for (int i = 0; i < score; i++) {
			System.out.println(
					tableValue.findElements(By.cssSelector("tbody td[class='font-weight-bold']")).get(i).getText());
		}
	}
}
