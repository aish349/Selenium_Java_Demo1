package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddEmployeePage {
	


	public static WebElement firstname(WebDriver driver)
	{
		return driver.findElement(By.name("firstName"));
	}
	
	public static WebElement lastname(WebDriver driver)
	{
		return driver.findElement(By.name("lastName"));
	}

	public static WebElement userid(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
	}
	
	public static WebElement saveUser(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//button[contains(@class,'oxd-button oxd-button--medium')])[2]"));
	}
}

