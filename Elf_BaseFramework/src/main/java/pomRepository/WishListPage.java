package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {

	//constructor
	public WishListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Data members or attributes
	@FindBy(name="addtocart") private WebElement addtocartCheckBox;
	
	@FindBy(name="addtocartbutton") private WebElement addtocartbutton;

	//getters methods
	public WebElement getAddtocartCheckBox() {
		return addtocartCheckBox;
	}

	public WebElement getAddtocartbutton() {
		return addtocartbutton;
	}
}
