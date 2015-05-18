package com.pages.vacation;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class MyRequestsPage extends PageObject{
	@FindBy(css = "ul.main-menu a[href*='vacation']")
	private WebElementFacade vacation; 
	
	@FindBy(css ="[class='result-column-name']")
	private WebElementFacade typecolumn;
	
	@FindBy(id="_evovacation_WAR_EvoVacationportlet_applyButton")
	private WebElementFacade applybutton; 
	
	@FindBy(css="[class='filter-content']") 
	private WebElementFacade filterrequestscontainer;  
	
	@FindBy(css="div.filter-content span.aui-field-content")
	private List<WebElement> vacationtypelist; 
	
	@FindBy(css="div.filter-content")
	private WebElement vacationTypeContainer; 
	
	@FindBy(css="input[class='aui-field-input aui-field-input-choice']")
	private WebElement checkbox;

	
	public void markOption(String optionName){
		element(vacationTypeContainer).waitUntilVisible();
		List<WebElement> optionsList = vacationTypeContainer.findElements(By.cssSelector("span.aui-field-content"));
		for (WebElement elementNow : optionsList) {
			String elementText = elementNow.getText();
			System.out.println("Element: "  + elementText);
			if(elementText.contains(optionName)){
				elementNow.findElement(By.cssSelector("input[type='checkbox']")).click();
				break;
			}
		}
	}
	
	
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
	
	public void clickOnApplyButton(){
		element(applybutton).waitUntilVisible(); 
		applybutton.click();
	}

	


}