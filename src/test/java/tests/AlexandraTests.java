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

	
//  	 String expectedEmail = "Dear "+ firstName +", Cristina Cernomodiac has submitted a Vacation Request.The user will be on vacation in the following period:";
//     expectedEmail = expectedEmail + startDate+ "-" +endDate+ ".Please approve or reject this <a href='http://172.22.4.88:9090/vacation?p_p_auth=eA0cK4aO&p_p_id=evovacation_WAR_EvoVacationportlet&p_p_lifecycle=0&_evovacation_WAR_EvoVacationportlet_menuItem=inbox&_evovacation_WAR_EvoVacationportlet_inboxState=inbox-view-vacation&_evovacation_WAR_EvoVacationportlet_backMenuItem=inbox&_evovacation_WAR_EvoVacationportlet_vacationId=18864'> here </a>.<!--  Cheers,  The EvoPortal Team-->  Cheers,  The EvoPortal Team"; 
//   String expectedEmail = "Dear firstName, Cristina Cernomodiac has submitted a Vacation Request.The user will be on vacation in the following period: startDate - endDate.Please approve or reject this <a href='http://172.22.4.88:9090/vacation?p_p_auth=eA0cK4aO&p_p_id=evovacation_WAR_EvoVacationportlet&p_p_lifecycle=0&_evovacation_WAR_EvoVacationportlet_menuItem=inbox&_evovacation_WAR_EvoVacationportlet_inboxState=inbox-view-vacation&_evovacation_WAR_EvoVacationportlet_backMenuItem=inbox&_evovacation_WAR_EvoVacationportlet_vacationId=18864'> here </a>.<!--  Cheers,  The EvoPortal Team-->  Cheers,  The EvoPortal Team";
//   expectedEmail = expectedEmail.replace("firstName", Alexandra);

//   if (mailBody.equals(expectedEmail)){
//  	 System.out.println();
//   }
	
	//@Test
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
	
	@Test
	public void LogIn_and_check_holidayVacation_from_New_Vacation_Request_Page() throws ParseException{
		evoportalLogIn.login_evoportal("alexandra.pandele1","evoportal");
		evoportalLogIn.clickOnVacation(); 
		newRequest.newVacationRequest();
		newRequest.startDate(6, 22, 2015);
		newRequest.endDate(6, 25, 2015);
		newRequest.holiday();
		newRequest.save();
		newRequest.checkSaveButton("Your request completed successfully.");
//		newRequest.checkMailInbox();
	}
	
	//@Test
	public void LogIn_and_check_vacationWithoutPayment_from_New_Vacation_Request_Page() throws ParseException{
		evoportalLogIn.login_evoportal("alexandra.pandele1","evoportal");
		evoportalLogIn.clickOnVacation(); 
		newRequest.newVacationRequest();
		newRequest.startDate(5, 23, 2016);
		newRequest.endDate(6, 29, 2017);
		newRequest.vacationWithoutPayment();
		newRequest.vacationDuration("24 de zile");
		newRequest.vacationInstitution("spitalul numarul noua");
		newRequest.save();
		newRequest.checkSaveButton("Your request completed successfully.");
	}
	
	//@Test
		public void LogIn_and_check_specialVacation_from_New_Vacation_Request_Page() throws ParseException{
			evoportalLogIn.login_evoportal("alexandra.pandele1","evoportal");
			evoportalLogIn.clickOnVacation(); 
			newRequest.newVacationRequest();
			newRequest.startDate(3, 23, 2016);
			newRequest.endDate(3, 23, 2015);
			newRequest.vacationWithoutPayment();
			newRequest.specialVacation();
			newRequest.specialVacationChoices();
			newRequest.optionalComment();
			newRequest.enterCommnet("bla bla bla");
			newRequest.save();
			newRequest.checkSaveButton("Your request completed successfully.");
		}
		
}
