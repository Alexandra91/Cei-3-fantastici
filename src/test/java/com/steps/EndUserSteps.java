package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.LogInPage;
import com.pages.VacationsPage; 
import com.pages.DashboardPage;



public class EndUserSteps extends ScenarioSteps {

	private static final long serialVersionUID = -5341562730800634047L;
	DashboardPage dashboardpage; 
	LogInPage loginpage; 
	VacationsPage vacationspage;

	@Step
	public void clickOnSignIn() {
		dashboardpage.clickOnSignIn();
	}


	@Step
	public void completeUsername(String username) {
		loginpage.writeOnUsername(username);
	}

	@Step
	public void completePassword(String pass) {
		loginpage.writeOnPassword(pass);
	}

	@Step
	public void openLogInPage() {
		dashboardpage.open();
	}

	@Step
	public void clickOnVacation() {
		vacationspage.clickOnVacationButton();
	}

	@Step
	public void clickOnSignInButton() {
		loginpage.clickOnSignInButton();
	}
    
}