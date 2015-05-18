package VacationSteps;

import java.text.ParseException;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import VacationPackage.CalendarPage;
import VacationPackage.NewVacationRequestPage;

public class NewRequestSteps extends ScenarioSteps {
	
	private static final long serialVersionUID = 1L;
	NewVacationRequestPage newVacationRequest;
	CalendarPage calendar;
	
	@Step
	public void newVacationRequest(){
		newVacationRequest.press_newVacationRequest();
		waitABit(4000);
	}
	
	@Step
	public void startDate(int month, int day, int year) throws ParseException {
		newVacationRequest.press_firstDateButton();
		calendar.setDate(month, day, year);
	}
	
	@Step
	public void endDate(int month, int day, int year) throws ParseException {
		newVacationRequest.press_secondDateButton();
		calendar.setDate(month, day, year);
	}
	
	@Step
	public void holiday(){
	    newVacationRequest.click_holidayRadioButton();
		}
	
	@Step
	public void vacationWithoutPayment(){
		newVacationRequest.click_vacationWithoutPaymentRadioButton();
	}
	
	@Step
	public void vacationDuration(String keyword){
		newVacationRequest.enter_duration(keyword);
	}
	
	@Step
	public void vacationInstitution(String keyword){
	   newVacationRequest.enter_institution(keyword);
	}
	
	@Step
	public void sickLeave(){
		newVacationRequest.click_sickLeaveRadioButton();
	}
	
	@Step
	public void specialVacation(){
		newVacationRequest.click_specialVacationRadioButton();
	}
	
	@Step
	public void specialVacationChoices(){
		newVacationRequest.click_specialVacationDropdown();
	}
	
	@Step
	public void maternityLeave(){
		newVacationRequest.click_maternityLeaveRadioButton();
	}
	
	@Step
	public void maternityLeaveChoices(){
		newVacationRequest.click_maternityLeaveDropdown();
	}
	
	@Step
	public void optionalComment(){
		newVacationRequest.click_optionalComment();
	}
	
	@Step
	public void enterCommnet(String keyword){
		newVacationRequest.enter_comment(keyword);
	}
	
	@Step
	public void save(){
		newVacationRequest.click_save();
	}
	
	@Step
	public void cancel(){
		newVacationRequest.click_cancel();
	}
	
		
	@Step
    public void checkSaveButton(String message){
    	newVacationRequest.checkSaveButton(message);
    }
	
//	@Step
//    public void checkCancelButton(String text){
//    	newVacationRequest.checkCancelButton(text);
//    }
  

}
