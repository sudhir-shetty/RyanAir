package com.mytest.automation_ryanair.PageFunctions;

import org.openqa.selenium.WebDriver;

import com.mytest.automation_ryanair.Pages.FlightSelectionPage;

public class FlightSelectionPageFunctions extends FlightSelectionPage {

	public FlightSelectionPageFunctions(WebDriver driver) {
		super(driver);
	}

	public void SelectFirstFlightAndContinue() throws Exception {

		FirstFlightButton().CheckElementToBeDisplayed(4);
		FirstFlightButton().WaitForElementToBeClickable();
		FirstFlightButton().JavascriptClickElement();
		ChoosePlusFare().WaitForClickable();
		ChoosePlusFare().JavascriptClickElement();
		ContinueButton().WaitForClickable();
		AddedToBasket().CheckElementToBeDisplayed(10);
		ContinueButton().WaitForClickable();
		ContinueButton().JavascriptClickElement();

	}

	public void SeatSelectionProcess(String numberOfAdult, String numberOfTeens, String numberOfChild)
			throws Exception {
		SeatMessageButton().CheckElementToBeDisplayed(10);
		SeatMessageButton().ClickOnElement();
		SelectSeats(numberOfAdult, numberOfTeens, numberOfChild);
		SeatMessageButton().CheckElementToBeDisplayed(1);
		ReviewButton().JavascriptClickElement();
		SeatMessageButton().CheckElementToBeDisplayed(1);
		ConfirmationButton().JavascriptClickElement();
	}

	public void SelectSeats(String numberOfAdult, String numberOfTeens, String numberOfChild) throws Exception {
		int adult = Integer.parseInt(numberOfAdult);
		int teen = Integer.parseInt(numberOfTeens);
		int child = Integer.parseInt(numberOfChild);
		int total = adult + teen + child;
		int randomOffset;
		for (int i = 1; i <= total; i++) {
			randomOffset=(int )(Math.random() * ((10 - 1) + 1)) + 1;
			AvailableSeat(randomOffset).CheckElementPresence();
			AvailableSeat(randomOffset).JavascriptClickElement();
		}

	}

	public WebDriver SwitchToBooking() {

		return SwitchToBookingSelectionWindow();
	}

}
