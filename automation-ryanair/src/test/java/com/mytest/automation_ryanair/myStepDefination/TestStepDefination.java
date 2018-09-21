package com.mytest.automation_ryanair.myStepDefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.mytest.automation_ryanair.PageFunctions.CheckOutPageFunctions;
import com.mytest.automation_ryanair.PageFunctions.FlightSelectionPageFunctions;
import com.mytest.automation_ryanair.PageFunctions.LoginPopupPageFunctions;
import com.mytest.automation_ryanair.PageFunctions.RyanAirHomePageFunctions;
import com.mytest.automation_ryanair.Pages.Page;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepDefination {
	WebDriver driver;

	@Given("^I am logged in to the application with (.+) and (.+)$")
	public void I_am_logged_into_application(String username, String password) throws Exception {
		new LoginPopupPageFunctions(driver).Login(username, password);
	}

	@Given("^I make a booking from (.+) to (.+) on (.+) for (.+) , (.+) and (.+)$")
	public void i_want_to_write_a_step_with_precondition(String source, String destination, String date,
			String numberOfAdult, String numberOfTeens, String numberOfChild) throws Throwable {

		new RyanAirHomePageFunctions(driver).FillIternary(source, destination, date, numberOfAdult, numberOfTeens,
				numberOfChild);
		driver = new FlightSelectionPageFunctions(driver).SwitchToBooking();
		new FlightSelectionPageFunctions(driver).SelectFirstFlightAndContinue();
		new FlightSelectionPageFunctions(driver).SeatSelectionProcess(numberOfAdult, numberOfTeens, numberOfChild);

	}

	@When("^I pay for booking with card details (.+) , (.+) , (.+) , (.+) , (.+) and (.+)$")
	public void i_pay_for_booking_with_card_details_ww_ww_and_ww(String cardNumber, String cardType, String expiryMonth,
			String expiryYear, String cvv, String cardHolder) throws Throwable {
		new CheckOutPageFunctions(driver).CheckOutAndFillPassengerDetails();
		new CheckOutPageFunctions(driver).FillCardInfor(cardNumber, cardType, expiryMonth, expiryYear, cvv, cardHolder);
		new CheckOutPageFunctions(driver).AcceptTermsAndPayNow();
	}

	@Then("^I should get payment declined message$")
	public void some_other_action() throws Throwable {
		new CheckOutPageFunctions(driver).CheckCardDeclineMessageIsDisplayed();
	}

	@Before
	public void BeforeTest() {
		driver = new DriverClass().OpenBrower("chrome");

	}

	@After
	public void tearDown(Scenario scenario) {
		scenario.write("Finished scenario");
		if (scenario.isFailed()) {
			Page page = new Page(driver);
			try {
				page.TakeScreenShot();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		System.out.println(" Destroyed");
		System.out.println("----------------------------------------------------------------------");
		driver.close();
		driver.quit();
	}

}
