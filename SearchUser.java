package Scenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import PageObjects.MenuPage;
import PageObjects.SearchEmployeePage;

public class SearchUser {
	
	public static void searchuserbyfname(WebDriver driver, String name) throws InterruptedException
	{
		MenuPage.employeeListinMenu(driver).click();
		Thread.sleep(2000);
		
		WebElement nameField = SearchEmployeePage.empfname(driver);
	    nameField.clear();
	    nameField.sendKeys(name);
		
		//SearchEmployeePage.empfname(driver).click();
	//	SearchEmployeePage.empfname(driver).sendKeys(name);
		SearchEmployeePage.searchBtn(driver).click();
		Thread.sleep(3000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='oxd-table-body']/div"));
	    boolean found = false;

	    for (WebElement row : rows) {
	        String rowText = row.getText();
	        if (rowText.contains(name)) {
	            System.out.println("✅ Verified: " + name);
	            found = true;
	            break;
	        }
	    }
		if (!found) {
		    System.out.println("❌ Employee name not found: " + name);
		}

		 Thread.sleep(3000);
		
	}	

}
