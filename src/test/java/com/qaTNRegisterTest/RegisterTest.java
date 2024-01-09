package com.qaTNRegisterTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qaPages.AccountPage;
import com.qaPages.AccountSuccessPage;
import com.qaPages.HomePage;
import com.qaPages.RegisterPage;

public class RegisterTest {
	public WebDriver driver;
	public HomePage homepage;
	public RegisterPage registerpage;
	public AccountSuccessPage accountsucesspage;
	public AccountPage accountpage;

	
	@BeforeMethod
	public void setup() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo");
	homepage = new HomePage(driver);
	homepage.clickOnMyAccountDropdown();
	registerpage = homepage.clickOnRegister();
	
	}
	@Test
	public void registerWithValidcredentials() {
	registerpage.enterFirstname();
	registerpage.enterLastName();
	registerpage.enterEmail();
	registerpage.enterTelephone();
	registerpage.enterPassword();
	registerpage.enterConfirmPassword();
	registerpage.clickOnPrivacycheckbox();
	registerpage.clickOnNewsLetterButton();
	accountsucesspage = registerpage.clickOnContinueButton();
	Assert.assertTrue(accountsucesspage.retrieveAccountSuccessMessage());
	accountpage = accountsucesspage.clickOnContinue();
	Assert.assertTrue(accountpage.getDisplayStatusOfEditAccountInfo());
	driver.quit();
	
		
		
	}
	@AfterMethod
	public void tearDown() {
		// Close the browser
		driver.quit();
	}
}

