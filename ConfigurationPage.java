package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfigurationPage {
	
	public static WebElement customfieldsAddBtn(WebDriver driver)
	{
		return driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button--medium')]"));
	}
	
	public static WebElement customfields_fieldname(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
	}
	
	public static WebElement customfields_screen(WebDriver driver)
	{
		
		return driver.findElement(By.xpath("(//i[contains(@class,'oxd-icon bi-caret-down-fill')])[2]"));
	}
	/*
	public static WebElement customfields_type(WebDriver driver)
	{
		return driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button--medium')]"));
	}
	*/
	public static WebElement customfields_Savebtn(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//button[contains(@class,'oxd-button oxd-button--medium')])[2]"));
	}
	
}


