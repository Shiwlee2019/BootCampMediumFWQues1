package com.qaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
public WebDriver driver;
	
	@FindBy(id = "input-firstname")
	private WebElement firstNameField;

	@FindBy(id = "input-lastname")
	private WebElement lastNameField;
	
	@FindBy(id = "input-email")
	private WebElement emailField;
	
	@FindBy(id = "input-telephone")
	private WebElement telephoneField;
	
	@FindBy(id = "input-password")
	private WebElement passwordField;

	@FindBy(id = "input-confirm")
	private WebElement confirmPasswordField;
	
	@FindBy(name = "agree")
	private WebElement privacyPolicyCheckBox;
	
	@FindBy(xpath = "//input[@name = 'newsletter' and @value = '1']")
	private WebElement newsLetterRadioButton;
	
	@FindBy(css = "input.btn.btn-primary")
	private WebElement continueButton;
	
	public RegisterPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterFirstname() {
		firstNameField.sendKeys("Shiwlee");
	}
	public void enterLastName() {
		lastNameField.sendKeys("Rahman");
	}
	
	public void enterEmail() {
		emailField.sendKeys("Shiwlee2018@gmail.com");
	}
	public void enterTelephone() {
		telephoneField.sendKeys("9296090211");
	}
	public void enterPassword() {
		passwordField.sendKeys("Rima2022");
	}
	public void enterConfirmPassword() {
		confirmPasswordField.sendKeys("Rima2022");
		
	}
	public void clickOnPrivacycheckbox() {
		privacyPolicyCheckBox.click();
	}
	public void clickOnNewsLetterButton() {
		newsLetterRadioButton.click();
	}
	public AccountSuccessPage clickOnContinueButton() {
		continueButton.submit();
		return new  AccountSuccessPage (driver);
	}
	
}

