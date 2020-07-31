/**
 * For implementing log4J we need to have two jars
 * -> log4j-core, 
 * -> log4j-api
 */
package packageA;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * @author kowshic
 * @version Selenium 3.0
 *
 */
public class Demo {
	
	/*Use log. Error() to log when elements are not displayed in the page or if any validations fail
	Use Log. Debug() When each Selenium action is performed like click, SendKeys, getText()
	Use log.info() When operation is successfully completed 
	ex: After loading page, or after any successful validations*/
	
	//common syntax we have to use 
	public static Logger log = LogManager.getLogger(Demo.class.getName()); // demo is the name of the class we need to pass
	
	public static void main(String[] args) {
		//this code will print all since in the cofiguration file (resource folder -> loj4j2.xml) mentioned to print all (level="trace")
		log.debug("Clicking on the button");
		log.info("Button is Clicked");
		log.error("Button is not clicked");
		log.fatal("Button is not enabled");
	}
}
