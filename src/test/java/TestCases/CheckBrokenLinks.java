package TestCases;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class CheckBrokenLinks {
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		List<WebElement> links = driver.findElements(By.xpath("//ul[@class='list-unstyled']//a"));
		
		SoftAssert a = new SoftAssert();
		
		for (WebElement link:links) {
			String url = link.getAttribute("href");
			
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			
			conn.setRequestMethod("HEAD"); //This will give the status code and not the response body
			conn.connect();
			
			int respCode = conn.getResponseCode();
			System.out.println(respCode); // print status code
			
			a.assertTrue(respCode<400, "The Link with Text" + link.getText() + "is broken with code" + respCode);
		}
		
		a.assertAll();
	}
	


}
