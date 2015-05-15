package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;



public class LogInPage extends PageObject{
	@FindBy(id = "_58_login")
	private WebElementFacade username;

	@FindBy(id = "_58_password")
	private WebElementFacade password;
	
	@FindBy(className = "aui-button-input-submit")
	private WebElementFacade signInButton;
	
	public void writeOnUsername(String user) {
		username.type(user);
	}

	public void writeOnPassword(String pass) {
		password.type(pass);
	}

	public void clickOnSignInButton() {
		element(signInButton).waitUntilVisible();
		signInButton.click();
	}

}