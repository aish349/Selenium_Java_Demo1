package com.selenium.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PageObjects.ConfigurationPage;
import PageObjects.MenuPage;
import Scenarios.*;

public class LoginPageTest {

	public static void main(String[] args) 
 {
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\EdgeDriver\\msedgedriver.exe");
        // Initialize WebDriver
        WebDriver driver = new EdgeDriver();
		try {
		//Step 1: Set up Edge WebDriver path
		
        // Open webpage
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Maximize the browser window
        driver.manage().window().maximize();
        //Login
        LoginUser.login(driver);  
        Thread.sleep(3000);
        
        MenuPage.PIMOption(driver).click();
      /*  //Add 4 users
        AddUsers.addemployee(driver,"DDSS1","DDSS2","DDSS3");
        AddUsers.addemployee(driver,"FFSS11","DDSS12","FFSS13");
        AddUsers.addemployee(driver,"GGSS21","DDSS22","GGSS23");
        AddUsers.addemployee(driver,"LLSS31","DDSS32","LLSS33");
       
        MenuPage.PIMOption(driver).click();
        //Search all 4users
        SearchUser.searchuserbyfname(driver, "DDSS1");
        SearchUser.searchuserbyfname(driver, "FFSS11");
        SearchUser.searchuserbyfname(driver, "GGSS21");
        SearchUser.searchuserbyfname(driver, "LLSS31");
       */
        Thread.sleep(3000);
        MenuPage.configurationdropdown(driver).click();
        //MenuPage.customFieldsindropdown(driver).click();
        Thread.sleep(2000);
        ConfigurationPage.customfieldsAddBtn(driver).click();
        
        AddCustomfieldsData.CustomFields(driver,"Employee ADDRESS");
        
        ConfigurationPage.customfields_screen(driver).click();
        //ConfigurationPage.customfields_type(driver).click();
        ConfigurationPage.customfields_Savebtn(driver).click();
       
        
        //MenuPage.userprofiledropdown(driver).click();
       // MenuPage.logout(driver).click();
        
		} catch (Exception e) {
		    System.out.println("⚠️ Error occurred: " + e.getMessage());
		} finally {
		    System.out.println("===TEST Completed===");
		}
}
}
