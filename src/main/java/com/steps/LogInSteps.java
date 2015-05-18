package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.DashboardPage;
import com.pages.LogInPage;
import com.pages.vacation.MyRequestsContainerPage;
import com.pages.vacation.MyRequestsPage;
import com.pages.vacation.VacationTrackerPage;
import com.pages.vacation.VacationsPage;

public class LogInSteps extends ScenarioSteps {

	private static final long serialVersionUID = -5341562730800634047L;
	DashboardPage dashboardpage;
	LogInPage loginpage;

	VacationsPage vacationspage;
	MyRequestsPage myrequestspage;
	MyRequestsContainerPage myRequestsContainerPage;
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
		getDriver()
				.get("http://172.22.4.88:9090/home;jsessionid=DAB59B4DD6905C84B9C29F69C042C691");
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

	@Step
	public void clickMultipleTimes(int times) {
		myrequestspage.clickMultipleTimes(times);
	}

	@StepGroup
	public void login_evoportal(String user, String pass) {
		openLogInPage();
		clickOnSignIn();
		completeUsername(user);
		completePassword(pass);
		clickOnSignInButton();
	}

	@Step
	public void clickOnApplybutton() {
		myrequestspage.clickOnApplyButton();
	}

	@Step
	public void selectItemForMyRequests(String items) {
		myrequestspage.markOption(items);
		// myrequestspage.selectItemForMyRequests(items);
	}
	
	@Step 
	public void checkVacationType(String vactype){
		myRequestsContainerPage.checkVacationType(vactype);
	}
}
