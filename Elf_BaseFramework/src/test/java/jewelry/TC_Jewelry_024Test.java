package jewelry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.CreateYourOwnJewelryPage;
import pomRepository.JewelryPage;
import pomRepository.ShoppingCartPage;

/***
 * 
 * @author Chethan V
 *
 */

public class TC_Jewelry_024Test extends Base_Class {

	@Test
	public void jewelry() {


		//***************************************************** Home page **************************************************//
		ExcelUtil excelLib = new ExcelUtil();

		Assert.assertEquals(driver.getTitle(), excelLib.readStringDataFromExcel("Sheet1", 18, 2), "Home page is not displayed successfully");
		Reporter.log("Home page is displayed successfully", true);

		homePage.getjewelryModuleLink().click();
		Reporter.log("jewelry Module Link has been clicked successfully", true);


		//*********************************************** Jewelry module page **************************************************//

		Assert.assertEquals(driver.getTitle(), excelLib.readStringDataFromExcel("Sheet1", 19, 2), "jewelry module page is not displayed successfully");
		Reporter.log("jewelry module page is displayed successfully", true);

		JewelryPage jewelryPage = new JewelryPage(driver);
		jewelryPage.getcreateYourOwnJewelryLink().click();


		//******************************************* Create your own jewelry page **************************************************//

		Assert.assertEquals(driver.getTitle(), excelLib.readStringDataFromExcel("Sheet1", 20, 2), "create your own jewelry page is not displayed successfully");
		Reporter.log("create Your Own Jewelry Page is displayed successfully", true);
		Reporter.log("create Your Own Jewelry Link has been clicked successfully", true);

		CreateYourOwnJewelryPage createYourOwnJewelry = new CreateYourOwnJewelryPage(driver);

		WebElement material = createYourOwnJewelry.getMaterialDropDownList();
		Select select = new Select(material);

		select.selectByValue(""+(excelLib.readAnyDataFromExcelInString("Sheet1", 4, 2)));
		Reporter.log("Silver (1 mm) has been selected from drop down list successfully", true);

		createYourOwnJewelry.getLengthInCmTextField().sendKeys(""+(excelLib.readAnyDataFromExcelInString("Sheet1", 5, 2)));
		Reporter.log("Length in cm has been entered into textField successfully", true);

		createYourOwnJewelry.getHeartPendantRadioButton().click();
		Reporter.log("Star pendant radio button has been clicked successfully", true);

		createYourOwnJewelry.getAddToCartButton().click();
		Reporter.log("Add to cart has been clicked successfully", true);

		createYourOwnJewelry.getShoppingCartLink().click();


		//*************************************** Shopping cart page **************************************************//

		Assert.assertEquals(driver.getTitle(), excelLib.readStringDataFromExcel("Sheet1", 21, 2), "Shopping cart page is not displayed successfully");
		Reporter.log("Shopping cart page is displayed successfully", true);

		ShoppingCartPage shoppingCart = new ShoppingCartPage(driver);
		shoppingCart.getRemoveFromCartCheckBox().click();
		Reporter.log("Add to cart has been clicked successfully", true);
		shoppingCart.getUpdateCartButton().click();
		Reporter.log("Add to cart has been clicked successfully", true);
	}
}
