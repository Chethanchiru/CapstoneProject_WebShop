package jewelry;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.BlackAndWhiteDiamondHeartPage;
import pomRepository.JewelryPage;
import pomRepository.WishListPage;

/***
 * 
 * @author Chethan V
 *
 */

public class TC_Jewelry_022Test extends Base_Class {

	@Test
	public void jewelry() {

		//***************************************************** Home page **************************************************//

		ExcelUtil excelLib = new ExcelUtil();

		Assert.assertEquals(driver.getTitle(), excelLib.readStringDataFromExcel("Sheet1", 9, 2), "Home page is not displayed successfully");
		Reporter.log("Home page is displayed successfully", true);

		homePage.getjewelryModuleLink().click();
		Reporter.log("jewelry module link has been clicked successfully", true);


		//*********************************************** Jewelry module page **************************************************//

		Assert.assertEquals(driver.getTitle(), excelLib.readStringDataFromExcel("Sheet1", 10, 2), "jewelry module page is not displayed successfully");
		Reporter.log("jewelry module page is displayed successfully", true);

		JewelryPage jewelryPage = new JewelryPage(driver);
		jewelryPage.getBlackAndWhiteDiamondHeartLink().click();


		//******************************************* Black and white diamond heart page **************************************************//

		Assert.assertEquals(driver.getTitle(), excelLib.readStringDataFromExcel("Sheet1", 11, 2), "Black and white diamond heart page is not displayed successfully");
		Reporter.log("Black and white diamond heart page is displayed successfully", true);
		Reporter.log("Black and white diamond heart link is clicked successfully", true);

		BlackAndWhiteDiamondHeartPage blackAndWhiteDiamondHeart = new BlackAndWhiteDiamondHeartPage(driver);
		blackAndWhiteDiamondHeart.getAddToWishlistButton().click();
		Reporter.log("Add to wish list button clicked successfully", true);
		blackAndWhiteDiamondHeart.getWishlistLinkText().click();


		//********************************************* Wish list page **************************************************//

		Assert.assertEquals(driver.getTitle(), excelLib.readStringDataFromExcel("Sheet1", 12, 2), "Wish list page is not displayed successfully");
		Reporter.log("Wish list page is displayed successfully", true);

		WishListPage wishList = new WishListPage(driver);
		wishList.getAddtocartCheckBox().click();
		Reporter.log("Add to cart Check box is clicked successfully", true);
		wishList.getAddtocartbutton().click();
		Reporter.log("Add to cart Check button is clicked successfully", true);

	}
}
