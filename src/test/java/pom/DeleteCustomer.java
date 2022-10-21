package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomer {
	
	WebDriver ldriver;
	
	public DeleteCustomer(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	By txtDeleteCustomer=By.xpath("");
	
	public void clickDeleteCustomer() {
		ldriver.findElement(txtDeleteCustomer).click();
	}

}
