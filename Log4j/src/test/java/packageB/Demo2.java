/**
 * 
 */
package packageB;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author kowshic
 * @version Selenium 3.0
 *
 */
public class Demo2 {

	/**
	 * @param args
	 */
	
	public static Logger log = LogManager.getLogger(Demo2.class.getName());
	public static void main(String[] args) {
		//this code will print only error since in the cofiguration file (resource folder -> loj4j2.xml) mentioned to error (level="error")
		log.debug("Clicking on the Link");
		log.info("Link is Clicked");
		log.error("Link is not clicked");
		log.fatal("Link is not enabled");
	}
}
