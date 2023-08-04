package Resources;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class commonmethod {
	
	 public static String getEmail() {
	        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	        StringBuilder salt = new StringBuilder();
	        Random rnd = new Random();
	        while (salt.length() < 10) { // length of the random string.
	            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
	            salt.append(SALTCHARS.charAt(index));
	        }
	        String Email= salt.toString() + "@gmail.com";
	        return Email;
	    }
	 
	 public static void verifyAssertions(WebElement ActualText, String ExpectedText, String msg) {
			
			WebElement a = ActualText;
			String actualText = a.getText();

			String expectedText = ExpectedText;

			SoftAssert sa = new SoftAssert();
			sa.assertEquals(actualText, expectedText, msg);
			sa.assertAll();
			
		}
}		


