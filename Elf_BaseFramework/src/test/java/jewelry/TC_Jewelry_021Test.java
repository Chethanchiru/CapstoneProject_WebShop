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

/***
 * 
 * @author Chethan V
 *
 */

public class TC_Jewelry_021Test extends Base_Class {

	@Test
	public void jewelry() {

		//***************************************************** Home page **************************************************//

		ExcelUtil excelLib = new ExcelUtil();

		Assert.assertEquals(driver.getTitle(), excelLib.readStringDataFromExcel("Sheet1", 6, 2), "Home page is not displayed successfully");
		Reporter.log("Home page is displayed successfully", true);

		homePage.getjewelryModuleLink().click();
		Reporter.log("jewelry Module Link has been clicked successfully", true);


		//*********************************************** Jewelry module page **************************************************//

		Assert.assertEquals(driver.getTitle(), excelLib.readStringDataFromExcel("Sheet1", 7, 2), "jewelry module page is not displayed successfully");
		Reporter.log("jewelry module page is displayed successfully", true);

		JewelryPage jewelryPage = new JewelryPage(driver);
		jewelryPage.getcreateYourOwnJewelryLink().click();


		//******************************************* Create your own jewelry page **************************************************//

		Assert.assertEquals(driver.getTitle(), excelLib.readStringDataFromExcel("Sheet1", 8, 2), "create your own jewelry page is not displayed successfully");
		Reporter.log("create your own jewelry page is displayed successfully", true);

		Reporter.log("create your own jewelry link has been clicked successfully", true);

		CreateYourOwnJewelryPage createYourOwnJewelry = new CreateYourOwnJewelryPage(driver);

		WebElement material = createYourOwnJewelry.getMaterialDropDownList();
		Select select = new Select(material);

		select.selectByValue(""+(excelLib.readAnyDataFromExcelInString("Sheet1", 2, 2)));
		Reporter.log("Gold (1 mm) has been selected from drop down list successfully", true);

		createYourOwnJewelry.getLengthInCmTextField().sendKeys(""+(excelLib.readAnyDataFromExcelInString("Sheet1", 3, 2)));
		Reporter.log("Length in cm has been entered into TextField successfully", true);

		createYourOwnJewelry.getStarPendantRadioButton().click();
		Reporter.log("Star pendant radio button has been clicked successfully", true);

		createYourOwnJewelry.getAddToCartButton().click();
		Reporter.log("Add to cart has been clicked successfully", true);
	}
}
