package openmrs.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {


	public  static WebDriver driver;

	public static void setUp(String browser, String url){
		initDriver(browser);
		goToURL(url);
	}

	private static void initDriver(String browser){
		selectDriver(browser);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	private static void selectDriver(String browser) {
		switch(browser){
		case "chrome":
		case "Chrome":{
			System.setProperty("webdriver.chrome.driver", "/openmrs/src/test/java/openmrs/resources/drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}

		case "ff":
		case "FF":
		{
			System.setProperty("webdriver.gecko.driver", "/openmrs/src/test/java/openmrs/resources/drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}

		}
	}

	private static void goToURL(String url){
		driver.get(url);
	}
	
	public static void tearDown(){
		driver.close();
		driver.quit();
	}

}
