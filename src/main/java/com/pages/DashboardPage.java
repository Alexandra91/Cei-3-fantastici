package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class DashboardPage extends PageObject {
	@FindBy(id = "sign-in")
	private WebElementFacade signIn;



	public void clickOnSignIn() {
		signIn.click();
	}



}
