package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	
		features = "src/test/java/features"
		,glue= "stepDefinitions"
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}



/*io.cucumber.junit.UndefinedStepException: The step "Initialize browser with chrome" is
undefined. You can implement it using the snippet(s) below:

@Given("Initialize browser with chrome")
public void initialize_browser_with_chrome() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


Some other steps were also undefined:

@Given("Click on Login link in home oage to land on Secure sign in page")
public void click_on_Login_link_in_home_oage_to_land_on_Secure_sign_in_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


*/