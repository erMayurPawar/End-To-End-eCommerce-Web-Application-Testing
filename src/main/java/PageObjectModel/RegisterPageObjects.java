package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageObjects {
	
	WebDriver driver;
// Valid Register
	private By MyAccount1 = By.xpath("//span[contains (text(),'My Account')]");
	private By Register = By.xpath("//a[contains(text(),'Register')]");
	private By firstname = By.xpath("//input[@name='firstname']");
	private By lastname = By.xpath("//input[@name='lastname']");
	private By email = By.xpath("//input[@name='email']");
	private By telephone = By.xpath("//input[@name='telephone']");
	private By password = By.xpath("//input[@name='password']");
	private By comfirmpassword = By.xpath("//input[@id='input-confirm']");
	private By checkbox = By.xpath("//input[@type='checkbox']");
	private By continue1 = By.xpath("//input[@value='Continue']");
	private By ValidRegisteractualText = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
// Logout
	private By continue2 = By.xpath("//a[@class='btn btn-primary']");
	private By MyAccount2 = By.xpath("//span[contains (text(),'My Account')]");
	private By logout = By.xpath("//a[contains(text(),'Logout')]");
	private By continue3 = By.xpath("//a[@class='btn btn-primary']");
// Invalid Register	
	private By FirstnameactualerrorText = By.xpath("//div[contains(text(),'First Name must be between 1 and 32 characters!')]");
	private By LastnameactualerrorText = By.xpath("//div[contains(text(),'Last Name must be between 1 and 32 characters!')]");
	private By EmailactualerrorText = By.xpath("//div[contains(text(),'E-Mail Address does not appear to be valid!')]");
	private By TelephoneactualerrorText = By.xpath("//div[contains(text(),'Telephone must be between 3 and 32 characters!')]");
	private By passwordactualerrorText = By.xpath("//div[contains(text(),'Password must be between 4 and 20 characters!')]");
	private By home = By.xpath("//i[@class='fa fa-home']");
	
	
	public RegisterPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement MyAccount1() {
		return driver.findElement(MyAccount1);
	}
	
	public WebElement Register() {
		return driver.findElement(Register);
	}
	
	public WebElement firstname() {
		return driver.findElement(firstname);
	}
	
	public WebElement lastname() {
		return driver.findElement(lastname);
	}
	
	public WebElement email() {
		return driver.findElement(email);
	}
	
	public WebElement telephone() {
		return driver.findElement(telephone);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement comfirmpassword() {
		return driver.findElement(comfirmpassword);
	}
	
	public WebElement checkbox() {
		return driver.findElement(checkbox);
	}
	
	public WebElement continue1() {
		return driver.findElement(continue1);
	}
	
	public WebElement ValidRegisteractualText() {
		return driver.findElement(ValidRegisteractualText);
	}
	
	public WebElement continue2() {
		return driver.findElement(continue2);
	}
	
	public WebElement MyAccount2() {
		return driver.findElement(MyAccount2);
	}
	
	public WebElement logout() {
		return driver.findElement(logout);
	}
	
	public WebElement continue3() {
		return driver.findElement(continue3);
	}
	
	public WebElement FirstnameactualerrorText() {
		return driver.findElement(FirstnameactualerrorText);
	}
	
	public WebElement LastnameactualerrorText() {
		return driver.findElement(LastnameactualerrorText);
	}
	
	public WebElement EmailactualerrorText() {
		return driver.findElement(EmailactualerrorText);
	}
	
	public WebElement TelephoneactualerrorText() {
		return driver.findElement(TelephoneactualerrorText);
	}
	
	public WebElement passwordactualerrorText() {
		return driver.findElement(passwordactualerrorText);
	}
	
	public WebElement home() {
		return driver.findElement(home);
	}

}
