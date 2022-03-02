package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//constructor
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//Data members or attributes
	@FindBy(partialLinkText="Jewelry") private WebElement jewelryModuleLink; 
	
	@FindBy(linkText="Log out") private WebElement logoutButton;
	
	
	//getters methods
	public WebElement getjewelryModuleLink() {
		return jewelryModuleLink;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	// Business Logic or Action methods or Behavior
	public void logout() {
		logoutButton.click();
	}
}
