package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(css="")
	@CacheLookup
	WebElement clkButton;
	
	public void setUsername(String username) {
		txtUsername.sendKeys(username);
	}

	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void clickLoginButton() {
		clkButton.click();
	}
}
