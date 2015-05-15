package com.pages;

import org.junit.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class VacationsPage extends PageObject {
	@FindBy(css = "ul.main-menu a[href*='vacation']")
	private WebElementFacade vacation; 
	
	@FindBy(css ="[class='result-column-name']")
	private WebElementFacade typecolumn;
	
	public void clickOnVacationButton() {
		element(vacation).waitUntilVisible();
		vacation.click();
	}

	public void clickOnTypeColumn(){
		element(typecolumn).waitUntilVisible();
		typecolumn.click();
	}

	public void clickMultipleTimes(int times){
		boolean x = true;
		for(int i=0;i<times;i++){
		element(typecolumn).waitUntilVisible(); 
		typecolumn.click(); 
			if(!typecolumn.isDisplayed()){
				x=false;
			Assert.assertFalse("The table does not exists anymore", x);
			}
		
		}	
	} 
	
	
}	

