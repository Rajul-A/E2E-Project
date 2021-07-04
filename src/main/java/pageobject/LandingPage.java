package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	private By signin = By.cssSelector("a[href*='sign_in']");
	private By title = By.xpath("//div[@class='text-center']/h2");
	private By navigationBar = By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	//By title = By.cssSelector(".text-center>h2");
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
			
	}
	public WebElement getLogin() {
		return driver.findElement(signin);
	}
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	public WebElement getNavigationBar() {
		return driver.findElement(navigationBar);
	}

}
