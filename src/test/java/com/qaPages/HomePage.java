package com.qaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
public WebDriver driver;
	
	@FindBy(linkText = "My Account")
	private WebElement accountDropdown;
	
	@FindBy(linkText = "Register")
	private WebElement registeroption;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnMyAccountDropdown() {
		accountDropdown.click();
	}
	public RegisterPage clickOnRegister() {
		registeroption.click();
		return  new RegisterPage(driver);
	}

	
	}
	
