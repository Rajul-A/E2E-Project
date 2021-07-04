package stepDefinitions;

import cucumber.api.junit.Cucumber;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.LandingPage;
import pageobject.LoginPage;
import resources.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import academy.NavigationBar;


@RunWith(Cucumber.class)

public class StepFile extends Base{
	public WebDriver driver;
	public static Logger logger = LogManager.getLogger(NavigationBar.class.getName());
	
	
	

	@Given("^Initialize browser with chrome$")
	public void initialize_browser_with_chrome() throws Throwable {
		System.out.println("Browser is initialised1");
		
		driver = initializer();
		
		System.out.println("Browser is initialised");

	}
	@And("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_something_site(String strArg1) throws Throwable {
		driver.get(strArg1);
		
		System.out.println("Browser is succesfully nevigated to this site");
	}

	@And("^Click on Login link in home oage to land on Secure sign in page$")
	public void click_on_login_link_in_home_oage_to_land_on_secure_sign_in_page() throws Throwable {
		LandingPage landing = new LandingPage(driver);
		landing.getLogin().click();
		System.out.println("Clicked on Login Page");

	}

	  @When("^User enters (.+) and (.+) and logs in$")
	    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
	     
	    
		//logger.info("We are siging-in");
		LoginPage login = new LoginPage(driver);
		login.enterUserName().sendKeys(username);
		login.enterPass().sendKeys(password);
		login.clickOnSubmit().click();
		
		System.out.println("Clicked on Submit button");
		
		
	}

	@Then("^Verify that user is succesfully logged$")
	public void verify_that_user_is_succesfully_logged_in() throws Throwable {
		System.out.println("Done");
//		LoginPage login = new LoginPage(driver);
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.attributeToBe(login.grabInvalindLoginText().getText(), "Invalid email or password."));
//		// click on the compose button as soon as the "compose" button is visible
//	
//		
//	
//		
//		System.out.println(login.grabInvalindLoginText().getText());
//		//Assert.assertEquals(login.grabInvalindLoginText().getText(),"Invalid email or password.");
//		
//		
//		System.out.println("Done");
//		
		

	}

}

