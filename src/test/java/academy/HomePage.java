package academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.LandingPage;
import pageobject.LoginPage;
import resources.Base;

public class HomePage extends Base {
	

	public static Logger logger = LogManager.getLogger(NavigationBar.class.getName());

	@Test(dataProvider = "getData")
	public void basePageNavigation(String UserName, String password, String text) throws IOException {
		driver = initializer();
		driver.get(pro.getProperty("url"));
		

		LandingPage landing = new LandingPage(driver);
		landing.getLogin().click();

		LoginPage login = new LoginPage(driver);
		login.enterUserName().sendKeys("UserName");
		logger.info("We are sending teh keys");
		login.enterPass().sendKeys("password");
		System.out.println(text);
		login.clickOnSubmit().click();
		

	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	

	

	@DataProvider
	public Object[][] getData() {
		// Row stands for how many different data types test should run
		// Column stands for how many value per each test
		Object[][] data = new Object[2][3];

		data[0][0] = "Rajul@gmail.com";
		data[0][1] = "8978767";
		data[0][2] = "Restricted1";

		data[1][0] = "Ronakb@gmail.com";
		data[1][1] = "8978767";
		data[1][2] = "Restricted2";

		return data;

	}

}
