package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlackAndWhiteDiamondHeartPage {

	//constructor
	public BlackAndWhiteDiamondHeartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//Data members or attributes
	@FindBy(id="add-to-wishlist-button-14") private WebElement addToWishlistButton;

	@FindBy(linkText="Wishlist") private WebElement wishlistLinkText;
	
	@FindBy(id="add-to-cart-button-14") private WebElement addToCartButton;

	@FindBy(linkText="Shopping cart") private WebElement shoppingCartLink;
	
	
	//getters methods
	public WebElement getWishlistLinkText() {
		return wishlistLinkText;
	}

	public WebElement getAddToWishlistButton() {
		return addToWishlistButton;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}
	
	
}
