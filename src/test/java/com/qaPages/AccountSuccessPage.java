package com.qaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSuccessPage {
	public WebDriver driver;

	@FindBy(xpath = "//p[contains(text(), 'Congratulations! Your new account has been successfully created!')]")
	private WebElement accountSuccessCreationMessage;

	@FindBy(linkText = "Continue")
	private WebElement continueButtonToAccount;

	public AccountSuccessPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean retrieveAccountSuccessMessage() {
		return accountSuccessCreationMessage.equals(accountSuccessCreationMessage);

	}

	public AccountPage clickOnContinue() {
		continueButtonToAccount.click();
		return new AccountPage(driver);
	}

}
