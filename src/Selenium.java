import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {
	public static WebDriver Start() {
		//Create Driver object
		System.setProperty("webdriver.gecko.driver", "\\My Drive\\Coding\\Java\\selenium-java\\geckodriver.exe");
					
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
}