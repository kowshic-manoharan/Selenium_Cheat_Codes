/**
 * 
 */
package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.CreatePage;
import objectRepository.LoginPage;

/**
 * @author kowshic
 *
 */
public class LoginPageApplication {
	
	@Test
	public void loginDemo() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Drivers\\chrome driver 83\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize the browser Window
		driver.manage().window().maximize();

		// Launch the website
		driver.get("https://www.facebook.com/");
		
		LoginPage lp = new LoginPage(driver);
		lp.email().sendKeys("name");
		lp.password().sendKeys("password");
		lp.createpage().click();
		CreatePage cp = new CreatePage(driver);
		cp.email().sendKeys("createpaceusername");
		cp.password().sendKeys("password");
	}
}
