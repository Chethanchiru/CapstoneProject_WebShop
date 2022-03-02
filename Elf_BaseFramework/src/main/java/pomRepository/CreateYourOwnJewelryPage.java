package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateYourOwnJewelryPage {

	//constructor
	public CreateYourOwnJewelryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//Data members or attributes
	@FindBy(id="product_attribute_71_9_15") private WebElement materialDropDownList;
	
	@FindBy(id="product_attribute_71_10_16") private WebElement lengthInCmTextField;
	
	@FindBy(id="product_attribute_71_11_17_50") private WebElement starPendantRadioButton;
	
	@FindBy(id="product_attribute_71_11_17_49") private WebElement heartPendantRadioButton;
	
	@FindBy(id="add-to-cart-button-71") private WebElement addToCartButton;
	
	@FindBy(linkText="Shopping cart") private WebElement shoppingCartLink;
	
	
	//getters methods
	public WebElement getMaterialDropDownList() {
		return materialDropDownList;
	}

	public WebElement getLengthInCmTextField() {
		return lengthInCmTextField;
	}

	public WebElement getHeartPendantRadioButton() {
		return heartPendantRadioButton;
	}

	public WebElement getStarPendantRadioButton() {
		return starPendantRadioButton;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	
	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}
	
	
}
