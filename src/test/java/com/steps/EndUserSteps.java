package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.LogInPage;
import com.pages.VacationTrackerPage;
import com.pages.VacationsPage; 
import com.pages.DashboardPage;



public class EndUserSteps extends ScenarioSteps {

	private static final long serialVersionUID = -5341562730800634047L;
	DashboardPage dashboardpage; 
	LogInPage loginpage; 
	VacationsPage vacationspage;
	VacationTrackerPage vacationTrackerPage;

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
		getDriver().get("http://172.22.4.88:9090/home;jsessionid=DAB59B4DD6905C84B9C29F69C042C691");
	}

	@Step
	public void clickOnVacation() {
		vacationspage.clickOnVacationButton();
	}

	@Step
	public void clickOnSignInButton() {
		loginpage.clickOnSignInButton();
	}
	
	@Step
	public void clickOnTrack() {
		vacationTrackerPage.clickOnTrackButton();
	}
	
	@StepGroup
    public void login_evoportal(String user, String pass) {
		openLogInPage();
		clickOnSignIn();
		completeUsername(user);
		completePassword(pass);
    	clickOnSignInButton();
	} 
}
