package TestCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModel.CartPageObjects;
import Resources.BaseClass;
import Resources.commondata;

public class VerifyAddToCart extends BaseClass {

	@Test
	public void CartTest() throws InterruptedException {

		CartPageObjects cpo = new CartPageObjects(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
// Search Box
		cpo.searchitem().sendKeys(commondata.searchBox); 
		
		cpo.clicksearchBt().click(); 

		
// Select Iphone, Grab Price and Convert into Double
		String itemprice = cpo.itemprice().getText(); 
		
		String[] ip = itemprice.split("\\s+"); 
		
		String ipwithDollar = ip[0]; 
		
		String RemoveDollar = ip[0].replaceAll("[$]", ""); 
		
		double a = Double.parseDouble(RemoveDollar); 
		
		
// Add Item to Cart
		cpo.itemincart().click(); 
		
		
// Clear Search
		cpo.clearsearchBox().clear(); 

		
// Search SamsungTab, Grab Price and Convert into Double
		cpo.searchitem2().sendKeys(commondata.searchBox2);
		
		cpo.clicksearchBt2().click(); 
		
		String Itemprice2 = cpo.itemprice2().getText(); 
		
		String[] ip2 = Itemprice2.split("\\s+");
		
		String ip2withDollar = ip2[0];
		
		String RemoveDollar1 = ip2[0].replaceAll("[$]", "");
		
		double b = Double.parseDouble(RemoveDollar1);

		
// Add SamsumgTab into Cart
		cpo.itemincart2().click(); 
		

// Grab Total Price Iphone + SamsungTab
		cpo.clickcart().click();
		
		String totalprice = cpo.totalprice().getText();
		
		String RemoveDollar2 = totalprice.replaceAll("[$]", "");
		
		double d = Double.parseDouble(RemoveDollar2);

		
// Compare Price Total Price = Iphone Price + Samsung Price
		double c = a + b;
		
		System.out.println(c);

		Assert.assertEquals(c, d);
		
		driver.close();

	}

}
