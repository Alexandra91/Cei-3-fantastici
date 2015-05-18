package VacationPackage;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class NewVacationRequestPage extends PageObject{

	@FindBy(css="a[href*='menuItem=new-request']")
	private WebElement newVacationRequest;

	@FindBy(xpath="//*[@class='Zebra_DatePicker_Icon_Wrapper'][1]/button")
	private WebElement firstDateButton;

	@FindBy(css="span[class='Zebra_DatePicker_Icon_Wrapper'] input[name='endDate'] ")
	private WebElement secondDateButton;

	@FindBy(css="input[id='_evovacation_WAR_EvoVacationportlet_type_CO']")
	private WebElement holidayRadioButton;

	@FindBy(css ="input[id='_evovacation_WAR_EvoVacationportlet_type_CF']")
	private WebElement vacationWithoutPaymentRadioButton;

	@FindBy(css="input[name='duration']")
	private WebElementFacade DurationAndDomain;

	@FindBy(css="input[name='institution']")
	private WebElementFacade InstitutionName;

	@FindBy(css ="input[id='_evovacation_WAR_EvoVacationportlet_type_CM']")
	private WebElement sickLeaveRadioButton;

	@FindBy(css ="input[id='_evovacation_WAR_EvoVacationportlet_type_CS']")
	private WebElement specialVacationRadioButton;

	@FindBy(css ="select[name='specialReason']")
	private WebElement specialVacationDropdown;

	@FindBy(css ="input[id='_evovacation_WAR_EvoVacationportlet_type_ML']")
	private WebElement maternityLeaveRadioButton;

	@FindBy(css ="select[name='maternityLeave']")
	private WebElement maternityLeaveDropdown;

	@FindBy(css ="div[class='optionalComment']")
	private WebElement optionalComment;

	@FindBy(css ="textarea[name='commentContent'")
	private WebElementFacade commentContent;

	@FindBy(css ="input[id='_evovacation_WAR_EvoVacationportlet_saveButton']")
	private WebElementFacade saveButton;

	@FindBy(css ="input[id='_evovacation_WAR_EvoVacationportlet_cancelButton']")
	private WebElementFacade cancelButton;

	@FindBy(css =".vacation-info-column-content div.content-title")
	private WebElement vacationRequestInfo;

	@FindBy(css="select[name='specialReason']>option")
	private List<WebElement> specialVacantionList;
	
//	@FindBy(css="div[class='portlet-msg-error']:nth-child(1)")
//	private WebElement errorMessage;

	@FindBy(css="div[class*='portlet-msg']")
	private WebElement successMessage;
	
	public void press_newVacationRequest() {
		element(newVacationRequest).waitUntilVisible();
		newVacationRequest.click();
	}

	public void press_firstDateButton() {
		element(firstDateButton).waitUntilVisible();
		firstDateButton.click();
	}

	public void press_secondDateButton() {
		secondDateButton.click();
	}

	public void click_holidayRadioButton() {
		holidayRadioButton.click();
	}

	public void click_vacationWithoutPaymentRadioButton() {
		vacationWithoutPaymentRadioButton.click();
	}

	public void enter_duration(String keyword) {
		DurationAndDomain.type(keyword);
	}

	public void enter_institution(String keyword){
		InstitutionName.type(keyword);
	}

	public void click_sickLeaveRadioButton() {
		sickLeaveRadioButton.click();
	}

	public void click_specialVacationRadioButton() {
		specialVacationRadioButton.click();
	}

	public void click_specialVacationDropdown() {
		specialVacationDropdown.click();
	}

	public void click_maternityLeaveRadioButton() {
		maternityLeaveRadioButton.click();
	}

	public void click_maternityLeaveDropdown() {
		maternityLeaveDropdown.click();
	}

	public void click_optionalComment() {
		optionalComment.click();
	}

	public void enter_comment(String keyword){
		commentContent.type(keyword);
	}

	public void click_save() {
		saveButton.click();
	}
	public void click_cancel() {
		cancelButton.click();
	}

	public void checkSaveButton(String mesage){
		boolean found= false;
		if(successMessage.getText().equals(mesage)){
			found=true;
			System.out.println(vacationRequestInfo.getText());	
		}
		else {
			found=false;
			Assert.assertTrue("There appear an error message!", found);
		}
	}

	public void selectSpecialVacation(String option){
		
	}

}

