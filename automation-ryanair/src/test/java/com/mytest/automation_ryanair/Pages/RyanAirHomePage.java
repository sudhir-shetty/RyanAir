package com.mytest.automation_ryanair.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RyanAirHomePage {
	WebDriver driver;

	public RyanAirHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public Page OneWayRadioButton() {
		Page object = new Page(driver);
		object.name = "One-Way Radio button";
		object.by = By.xpath("//input[@type='radio' and @id='flight-search-type-option-one-way' ]");
		return object;
	}

	public Page SourceInputBox() {
		Page object = new Page(driver);
		object.name = "From:";
		object.by = By.xpath("//input[@aria-labelledby='label-airport-selector-from']");
		return object;
	}

	public Page DestinationInputbox() {
		Page object = new Page(driver);
		object.name = "To:";
		object.by = By.xpath("//input[@aria-labelledby='label-airport-selector-to']");
		return object;
	}

	public Page DayDateInput() {
		Page object = new Page(driver);
		object.name = "Day";
		object.by = By.xpath("//div[@value='dateRange.startDate']//input[@name='dateInput0']");
		return object;
	}

	public Page MonthDateInput() {
		Page object = new Page(driver);
		object.name = "Month";
		object.by = By.xpath("//div[@value='dateRange.startDate']//input[@name='dateInput1']");
		return object;
	}

	public Page YearDateInput() {
		Page object = new Page(driver);
		object.name = "Year";
		object.by = By.xpath("//div[@value='dateRange.startDate']//input[@name='dateInput2']");
		return object;
	}

	public Page PassengerSelector() {
		Page object = new Page(driver);
		object.name = "Passenger Selector";
		object.by = By.xpath("//div[@form-field-id='pax-input']//div[@class='value']");
		return object;
	}

	public Page AdultIncrementButton() {
		Page object = new Page(driver);
		object.name = "Adult Increment Button";
		object.by = By.xpath("//div[@label='Adults']//button[@data-ref='core-inc-dec-increment']");
		return object;
	}

	public Page AdultSeatText() {
		Page object = new Page(driver);
		object.name = "No. of selected Adult Seat";
		object.by = By.xpath("//div[@label='Adults']//input");
		return object;
	}

	public Page TeenIncrementButton() {
		Page object = new Page(driver);
		object.name = "Teen Increment Button";
		object.by = By.xpath("//div[@label='Teens']//button[@data-ref='core-inc-dec-increment']");
		return object;
	}

	public Page TeenSeatText() {
		Page object = new Page(driver);
		object.name = "No. of selected Teen Seat";
		object.by = By.xpath("//div[@label='Teens']//input");
		return object;
	}

	public Page ChildrenIncrementButton() {
		Page object = new Page(driver);
		object.name = "Children Increment Button";
		object.by = By.xpath("//div[@label='Children']//button[@data-ref='core-inc-dec-increment']");
		return object;
	}

	public Page ChildrenSeatText() {
		Page object = new Page(driver);
		object.name = "No. of Children Seat";
		object.by = By.xpath("//div[@label='Children']//input");
		return object;
	}

	public Page InfantIncrementButton() {
		Page object = new Page(driver);
		object.name = "Infant Increment Button";
		object.by = By.xpath("//div[@label='Infants']//button[@data-ref='core-inc-dec-increment']");
		return object;
	}

	public Page InfantSeatText() {
		Page object = new Page(driver);
		object.name = "No. of Infant Seat";
		object.by = By.xpath("//div[@label='Infants']//input");
		return object;
	}
	
	public Page InfantConfirmationButton() {
		Page object = new Page(driver);
		object.name = "Infant Confirmation Button";
		object.by = By.xpath("//span[@translate='foh.home.flight_search_infant_popup.ok']");
		return object;
	}
	
	public Page AgreeTermsConditionCheck() {
		Page object = new Page(driver);
		object.name = "Agree Terms Condition Check";
		object.by = By.xpath("//div[@class='terms-conditions']//span");
		return object;
	}

	
	public Page LetsGoButton() {
		Page object = new Page(driver);
		object.name = "Lets Go";
		object.by = By.xpath("//button[@ng-keypress='searchFlights()']");
		return object;
	}
	
}
