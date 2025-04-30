package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {


	public static WebElement username(WebDriver driver)
	{
		return driver.findElement(By.name("username")) ;
	}
	
	public static WebElement password(WebDriver driver)
	{
	  return driver.findElement(By.name("password"));
	}
	
	public static WebElement submit(WebDriver driver)
	{
		return driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button--medium')]"));
	}
   
	
	
}
