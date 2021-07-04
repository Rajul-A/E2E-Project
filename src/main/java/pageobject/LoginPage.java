package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;

	private By userName = By.id("user_email");
	private By pass = By.cssSelector("input[type='password']");
	private By submit = By.cssSelector("input[type='submit']");
	private By invalidPassText = By.xpath("//section[@id='hero']/div/h1/following-sibling::div");
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement enterUserName() {
		return driver.findElement(userName);
	}
	
	public WebElement enterPass() {
		return driver.findElement(pass);
	}
	
	public WebElement clickOnSubmit() {
		
		return driver.findElement(submit);
		
	}
	public WebElement grabInvalindLoginText() {
		return driver.findElement(invalidPassText);
	}
}
