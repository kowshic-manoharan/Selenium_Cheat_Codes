/**
 * 
 */
package testPackage;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPageObjects;
import resources.InvokingBrowser;

/**
 * @author kowshic
 * @Version Selenium 3.0
 *
 */
public class HomePage extends InvokingBrowser {
	
	public WebDriver driver;
	
	public static Logger log = LogManager.getLogger(HomePage.class.getName());
	
	@BeforeTest
	public void intialSetup() throws IOException {
		driver = initializeBrowserDriver();
		log.info("Chrome Driver Initialized");
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void basepageNavigation(){
		LandingPageObjects lp = new LandingPageObjects(driver);
		AssertJUnit.assertEquals(lp.getText().getText(), "FEATURED COURSESs");
		log.info("Text is present");
		AssertJUnit.assertTrue(lp.getTabs().isDisplayed());
		log.info("Navigation bar is displayed");
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
