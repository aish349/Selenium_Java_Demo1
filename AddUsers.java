package Scenarios;

import org.openqa.selenium.WebDriver;
import PageObjects.AddEmployeePage;
import PageObjects.MenuPage;

public class AddUsers {

	 public static void addemployee( WebDriver driver,String fn, String ln, String id) throws InterruptedException
	 {			
		 MenuPage.addEmployeeInMenu(driver).click();
		 Thread.sleep(2000);
				AddEmployeePage.firstname(driver).sendKeys(fn);
				AddEmployeePage.lastname(driver).sendKeys(ln);
				AddEmployeePage.userid(driver).sendKeys(id);
				AddEmployeePage.saveUser(driver).click();
			 
		Thread.sleep(3000);
	 }
	
	
}

