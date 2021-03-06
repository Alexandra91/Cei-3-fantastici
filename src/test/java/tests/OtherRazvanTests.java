package tests;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LogInSteps;


@RunWith(ThucydidesRunner.class)
public class OtherRazvanTests {

    @Managed(uniqueSession = false)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://172.22.4.88:9090/home;jsessionid=DAB59B4DD6905C84B9C29F69C042C691")
    public Pages pages;

    @Steps
    public LogInSteps endUser;

  
    @Test				
    public void VerifyingToSeeIfClickingOnTypeButtonMakesTheTableDisappear(){
    	endUser.openLogInPage();
    	endUser.clickOnSignIn(); 
    	endUser.completeUsername("razvanratiu");
    	endUser.completePassword("Hateme.29");
    	endUser.clickOnSignInButton();
    	endUser.clickOnVacation(); 
    	endUser.clickMultipleTimes(50);
    	
    }
    
     
	@Test 
    public void ClickOnOneOptionSelectBoxThenClickApplyAndSeeIfTheTableUpdatesCorectly(){
    	endUser.openLogInPage();
    	endUser.clickOnSignIn(); 
    	endUser.completeUsername("razvanratiu");
    	endUser.completePassword("Hateme.29");
    	endUser.clickOnSignInButton();
    	endUser.clickOnVacation(); 
    	endUser.selectItemForMyRequests("Holiday");
    	endUser.clickOnApplybutton();	
    	endUser.checkVacationType("Holiday");
	} 
	
    	
	@Test 
	public void asdf(){
    	endUser.openLogInPage();
    	endUser.clickOnSignIn(); 
    	endUser.completeUsername("razvanratiu");
    	endUser.completePassword("Hateme.29");
    	endUser.clickOnSignInButton();
    	endUser.clickOnVacation(); 
    	endUser.selectItemForMyRequests("Holiday");
    	endUser.selectItemForMyRequests("Withdrawn");
    	endUser.selectItemForMyRequests("1 - 5");
    	endUser.clickOnApplybutton();	 
    	
	}



}	
	