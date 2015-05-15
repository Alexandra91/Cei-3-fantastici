package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class VacationTrackerPage extends PageObject{
	@FindBy(id="aui_3_4_0_1_653")
	private WebElementFacade trackbutton;
	
	public void clickOnTrackButton() {
		element(trackbutton).waitUntilVisible();
		trackbutton.click();
	}
	
	
	
	
	
}
