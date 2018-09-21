package com.mytest.automation_ryanair.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightSelectionPage {
	WebDriver driver;

	public FlightSelectionPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public Page AddedToBasket() {
		Page object = new Page(driver);
		object.name = "Added To Basket Message";
		object.by = By.xpath("//*[contains(text(),'Added to basket')]");
		return object;
	}

	
	
	public Page FirstFlightButton() {
		Page object = new Page(driver);
		object.name = "First Flight button";
		object.by = By.xpath("(//div[contains(@class,'flight-header__min-price')]//div[@class='core-btn-primary'])[1]");
		return object;
	}

	public Page ChoosePlusFare() {
		Page object = new Page(driver);
		object.name = "Plus Fare";
		object.by = By.xpath("(//span[@class='flights-table-fares__fare-radio'])[2]");
		return object;
	}

	public Page ContinueButton() {
		Page object = new Page(driver);
		object.name = "Continue";
		object.by = By.xpath("//div[contains(@class,'trips-basket trips-cnt')]//button");
		return object;
	}

	public WebDriver SwitchToBookingSelectionWindow() {
		Page object = new Page(driver);
		return object.SwtichBrowser("Ryanair");
	}

	public Page SeatSelectSkip() {
		Page object = new Page(driver);
		object.name = "Skip Seat Selection";
		object.by = By.xpath("//span[@translate='trips.seats.modal.skip']");
		return object;
	}

	public Page SeatSelectionPopupCancel() {
		Page object = new Page(driver);
		object.name = "Seat Selection Popup Cancel";
		object.by = By.xpath("//button[@class='popup-msg__button popup-msg__button--cancel']");
		return object;
	}

	public Page SeatMessageButton() {
		Page object = new Page(driver);
		object.name = "Seat Message";
		object.by = By.xpath("//div[@id='ngdialog2']//div[contains(@class,'seat-map-prompt')]//button");
		return object;
	}

	public Page AvailableSeat(int offset) {
		Page object = new Page(driver);
		object.name = "Available Seat";
		object.by = By.xpath("(//span[@class='seat-row-seat priority'])["+offset+"]/span");
		return object;
	}

	public Page ReviewButton() {
		Page object = new Page(driver);
		object.name = "Review";
		object.by = By.xpath("//*[@button-text='trips.seats.seatmap_review-seats']//button");
		return object;
	}

	public Page ConfirmationButton() {
		Page object = new Page(driver);
		object.name = "Review";
		object.by = By.xpath("//*[@button-text='trips.seats.confirm']//button");
		return object;
	}
}
