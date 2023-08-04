package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static WebDriver driver;
	public Properties prop;

	public void initializeDriver() throws IOException {

		// To read the data
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\DataProperties");

		prop = new Properties();
		prop.load(fs);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("please choose proper browser");
		}
	}

	@BeforeMethod
	public void launchBrowserandURL() throws IOException {
		initializeDriver();
		driver.get(prop.getProperty("url"));

	}
}
