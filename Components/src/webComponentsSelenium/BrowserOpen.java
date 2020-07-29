/**
 * This is the welcome program for selenium to open the browser
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
 *
 */
public class BrowserOpen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chrome driver 83\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		
		WebElement inputValue = driver.findElement(By.xpath("//input[@name='q']"));
		inputValue.sendKeys("Kowshic");
		inputValue.sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
		driver.close();
	}
}