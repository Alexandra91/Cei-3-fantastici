package com.pages;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class MyrequestsContainerPage extends PageObject{
	@FindBy(css="td[class*='col-4']") 
	List<WebElement> coloanaType;

	public void checkVacationType(String vactype){
		boolean check=false;
		for(WebElement element: coloanaType){
		if (!element.getText().contentEquals(vactype)) {
			check=true;
		}	
			Assert.assertFalse("Element was found",check);
		}
			
	}



}
