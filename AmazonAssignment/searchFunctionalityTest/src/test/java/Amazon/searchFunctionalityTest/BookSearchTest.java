/**
 * This code consists of all the positive checks to test the amazon book search functionality
 */
package Amazon.searchFunctionalityTest;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectRepositorys.BooksPageObjects;
import pageObjectRepositorys.LandingPageObjects;
import resources.Base;

/**
 * @author kowshic
 * @since 17-12-2020
 *
 */
public class BookSearchTest extends Base {

	public WebDriver driver;
	public static Logger log = LogManager.getLogger(BookSearchTest.class.getName());

	/**
	 * intialSetup helps to setup the browser and Url to launch
	 * 
	 * @throws IOException
	 */
	@BeforeTest
	public void intialSetup() throws IOException {
		driver = initializeBrowserDriver();
		log.info("Chrome Driver Initialized");
		driver.get(prop.getProperty("url"));
		log.info("Amazon Url is loading");
	}

	/**
	 * clickDropDownAndSelectBooks is used to click the dropdown and select the book
	 * from the dropdown
	 */
	@Test
	public void clickDropDownAndSelectBooks() {
		LandingPageObjects lp = new LandingPageObjects(driver);
		log.info("Currently in the Amazon page");
		log.debug("I have clicked on the dropdown");
		lp.dropDownbox().click();
		log.debug("I have clicked on the books from the dropdown");
		lp.books().click();
		log.info("Book is clicked in the dropdown");
	}

	/**
	 * enterDataCatalogInSearch is used enter the data and open the specified book
	 * "Data catalog"
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void enterDataCatalogInSearch() throws InterruptedException {
		BooksPageObjects bpo = new BooksPageObjects(driver);
		log.debug("I have clicked on the books from the dropdown");
		bpo.searchBox().sendKeys("data catalog");
		bpo.searchBox().sendKeys(Keys.ENTER);
		log.info("Data catalog is entered in the serch box");
		bpo.dataCatalogLink().click();
		log.info("Data catalog both details opened in new tab");
		Set<String> id = driver.getWindowHandles();
		Iterator<String> it = id.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		Assert.assertEquals(driver.getTitle(),
				"Buy The Data Catalog: Sherlock Holmes Data Sleuthing for Analytics Book Online at Low Prices in India | The Data Catalog: Sherlock Holmes Data Sleuthing for Analytics Reviews & Ratings - Amazon.in");
	}

	/**
	 * readAndPrintDetails is used to read and print the details of the book
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void readAndPrintDetails() throws InterruptedException {
		BooksPageObjects bpo = new BooksPageObjects(driver);
		log.info("Getting the details of book in paperback");
		System.out.println("Title :" + bpo.title().getText());
		String paperbackPriceValue = bpo.paperbackPrice().getText();
		paperbackPriceValue = paperbackPriceValue.substring(1);
		System.out.println("Paperback Price : Rs" + paperbackPriceValue);

		System.out.println("Paperback Publisher :" + bpo.paperbackPublisher().getText());
		System.out.println("Paperback Language :" + bpo.paperbackLanguage().getText());
		System.out.println("Paperback Pages :" + bpo.paperbackPages().getText());
		log.info("I am clicking on the kindle");
		bpo.kindleDetails().click();
		log.info("Getting the details of book in kindle");
		String kindleValue = bpo.KindlePrice().getText();
		kindleValue = kindleValue.substring(1);
		System.out.println("Kindle Price : Rs" + kindleValue);

		System.out.println("ASIN :" + bpo.asin().getText());
		System.out.println("Kindle Publisher :" + bpo.kindlePublisher().getText());
		System.out.println("Language :" + bpo.kindlelanguage().getText());
		System.out.println("File Size :" + bpo.KindleFileSize().getText());
	}

	/**
	 * tearDown used to close all the browsers
	 */
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
