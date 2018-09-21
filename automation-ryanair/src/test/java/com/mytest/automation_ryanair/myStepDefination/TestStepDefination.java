package com.mytest.automation_ryanair.myStepDefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.mytest.automation_ryanair.PageFunctions.FlightSelectionPageFunctions;
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
		//new LoginPopupPageFunctions(driver).Login(username, password);
	}
	
	@Given("^I make a booking from (.+) to (.+) on (.+) for (.+) adults , (.+) teen , (.+) child and (.+) infant$")
	public void i_want_to_write_a_step_with_precondition( String source, String destination, String date,
			String numberOfAdult,String numberOfTeens, String numberOfChild,String numberOfInfants) throws Throwable {
		
		new RyanAirHomePageFunctions(driver).FillIternary(source, destination, date, numberOfAdult, numberOfTeens, numberOfChild, numberOfInfants);
		driver = new FlightSelectionPageFunctions(driver).SwitchToBooking();
		new FlightSelectionPageFunctions(driver).SelectFirstFlightAndContinue();
		new FlightSelectionPageFunctions(driver).SeatSelectionProcess(numberOfAdult, numberOfTeens, numberOfChild); 
		
		
	}

	@When("^I pay for booking with card details (.+),(.+) and (.+)$")
	public void i_pay_for_booking_with_card_details_ww_ww_and_ww(String source, String destination, String date)
			throws Throwable {
		Reporter.addStepLog("This is a step" + source);
		Reporter.addStepLog("This is a step" + destination);
		Reporter.addStepLog("This is a step" + date);
	}

	@Then("^I should get payment declined message$")
	public void some_other_action() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("One");
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
