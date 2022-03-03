package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * 
 * @author Chethan
 *
 */

public class ShoppingCartPage {

	//constructor
	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Data members or attributes
	@FindBy(id="termsofservice") private WebElement termsOfServiceCheckBox;

	@FindBy(id="checkout") private WebElement checkOutButton;

	@FindBy(name="removefromcart") private WebElement removeFromCartCheckBox;

	@FindBy(name="updatecart") private WebElement updateCartButton;

	//getters methods
	public WebElement getTermsOfServiceCheckBox() {
		return termsOfServiceCheckBox;
	}

	public WebElement getCheckOutButton() {
		return checkOutButton;
	}

	public WebElement getRemoveFromCartCheckBox() {
		return removeFromCartCheckBox;
	}

	public WebElement getUpdateCartButton() {
		return updateCartButton;
	}

}
