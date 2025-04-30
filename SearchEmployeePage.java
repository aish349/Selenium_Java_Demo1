package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchEmployeePage {

	public static WebElement empfname(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//label[text()='Employee Name']/following::input)[1]"));
	} 
	
	
	public static void emplastname(WebDriver driver)
	{
		
	}

	public static void userid(WebDriver driver)
	{
	}
	
	public static WebElement searchBtn(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//button[contains(@class,'oxd-button oxd-button--medium')])[2]"));
	}
	
	public static WebElement searchintabledata(WebDriver driver)
	{
		//return driver.findElement(By.xpath("(//div[@class='data'])[2]"));
		return driver.findElement(By.xpath("(//div[@class='data'])[2]"));
	}
	
	
}


