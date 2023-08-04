package TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

import PageObjectModel.HeaderPageObjects;
import Resources.BaseClass;
import Resources.commondata;
import Resources.commonmethod;

@Test
public class VerifyHeader extends BaseClass {

	public void VerifyDesktopHeader() throws InterruptedException {

		HeaderPageObjects hpo = new HeaderPageObjects(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

// Headers
		hpo.clickcurrency().click();
		commonmethod.verifyAssertions(hpo.currencydropdown(), commondata.currencydropdown, "currency header is not working");
		
		commonmethod.verifyAssertions(hpo.clicktelephone(), commondata.telephoneNo, "telephone header is not working");
		
		hpo.myAccount().click();
		commonmethod.verifyAssertions(hpo.myAccountdropdown(), commondata.myAccountdropdown, "myAccount header is not working");
		
		hpo.clickwishlist().click();
		commonmethod.verifyAssertions(hpo.wishlistpagetext(), commondata.wishlistpageText, "wishlist header is not working");
		
		hpo.shoppingcart().click();
		commonmethod.verifyAssertions(hpo.shoppingpagetext(), commondata.shoppingpageText, "shopping header is not working");
		
		hpo.continueBt().click();
		
		hpo.addtocart().click();
		
		hpo.clickcheckout().click();
		commonmethod.verifyAssertions(hpo.checkoutpagetext(), commondata.checkoutpageText, "checkout header is not working");

// Menu
		hpo.desktop().click();
		List<WebElement> a = hpo.desktoplist();
		for(WebElement m:a) {
			m.click();
			break;
		}
		
		hpo.laptops().click();
		List<WebElement> b = hpo.laptopslist();
		for(WebElement m:b) {
			m.click();
			break;
		}
		
		hpo.components().click();
		List<WebElement> c = hpo.componentslist();
		for(WebElement m:c) {
			m.click();
			break;
		}
		
		hpo.tablets().click();
		commonmethod.verifyAssertions(hpo.tabletspagetext(), commondata.tabletspageText, "valid Text not showing");
		
		hpo.software().click();
		commonmethod.verifyAssertions(hpo.softwarepageText(), commondata.softwarepageText, "valid Text not showing");
		
		hpo.phones().click();
		commonmethod.verifyAssertions(hpo.phonespageText1(), commondata.phonespageText1, "valid Text not showing");
		commonmethod.verifyAssertions(hpo.phonespageText2(), commondata.phonespageText2, "valid Text not showing");
		
		hpo.cameras().click();
		commonmethod.verifyAssertions(hpo.cameraspageText1(), commondata.cameraspageText1, "valid Text not showing");
		commonmethod.verifyAssertions(hpo.cameraspageText2(), commondata.cameraspageText2, "valid Text not showing");
		
		hpo.mp3players().click();
		List<WebElement> d = hpo.mp3playerslist();
		for(WebElement m:d) {
			m.click();
			break;
		}
		
		hpo.continueBt2().click();
		
		driver.close();


	}
}
