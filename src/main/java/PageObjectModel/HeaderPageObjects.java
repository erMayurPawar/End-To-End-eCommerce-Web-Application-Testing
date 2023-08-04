package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPageObjects {
	
	WebDriver driver;
// Header
	private By ClickonCurrency = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[1]");
	private By CurrencyDropdown = By.xpath("//button[contains(text(),'€ Euro')]");
	private By ClickonTelephone = By.xpath("//span[normalize-space()='123456789']");
	private By ClickMyAccount = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[3]");
	private By myAccountDropdown = By.xpath("//a[contains(text(),'Register')]");
	private By ClickonWishList = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[4]");
	private By WishListPageText = By.xpath("//h2[contains(text(),'Returning Customer')]");
	private By ShoppingCart = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[5]");
	private By ShoppingPageText = By.xpath("//h1[contains(text(),'Shopping Cart')]");
	private By ContinueBt = By.xpath("//a[@class='btn btn-primary']");
	private By AddToCart = By.xpath("(//span[contains(text(),'Add to Cart')])[2]");
	private By ClickonCheckout = By.xpath("//span[contains(text(),'Checkout')]");
	private By CheckoutPageText = By.xpath("//a[contains(text(),'Checkout')]");
// Menu
	private By Desktop = By.xpath("(//a[@class='dropdown-toggle'])[2]");
	private By DesktopList = By.xpath("(//ul[@class='list-unstyled'])[1]");
	private By Laptops = By.xpath("(//a[@class='dropdown-toggle'])[3]");
	private By LaptopsList = By.xpath("(//ul[@class='list-unstyled'])[2]");
	private By Components = By.xpath("(//a[@class='dropdown-toggle'])[4]");
	private By ComponentsList = By.xpath("(//ul[@class='list-unstyled'])[3]");
	private By Tablets = By.xpath("//a[contains(text(),'Tablets')]");
	private By TabletsPageText = By.xpath("//a[contains(text(),'Samsung Galaxy Tab 10.1')]");
	private By Software = By.xpath("(//a[contains(text(),'Software')])[1]");
	private By SoftwarePageText = By.xpath("//h2[normalize-space()='Software']");
	private By Phones = By.xpath("(//a[contains(text(),'Phones & PDAs')])[1]");
	private By PhonesPageText1 = By.xpath("//a[contains(text(),'HTC Touch HD')]");
	private By PhonesPageText2 = By.xpath("//a[contains(text(),'Palm Treo Pro')]");
	private By Cameras = By.xpath("(//a[contains(text(),'Cameras')])[2]");
	private By CamerasPageText1 = By.xpath("//a[contains(text(),'Canon EOS 5D')]");
	private By CamerasPageText2 = By.xpath("//a[contains(text(),'Nikon D300')]");
	private By Mp3Players = By.xpath("(//a[@class='dropdown-toggle'])[5]");
	private By Mp3PlayersList = By.xpath("(//div[@class='dropdown-inner'])[4]");
	private By ContinueBt2 = By.xpath("//a[contains(text(),'Continue')]");

	
	public HeaderPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement clickcurrency() {
		return driver.findElement(ClickonCurrency);
	}
	
	public WebElement currencydropdown() {
		return driver.findElement(CurrencyDropdown);
	}
	
	public WebElement clicktelephone() {
		return driver.findElement(ClickonTelephone);
	}
	
	public WebElement myAccount() {
		return driver.findElement(ClickMyAccount);
	}
	
	public WebElement myAccountdropdown() {
		return driver.findElement(myAccountDropdown);
	}
	
	public WebElement clickwishlist() {
		return driver.findElement(ClickonWishList);
	}
	
	public WebElement wishlistpagetext() {
		return driver.findElement(WishListPageText);
	}
	
	public WebElement shoppingcart() {
		return driver.findElement(ShoppingCart);
	}
	
	public WebElement shoppingpagetext() {
		return driver.findElement(ShoppingPageText);
	}
	
	public WebElement continueBt() {
		return driver.findElement(ContinueBt);
	}
	
	public WebElement addtocart() {
		return driver.findElement(AddToCart);
	}
	
	public WebElement clickcheckout() {
		return driver.findElement(ClickonCheckout);
	}
	
	public WebElement checkoutpagetext() {
		return driver.findElement(CheckoutPageText);
	}
	
	public WebElement desktop() {
		return driver.findElement(Desktop);
	}
	
	public List<WebElement> desktoplist() {
		return (List<WebElement>) driver.findElements(DesktopList);
	}
	
	public WebElement laptops() {
		return driver.findElement(Laptops);
	}
	
	public List<WebElement> laptopslist() {
		return (List<WebElement>) driver.findElements(LaptopsList);
	}
	
	public WebElement components() {
		return driver.findElement(Components);
	}
	
	public List<WebElement> componentslist() {
		return (List<WebElement>) driver.findElements(ComponentsList);
	}
	
	public WebElement tablets() {
		return driver.findElement(Tablets);
	}
	
	public WebElement tabletspagetext() {
		return driver.findElement(TabletsPageText);
	}
	
	public WebElement software() {
		return driver.findElement(Software);
	}
	
	public WebElement softwarepageText() {
		return driver.findElement(SoftwarePageText);
	}
	
	public WebElement phones() {
		return driver.findElement(Phones);
	}
	
	public WebElement phonespageText1() {
		return driver.findElement(PhonesPageText1);
	}
	
	public WebElement phonespageText2() {
		return driver.findElement(PhonesPageText2);
	}
	
	public WebElement cameras() {
		return driver.findElement(Cameras);
	}
	
	public WebElement cameraspageText1() {
		return driver.findElement(CamerasPageText1);
	}
	
	public WebElement cameraspageText2() {
		return driver.findElement(CamerasPageText2);
	}
	
	public WebElement mp3players() {
		return driver.findElement(Mp3Players);
	}
	
	public List<WebElement> mp3playerslist() {
		return (List<WebElement>) driver.findElements(Mp3PlayersList);
	}
	
	public WebElement continueBt2() {
		return driver.findElement(ContinueBt2);
	}

}
