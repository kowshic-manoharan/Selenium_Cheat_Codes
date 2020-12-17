/**
 * This code contains all the locators related to the book page
 */
package pageObjectRepositorys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author kowshic
 * @since 17-12-2020
 *
 */
public class BooksPageObjects {

	public WebDriver driver;

	/**
	 * @param driver
	 */
	public BooksPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#twotabsearchtextbox") // css selector is used, faster than xpath
	WebElement searchBox;

	/**
	 * searchBox contains the locator details of searchBox
	 * 
	 * @return searchBox
	 */
	public WebElement searchBox() {
		return searchBox;
	}

	@FindBy(xpath = "//span[contains(text(),'The Data Catalog: Sherlock Holmes Data Sleuthing f')]")
	WebElement dataCatalogLink;

	/**
	 * dataCatalogLink contains the locator details of dataCatalogLink
	 * 
	 * @return dataCatalogLink
	 */
	public WebElement dataCatalogLink() {
		return dataCatalogLink;
	}

	@FindBy(xpath = "//span[@id='productTitle']")
	WebElement title;

	/**
	 * title contains the locator details of title
	 * 
	 * @return title
	 */
	public WebElement title() {
		return title;
	}

	@FindBy(xpath = "//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='centerCol']/div[@id='MediaMatrix']/div[@id='formats']/div[@id='tmmSwatches']/ul[1]/li[1]/span[1]/span[1]/span[1]/a[1]/span[2]/span[1]")
	WebElement KindlePrice;

	/**
	 * KindlePrice contains the locator details of KindlePrice
	 * 
	 * @return KindlePrice
	 */
	public WebElement KindlePrice() {
		return KindlePrice;
	}

	@FindBy(xpath = "//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='centerCol']/div[@id='MediaMatrix']/div[@id='formats']/div[@id='tmmSwatches']/ul[1]/li[2]/span[1]/span[1]/span[1]/a[1]/span[2]/span[1]")
	WebElement paperbackPrice;

	/**
	 * paperbackPrice contains the locator details of paperbackPrice
	 * 
	 * @return paperbackPrice
	 */
	public WebElement paperbackPrice() {
		return paperbackPrice;
	}

	@FindBy(xpath = "//span[contains(text(),'Technics Publications LLC; First edition (16 March')]")
	WebElement paperbackPublisher;

	/**
	 * paperbackPublisher contains the locator details of paperbackPublisher
	 * 
	 * @return paperbackPublisher
	 */
	public WebElement paperbackPublisher() {
		return paperbackPublisher;
	}

	@FindBy(xpath = "//span[@class='a-list-item']//span[contains(text(),'English')]")
	WebElement paperbackLanguage;

	/**
	 * paperbackLanguage contains the locator details of paperbackLanguage
	 * 
	 * @return paperbackLanguage
	 */
	public WebElement paperbackLanguage() {
		return paperbackLanguage;
	}

	@FindBy(xpath = "//span[contains(text(),'350 pages')]")
	WebElement paperbackPages;

	/**
	 * paperbackPages contains the locator details of paperbackPages
	 * 
	 * @return paperbackPages
	 */
	public WebElement paperbackPages() {
		return paperbackPages;
	}

	@FindBy(css = "#a-autoid-6-announce")
	WebElement kindleDetails;

	/**
	 * kindleDetails contains the locator details of kindleDetails
	 * 
	 * @return kindleDetails
	 */
	public WebElement kindleDetails() {
		return kindleDetails;
	}

	@FindBy(xpath = "//span[contains(text(),'B085LKF8VM')]")
	WebElement asin;

	/**
	 * asin contains the locator details of the asin
	 * 
	 * @return asin
	 */
	public WebElement asin() {
		return asin;
	}

	@FindBy(xpath = "//span[contains(text(),'Technics Publications (16 March 2020)')]")
	WebElement kindlePublisher;

	/**
	 * kindlePublisher contains the locator details of kindlePublisher
	 * 
	 * @return kindlePublisher
	 */
	public WebElement kindlePublisher() {
		return kindlePublisher;
	}

	@FindBy(xpath = "//body/div[@id='a-page']/div[@id='dp']/div[@id='dp-container']/div[@id='detailBullets_feature_div']/div[@id='detailBulletsWrapper_feature_div']/div[@id='detailBullets_feature_div']/ul[1]/li[3]/span[1]/span[2]")
	WebElement kindlelanguage;

	/**
	 * kindlelanguage contains the locator details of kindlelanguage
	 * 
	 * @return kindlelanguage
	 */
	public WebElement kindlelanguage() {
		return kindlelanguage;
	}

	@FindBy(xpath = "//span[contains(text(),'106907 KB')]")
	WebElement KindleFileSize;

	/**
	 * KindleFileSize contains the locator details of KindleFileSize
	 * 
	 * @return KindleFileSize
	 */
	public WebElement KindleFileSize() {
		return KindleFileSize;
	}

}
