package tests;

import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.annotations.Managed;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LogInSteps;

@RunWith(ThucydidesRunner.class)
public class RazvanTests {

    @Managed(uniqueSession = false)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://172.22.4.88:9090/home;jsessionid=DAB59B4DD6905C84B9C29F69C042C691")
    public Pages pages;

    @Steps
    public LogInSteps endUser;

  
    @Test				
    public void logInEvozone(){
    	endUser.openLogInPage();
    	endUser.clickOnSignIn(); 
    	endUser.completeUsername("razvanratiu");
    	endUser.completePassword("Hateme.29");
    	endUser.clickOnSignInButton();
    	endUser.clickOnVacation(); 
    	endUser.clickMultipleTimes(50);
    	
    }
    
   


	@Test 
    public void applyButtonNameTesting(){
    	endUser.openLogInPage();
    	endUser.clickOnSignIn(); 
    	endUser.completeUsername("razvanratiu");
    	endUser.completePassword("Hateme.29");
    	endUser.clickOnSignInButton();
    	endUser.clickOnVacation(); 
    	endUser.clickOnApplybutton();
	}
  
	
	@Test 
    public void selectCheckboxItems(){
    	endUser.openLogInPage();
    	endUser.clickOnSignIn(); 
    	endUser.completeUsername("razvanratiu");
    	endUser.completePassword("Hateme.29");
    	endUser.clickOnSignInButton();
    	endUser.clickOnVacation(); 
    	endUser.selectItemForMyRequests("Holiday");
    	endUser.selectItemForMyRequests("Pending");
    	endUser.selectItemForMyRequests("21 - 50");
	}
	
	
	
	
}	
	