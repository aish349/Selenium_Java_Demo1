package Scenarios;

import org.openqa.selenium.WebDriver;
import PageObjects.ConfigurationPage;
import PageObjects.MenuPage;

public class AddCustomfieldsData {

	public static void CustomFields( WebDriver driver,String FN) throws InterruptedException
	 {			
		MenuPage.customFieldsindropdown(driver).click();
		 Thread.sleep(2000);
		 		ConfigurationPage.customfieldsAddBtn(driver).click();
		 		ConfigurationPage.customfields_fieldname(driver).sendKeys(FN);
		 		ConfigurationPage.customfields_screen(driver).click();
		 		//ConfigurationPage.customfields_type(driver).click();
		 		ConfigurationPage.customfields_Savebtn(driver).click();
		Thread.sleep(3000);
	 }
}
