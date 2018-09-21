package com.mytest.automation_ryanair.PageFunctions;

import org.openqa.selenium.WebDriver;

import com.mytest.automation_ryanair.Pages.FlightSelectionPage;


public class FlightSelectionPageFunctions extends FlightSelectionPage {

	public FlightSelectionPageFunctions(WebDriver driver) {
		super(driver);
	}

	public void SelectFirstFlightAndContinue() throws Exception {

		FirstFlightButton().WaitForClickable();
		FirstFlightButton().JavascriptClickElement();
		FirstFlightButton().WaitForClickable();
		ChoosePlusFare().JavascriptClickElement();
		ContinueButton().WaitForClickable();
		ContinueButton().JavascriptClickElement();
		ContinueButton().JavascriptClickElement();

	}

	public void SeatSelectionProcess(String numberOfAdult, String numberOfTeens, String numberOfChild)
			throws Exception {
		SeatMessageButton().WaitForClickable();
		SeatMessageButton().ClickOnElement();
		SelectSeats(numberOfAdult, numberOfTeens, numberOfChild);
		ReviewButton().ClickOnElement();
		ConfirmationButton().ClickOnElement();
	}

	public void SelectSeats(String numberOfAdult, String numberOfTeens, String numberOfChild) throws Exception {
		int adult = Integer.parseInt(numberOfAdult);
		int teen = Integer.parseInt(numberOfTeens);
		int child = Integer.parseInt(numberOfChild);
		int total = adult + teen + child;
		for (int i = 1; i <= total; i++) {
			AvailableSeat(i).JavascriptClickElement();
			AvailableSeat(i).DeadWait(500);
		}

	}

	public WebDriver SwitchToBooking() {

		return SwitchToBookingSelectionWindow();
	}

}
