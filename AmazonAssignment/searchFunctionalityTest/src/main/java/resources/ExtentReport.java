/**
 * This code describe the configuration of the extent reports
 */
package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

/**
 * @author kowshic
 * @since 17-12-2020
 *
 */
public class ExtentReport {

	public static ExtentReports extent;

	/**
	 * getReportObject is used to configure the Extent report
	 * 
	 * @return extent
	 */
	public static ExtentReports getReportObject() {
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Amazon Book Search - Results");
		reporter.config().setDocumentTitle("Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Kowshic");
		return extent;
	}
}
