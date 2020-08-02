/**
 * 
 */
package testPackage;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPageObjects;
import pageObjects.LoginPageObjects;
import resources.InvokingBrowser;

/**
 * @author kowshic
 * @selenium 3.0
 *
 */
public class LoginPage extends InvokingBrowser {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(LoginPage.class.getName());

	@BeforeTest
	public void intialSetup() throws IOException {
		driver = initializeBrowserDriver();
		log.info("Chrome Driver Initialized");
	}

	@Test(dataProvider = "getData")
	public void loginPageNavigation(String userName, String password) throws IOException {
		driver.get(prop.getProperty("url"));
		LandingPageObjects lp = new LandingPageObjects(driver);
		LoginPageObjects login = lp.getLogin();
		log.info("Navigated to login page");
		login.getemail().sendKeys(userName);
		login.getpassword().sendKeys(password);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "User1";
		data[0][1] = "user1pass";

		data[1][0] = "User2";
		data[1][1] = "user2pass";
		return data;
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
