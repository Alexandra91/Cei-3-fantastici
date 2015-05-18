package tests;

import java.text.ParseException;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LogInSteps;
import com.steps.vacation.NewRequestSteps;

@RunWith(ThucydidesRunner.class)
public class AlexandraTests {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.22.4.88:9090")
	public Pages pages;

	@Steps
	public LogInSteps evoportalLogIn;
	
	@Steps
	public NewRequestSteps newRequest;

	@Test
	public void LogIn_and_check_SaveButton_from_New_Vacation_Request_Page() throws ParseException { 	
		evoportalLogIn.login_evoportal("alexandra.pandele1","evoportal");
		evoportalLogIn.clickOnVacation(); 
		newRequest.newVacationRequest();
		newRequest.startDate(5, 20, 2015);
		newRequest.endDate(5, 22, 2015);
		newRequest.sickLeave();
		newRequest.save();
		newRequest.checkSaveButton("Your request completed successfully.");
	}   	
	
	//@Test
	public void LogIn_and_check_holidayVacation_from_New_Vacation_Request_Page() throws ParseException{
		evoportalLogIn.login_evoportal("alexandra.pandele1","evoportal");
		evoportalLogIn.clickOnVacation(); 
		newRequest.newVacationRequest();
		newRequest.startDate(5, 25, 2015);
		newRequest.endDate(12, 22, 2015);
		newRequest.holiday();
		newRequest.save();
		newRequest.checkSaveButton("Your request completed successfully.");
	}
	
	//@Test
	public void LogIn_and_check_vacationWithoutPayment_from_New_Vacation_Request_Page() throws ParseException{
		evoportalLogIn.login_evoportal("alexandra.pandele1","evoportal");
		evoportalLogIn.clickOnVacation(); 
		newRequest.newVacationRequest();
		newRequest.startDate(5, 23, 2015);
		newRequest.endDate(6, 29, 2016);
		newRequest.vacationWithoutPayment();
		newRequest.vacationDuration("24 de zile");
		newRequest.vacationInstitution("spitalul numarul noua");
		newRequest.save();
		newRequest.checkSaveButton("Your request completed successfully.");
	}
	
//	@Test
		public void LogIn_and_check_specialVacation_from_New_Vacation_Request_Page() throws ParseException{
			evoportalLogIn.login_evoportal("alexandra.pandele1","evoportal");
			evoportalLogIn.clickOnVacation(); 
			newRequest.newVacationRequest();
			newRequest.startDate(5, 23, 2015);
			newRequest.endDate(6, 29, 2015);
			newRequest.vacationWithoutPayment();
			newRequest.specialVacation();
			newRequest.specialVacationChoices();
			newRequest.optionalComment();
			newRequest.enterCommnet("bla bla bla");
			newRequest.save();
			newRequest.checkSaveButton("Your request completed successfully.");
		}
		
}
