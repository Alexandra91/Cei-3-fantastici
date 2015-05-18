package com.pages.vacation;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class VacationTrackerPage extends PageObject{
	
	@FindBy(css="a[href*='menuItem=vacation-tracker']")
	private WebElementFacade trackbutton;
	
	public void clickOnTrackButton() {
		element(trackbutton).waitUntilVisible();
		trackbutton.click();
	}
	
	@FindBy(name="trackerStartDate")
	private WebElementFacade trackerStartDate;
	
	public void clickOnStartDate() {
		element(trackerStartDate).waitUntilVisible();
		trackerStartDate.click();
	}
	
	@FindBy(name="trackerEndDate")
	private WebElementFacade trackerEndDate;
	
	public void clickOnEndDate() {
		element(trackerEndDate).waitUntilVisible();
		trackerEndDate.click();
	}
	
	@FindBy(id="buildings")
	private WebElementFacade selectBuilding;
	
	public void selectTheBuilding() {
		element(selectBuilding).waitUntilVisible();
		selectBuilding.click();
	}
	
	@FindBy(css="[ul>li:first_child#'_evovacation_WAR_EvoVacationportlet_buildingsALLCheckbox']")
	private WebElementFacade selectAllBuildings;
	
	public void selectAllBuilding() {
		element(selectAllBuildings).waitUntilVisible();
		selectAllBuildings.click();
	}
	
	
	
	
	
	
	
}
