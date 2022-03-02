package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {

	//constructor
	public CheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//Data members or attributes
	@FindBy(xpath="//input[@onclick='Billing.save()']") private WebElement billingAddressContinueButton; 

	@FindBy(xpath="//input[@onclick='Shipping.save()']") private WebElement shippingAddressContinueButton;
	
	@FindBy(xpath="//input[@onclick='ShippingMethod.save()']") private WebElement shippingMethodContinueButton;
	
	@FindBy(id="paymentmethod_0") private WebElement cashOnDeliveryRadioButton; 
	
	@FindBy(xpath="//input[@onclick='PaymentMethod.save()']") private WebElement paymentMethodContinueButton;
	
	@FindBy(xpath="//input[@onclick='PaymentInfo.save()']") private WebElement paymentInfoContinueButton;
	
	@FindBy(xpath="//input[@onclick='ConfirmOrder.save()']") private WebElement confirmOrderContinueButton;
	
	
	//getters methods
	public WebElement getBillingAddressContinueButton() {
		return billingAddressContinueButton;
	}

	public WebElement getShippingAddressContinueButton() {
		return shippingAddressContinueButton;
	}

	public WebElement getShippingMethodContinueButton() {
		return shippingMethodContinueButton;
	}

	public WebElement getCashOnDeliveryRadioButton() {
		return cashOnDeliveryRadioButton;
	}

	public WebElement getPaymentMethodContinueButton() {
		return paymentMethodContinueButton;
	}

	public WebElement getPaymentInfoContinueButton() {
		return paymentInfoContinueButton;
	}

	public WebElement getConfirmOrderContinueButton() {
		return confirmOrderContinueButton;
	}
	
}
