package academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pageobject.LandingPage;
import resources.Base;

public class HomePage2 extends Base {
	public WebDriver driver;


	@BeforeTest
	public void invokeBrowser() throws IOException {
		driver = initializer();
		driver.get(pro.getProperty("url"));
	}

	@Test
	public void basePageNavigation() throws IOException {

		LandingPage landing = new LandingPage(driver);
		System.out.println(landing.getTitle().getText());
		Assert.assertEquals(landing.getTitle().getText(), "FEATURED COrtdfRSES");
		Assert.assertTrue(landing.getNavigationBar().isDisplayed());// this method always expect condition to be true
		//Assert.assertFalse(landing.getNavigationBar().isDisplayed());
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
