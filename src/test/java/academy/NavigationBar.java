package academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pageobject.LandingPage;
import resources.Base;

import org.apache.logging.log4j.*;


public class NavigationBar extends Base {
	// Define a static logger variable so that it references the
    // Logger instance named "MyApp".
	public static Logger logger = LogManager.getLogger(NavigationBar.class.getName());
	

	@BeforeTest
	public void invokeBrowser() throws IOException {
		driver = initializer();
		logger.info("Browser is initialized");
		driver.get(pro.getProperty("url"));
		logger.info("Navigate to home page");
	}

	@Test
	public void basePageNavigation() throws IOException {

		LandingPage landing = new LandingPage(driver);

		Assert.assertTrue(landing.getNavigationBar().isDisplayed());// this method always expect condition to be true
		//Assert.assertFalse(landing.getNavigationBar().isDisplayed());
		logger.info("Validating text");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		
		logger.info("We have sucessfully closed browser");
		logger.error("This is error");
	
	}

}
