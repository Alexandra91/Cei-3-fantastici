package com.pages;

import org.junit.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class VacationsPage extends PageObject {
	@FindBy(css = "ul.main-menu a[href*='vacation']")
	private WebElementFacade vacation; 
	
	
	public void clickOnVacationButton() {
		element(vacation).waitUntilVisible();
		vacation.click();
	}
}
