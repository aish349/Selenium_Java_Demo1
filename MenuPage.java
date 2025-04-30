package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {

	public static WebElement PIMOption(WebDriver driver)
	{
		return driver.findElement(By.linkText("PIM"));
	}
	public static WebElement addEmployeeInMenu(WebDriver driver)
	{
		return driver.findElement(By.linkText("Add Employee"));

	}
	
	public static WebElement employeeListinMenu(WebDriver driver)
	{
		return driver.findElement(By.linkText("Employee List"));

	}
	
	public static WebElement logout(WebDriver driver)
	{
		//return driver.findElement(By.linkText("Logout"));
		return driver.findElement(By.linkText("Logout"));
	}
	
	public static WebElement userprofiledropdown(WebDriver driver)
	{
		return driver.findElement(By.xpath("//img[@alt='profile picture']"));

	}
	
	
	 public static WebElement configurationdropdown(WebDriver driver)
		{
			return driver.findElement(By.xpath("//i[@class='oxd-icon bi-chevron-down']"));

		}
	
	 public static WebElement customFieldsindropdown(WebDriver driver)
		{
			return driver.findElement(By.xpath("//a[normalize-space(text())='Custom Fields']"));

		}
}


