package com.steps.vacation;

import java.text.ParseException;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.LogInPage;
import com.pages.DashboardPage;
import com.pages.vacation.CalendarPage;
import com.pages.vacation.MyRequestsPage;
import com.pages.vacation.VacationTrackerPage;
import com.pages.vacation.VacationsPage;


@SuppressWarnings("serial")
public class TrackerSteps extends ScenarioSteps {

	DashboardPage dashboardpage; 
	LogInPage loginpage; 

	VacationsPage vacationspage; 
	MyRequestsPage myrequestspage;
	VacationTrackerPage vacationTrackerPage;
	
	CalendarPage calendarPage;
	

	@Step
	public void clickOnSignIn() {
		dashboardpage.clickOnSignIn();
	}


	@Step
	public void selectStartDate(int month, int day, int year) throws ParseException {
		vacationTrackerPage.clickOnStartDate();
		calendarPage.setDate(month, day, year);
		
	}
	
	@Step
	public void selectEndDate(int month, int day, int year) throws ParseException {
		vacationTrackerPage.clickOnEndDate();
		calendarPage.setDate(month, day, year);
		
	}
	
			
}
