package com.mytest.automation_ryanair.PageFunctions;

import org.openqa.selenium.WebDriver;

import com.mytest.automation_ryanair.Pages.Page;
import com.mytest.automation_ryanair.Pages.RyanAirHomePage;


public class RyanAirHomePageFunctions extends RyanAirHomePage {

	public RyanAirHomePageFunctions(WebDriver driver) {
		super(driver);
	}

	public void FillIternary(String source, String destination, String date, String numberOfAdults,
			String numberOfTeens, String numberOfChildrens) throws Exception {
		
		OneWayRadioButton().WaitForClickable();
		OneWayRadioButton().ClickOnElement();
		SourceInputBox().ClearAndEnterTxt(source);
		DestinationInputbox().ClearAndEnterTxt(destination);
		LetsGoButton().DeadWait(1000);
		LetsGoButton().ClickOnElement();
		EnterStartDate(date);
		PassengerSelector().ClickOnElement();
		SelectNumberOfPassengers(AdultSeatText(), AdultIncrementButton(), numberOfAdults);
		SelectNumberOfPassengers(TeenSeatText(), TeenIncrementButton(), numberOfTeens);
		SelectNumberOfPassengers(ChildrenSeatText(), ChildrenIncrementButton(), numberOfChildrens);
		PassengerSelector().ClickOnElement();
		AgreeTermsConditionCheck().ClickOnElement();
		LetsGoButton().ClickOnElement();	
	}
	
	

	public void SelectNumberOfPassengers(Page passengerTotal, Page incrementButton, String number) throws Exception {

		String total = number;
		int numberOfPassenger = Integer.parseInt(number);
		if (numberOfPassenger > 0)
			while (numberOfPassenger > 0) {
				if ((passengerTotal.GetValueOfElement().trim()).equalsIgnoreCase(total))
					break;

				incrementButton.ClickOnElement();
				incrementButton.DeadWait(500);

				if (incrementButton.name.contains("Infant")) {
					if (InfantConfirmationButton().CheckElementPresence())
						InfantConfirmationButton().ClickOnElement();
					incrementButton.DeadWait(500);

				}
			}

	}

	public void EnterStartDate(String Date) {
		String[] dateFormat = Date.split("/");
		DayDateInput().ClearAndEnterTxt(dateFormat[0]);
		DayDateInput().DeadWait(500);
		MonthDateInput().ClearAndEnterTxt(dateFormat[1]);
		MonthDateInput().DeadWait(1);
		YearDateInput().ClearAndEnterTxt(dateFormat[2]+"  s");
		YearDateInput().DeadWait(500);
	}

}