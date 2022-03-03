package jewelry;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.BlackAndWhiteDiamondHeartPage;
import pomRepository.CheckOutPage;
import pomRepository.JewelryPage;
import pomRepository.ShoppingCartPage;

/***
 * 
 * @author Chethan 
 *
 */

public class TC_Jewelry_023Test extends Base_Class{

	@Test
	public void jewelry()  {

		//***************************************************** Home page **************************************************//
		ExcelUtil excelLib = new ExcelUtil();

		Assert.assertEquals(driver.getTitle(), excelLib.readStringDataFromExcel("Sheet1", 13, 2), "Home page is not displayed successfully");
		Reporter.log("Home page is displayed successfully", true);

		homePage.getjewelryModuleLink().click();
		Reporter.log("jewelry module link has been clicked successfully", true);


		//*********************************************** Jewelry module page **************************************************//

		Assert.assertEquals(driver.getTitle(), excelLib.readStringDataFromExcel("Sheet1", 14, 2), "jewelry module page is not displayed successfully");
		Reporter.log("jewelry module page is displayed successfully", true);

		JewelryPage jewelryPage = new JewelryPage(driver);
		jewelryPage.getBlackAndWhiteDiamondHeartLink().click();


		//******************************************* Black and white diamond heart page **************************************************//

		Assert.assertEquals(driver.getTitle(), excelLib.readStringDataFromExcel("Sheet1", 15, 2), "Black and white diamond heart page is not displayed successfully");
		Reporter.log("Black and white diamond heart page is displayed successfully", true);
		Reporter.log("Black and white diamond heart link is clicked successfully", true);

		BlackAndWhiteDiamondHeartPage blackAndWhiteDiamondHeart = new BlackAndWhiteDiamondHeartPage(driver);
		blackAndWhiteDiamondHeart.getAddToCartButton().click();
		Reporter.log("Add to cart button clicked successfully", true);
		blackAndWhiteDiamondHeart.getShoppingCartLink().click();
		Reporter.log("Shopping cart link clicked successfully", true);


		//*************************************** Shopping cart page **************************************************//

		Assert.assertEquals(driver.getTitle(), excelLib.readStringDataFromExcel("Sheet1", 16, 2), "Shopping cart page is not displayed successfully");
		Reporter.log("Shopping cart page is displayed successfully", true);

		ShoppingCartPage shoppingCart = new ShoppingCartPage(driver);
		shoppingCart.getTermsOfServiceCheckBox().click();
		Reporter.log("terms of service check box clicked successfully", true);
		shoppingCart.getCheckOutButton().click();
		Reporter.log("Check out button clicked successfully", true);

		//*************************************** Check out page **************************************************//

		Assert.assertEquals(driver.getTitle(), excelLib.readStringDataFromExcel("Sheet1", 17, 2), "Check out page is not displayed successfully");
		Reporter.log("Check out page is displayed successfully", true);

		CheckOutPage checkOut = new CheckOutPage(driver);
		checkOut.getBillingAddressContinueButton().click();
		Reporter.log("Billing address continue button clicked successfully", true);
		checkOut.getShippingAddressContinueButton().click();
		Reporter.log("Shipping address continue button clicked successfully", true);
		checkOut.getShippingMethodContinueButton().click();
		Reporter.log("Shipping method continue button clicked successfully", true);
		checkOut.getCashOnDeliveryRadioButton().click();
		Reporter.log("Cash on delivery radio button clicked successfully", true);
		checkOut.getPaymentMethodContinueButton().click();
		Reporter.log("Payment method continue button clicked successfully", true);
		checkOut.getPaymentInfoContinueButton().click();
		Reporter.log("Payment info continue button clicked successfully", true);
		checkOut.getConfirmOrderContinueButton().click();
		Reporter.log("Confirm order continue button clicked successfully", true);

	}
}