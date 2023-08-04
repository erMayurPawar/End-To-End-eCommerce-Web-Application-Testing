package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPageObjects {
	
	WebDriver driver;
// search iphone	
	private By SearchIphone = By.xpath("//input[@name='search']");
	private By ClickSearch = By.xpath("//span[@class='input-group-btn']");
	private By ItemPrice = By.xpath("//p[@class='price']");
	private By AdditeminCart = By.xpath("(//button[@type='button'])[9]");
	private By ClearSearch = By.xpath("//input[@name='search']");
// search samsungTab
	private By SearchSamsung = By.xpath("//input[@name='search']");
	private By ClickSearch1 = By.xpath("//span[@class='input-group-btn']");
	private By SamsungTabPrice = By.xpath("(//p[@class='price'])[2]");
	private By AddSamsungTabinCart = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[8]");
// Cart
	private By ClickCart = By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']");
	private By TotalPrice = By.xpath("(//td[@class='text-right'])[12]");
	
	
	
	public CartPageObjects(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement searchitem() {
		return driver.findElement(SearchIphone);
	}
	
	public WebElement clicksearchBt() {
		return driver.findElement(ClickSearch);
	}
	
	public WebElement itemprice() {
		return driver.findElement(ItemPrice);
	}
	
	public WebElement itemincart() {
		return driver.findElement(AdditeminCart);
	}
	
	public WebElement clearsearchBox() {
		return driver.findElement(ClearSearch);
	}
	
	public WebElement searchitem2() {
		return driver.findElement(SearchSamsung);
	}
	
	public WebElement clicksearchBt2() {
		return driver.findElement(ClickSearch1);
	}
	
	public WebElement itemprice2() {
		return driver.findElement(SamsungTabPrice);
	}
	
	public WebElement itemincart2() {
		return driver.findElement(AddSamsungTabinCart);
	}
	
	public WebElement clickcart() {
		return driver.findElement(ClickCart);
	}
	
	public WebElement totalprice() {
		return driver.findElement(TotalPrice);
	}
	

}
