package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	WebDriver driver;
// Valid Login	
	private By MyAccount = By.xpath("//span[contains (text(),'My Account')]");
	private By selectLogin = By.xpath("//a[contains(text(),'Login')]");
	private By Email = By.xpath("//input[@id='input-email']");
	private By password = By.xpath("//input[@id='input-password']");
	private By clicklogin = By.xpath("//input[@value='Login']");
// Logout
	private By Logout = By.xpath("//a[contains(text(),'Logout')]");
	private By next = By.xpath("//a[@class='btn btn-primary']");
// Invalid Login
	private By ActualerrorText = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	private By home = By.xpath("//i[@class='fa fa-home']");
	
	
	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement myaccount() {
		return driver.findElement(MyAccount);
	}
	
	public WebElement selectlogin() {
		return driver.findElement(selectLogin);
	}
	
	public WebElement email() {
		return driver.findElement(Email);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement clicklogin() {
		return driver.findElement(clicklogin);
	}
	
	public WebElement logout() {
		return driver.findElement(Logout);
	}
	
	public WebElement next() {
		return driver.findElement(next);
	}
	
	public WebElement actualerrorText() {
		return driver.findElement(ActualerrorText);
	}
	
	public WebElement home() {
		return driver.findElement(home);
	}

}
