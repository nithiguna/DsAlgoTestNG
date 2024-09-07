package resource_browser;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Browser_Launch_Quit {
	public static WebDriver driver;
	// WebDriver driver = new ChromeDriver(chromeOptions);
	ChromeOptions chromeOptions = new ChromeOptions();

	@BeforeMethod
	@Parameters("browser")
	public void launch(String nameofbrowser) {
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		if (nameofbrowser.equals("Chrome")) {
			driver = new ChromeDriver(chromeOptions);
		}
		if (nameofbrowser.equals("Edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://dsportalapp.herokuapp.com/");

	}

	@AfterMethod
	public void quit_the_browser() {
		// driver.quit();
	}

}
