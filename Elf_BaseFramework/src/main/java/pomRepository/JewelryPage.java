package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryPage {

	//constructor
	public JewelryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	//Data members or attributes
	@FindBy(linkText="Create Your Own Jewelry") private WebElement createYourOwnJewelryLink; 
	
	@FindBy(linkText="Black & White Diamond Heart") private WebElement BlackAndWhiteDiamondHeartLink;
	
	
	//getters methods
	public WebElement getcreateYourOwnJewelryLink() {
		return createYourOwnJewelryLink;
	}

	public WebElement getBlackAndWhiteDiamondHeartLink() {
		return BlackAndWhiteDiamondHeartLink;
	}
	
}
