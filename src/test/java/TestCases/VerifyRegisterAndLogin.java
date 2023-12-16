package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.RegisterPageObjects;
import Resources.BaseClass;
import Resources.commondata;
import Resources.commonmethod;

public class VerifyRegisterAndLogin extends BaseClass {

	String email = commonmethod.getEmail();

	@Test
	public void VerifyValidRegister() throws InterruptedException {

		RegisterPageObjects rpo = new RegisterPageObjects(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

// Valid Register
		rpo.MyAccount1().click();
		
		rpo.Register().click();
		
		rpo.firstname().sendKeys(commondata.firstname);
		
		rpo.lastname().sendKeys(commondata.lastname);
		
		rpo.email().sendKeys(email);
		
		rpo.telephone().sendKeys(commondata.telephone);
		
		rpo.password().sendKeys(commondata.password);
		
		rpo.comfirmpassword().sendKeys(commondata.comfirmpassword);
		
		rpo.checkbox().click();
		
		rpo.continue1().click();
		
		commonmethod.verifyAssertions(rpo.ValidRegisteractualText(), commondata.validRegisterexpectedText, "valid msg not showing");
		
		rpo.continue2().click();

		
// Logout
		rpo.MyAccount2().click();
		
		rpo.logout().click();
		
		rpo.continue3().click();

		
// Invalid Register
		rpo.MyAccount1().click();
		
		rpo.Register().click();
		
		rpo.continue1().click();
		
		commonmethod.verifyAssertions(rpo.FirstnameactualerrorText(), commondata.FirstnameErrorText, "valid error msg is not showing");
		
		commonmethod.verifyAssertions(rpo.LastnameactualerrorText(), commondata.LastnameErrorText, "valid error msg is not showing");
		
		commonmethod.verifyAssertions(rpo.EmailactualerrorText(), commondata.EmailErrorText, "valid error msg is not showing");
		
		commonmethod.verifyAssertions(rpo.TelephoneactualerrorText(), commondata.TelephoneErrorText, "valid error msg is not showing");
		
		commonmethod.verifyAssertions(rpo.passwordactualerrorText(), commondata.passwordErrorText, "valid error msg is not showing");
		
		rpo.home().click();
		
		driver.close();

	}

	@Test(priority = 1)
	public void ValidLogin() throws InterruptedException {

		LoginPageObjects lpo = new LoginPageObjects(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

// Valid Login
		lpo.myaccount().click();
		
		lpo.selectlogin().click();
		
		lpo.email().sendKeys(email);
		
		lpo.password().sendKeys("test123");
		
		lpo.clicklogin().click();

		
// Logout
		lpo.myaccount().click();
		
		lpo.logout().click();
		
		lpo.next().click();

		
// Invalid Login
		lpo.myaccount().click();
		
		lpo.selectlogin().click();
		
		lpo.clicklogin().click();
		
		commonmethod.verifyAssertions(lpo.actualerrorText(), commondata.InvalidloginerrorText, "valid Error Text not showing");
		
		lpo.home().click();
		
		driver.quit();

	}

}
