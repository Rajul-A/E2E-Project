package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

	public WebDriver driver;
	public Properties pro;

	public WebDriver initializer() throws IOException {

		pro = new Properties();
		System.getProperty("user.dir");// provide the current project path in the system
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\data.properties");
		//
		pro.load(fis);
		// String browserName = System.getProperty("browser");//now this method will
		// check browser name in
		// MAVEN project command "mvn test -Dbrowser=chrome"
		String browserName = pro.getProperty("browser");
		System.out.println(browserName);
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Done12");
//
//	if (browserName.contains("chromeheadless")) {
//			ChromeOptions option = new ChromeOptions();// This is headless mode means browsers
//			// will not get open while running the test cases
//			if (browserName.contains("chrome")) {
//				option.addArguments("headless");
//
//			}
//			driver = new ChromeDriver(option);
//
//		}
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
			
		}
		
		else if (browserName.equals("firefox")) {
			// execute firefox
			// driver = new FirefosDriver();

		} else if (browserName.equals("IE")) {
			// execute IE
			// driver = new IEDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;

	}

	public String capturedScreenShots(String testCaseName, WebDriver driver) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
	}

}

/*java.lang.NullPointerException: Cannot invoke "org.openqa.selenium.WebDriver.manage()" because "this.driver" is null
at resources.Base.initializer(Base.java:53)
at stepDefinitions.StepFile.initialize_browser_with_chrome(StepFile.java:28)
at ✽.Initialize browser with chrome(file:///C:/Users/hp/eclipse-workspace/E2EProject/src/test/java/features/LoginFeature.feature:5)
*/
