/**
 * 
 */
package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author kowshic
 *
 */
public class StepDefenition {
	public static WebDriver driver;
	
	@Given("^user is on the landing page$")
	public void user_is_on_the_landing_page() throws Throwable {
		// System Property for Chrome driver
				System.setProperty("webdriver.chrome.driver",
						"D:\\Selenium Drivers\\chrome driver 83\\chromedriver_win32\\chromedriver.exe");
				// Initiate the Chrome Driver Class
			    driver = new ChromeDriver();
				// Maximize the browser Window
				driver.manage().window().maximize();
				// Launch the website
				driver.get("https://www.facebook.com/");
	}
	
	@When("^user login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(strArg1);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(strArg2);
		driver.findElement(By.xpath("//td[3]//label[1]")).click();
    }
	
	@Then("^home page should display$")
	public void home_page_should_display() throws Throwable {
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "Facebook", "Home open opened successfully");
		driver.close();
	}
}
