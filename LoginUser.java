package Scenarios;

import org.openqa.selenium.WebDriver;

import PageObjects.LoginPage;
public class LoginUser {

	public static void login (WebDriver driver)
	{
		 LoginPage.username(driver).sendKeys("Admin");
	       LoginPage.password(driver).sendKeys("admin123");
	       LoginPage.submit(driver).click();
	     
	}
}	
