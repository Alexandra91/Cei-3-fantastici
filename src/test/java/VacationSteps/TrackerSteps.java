package VacationSteps;

import java.text.ParseException;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import VacationPackage.CalendarPage;
import VacationPackage.MyRequestsPage;
import VacationPackage.VacationTrackerPage;
import VacationPackage.VacationsPage;

import com.pages.LogInPage;
import com.pages.DashboardPage;


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
