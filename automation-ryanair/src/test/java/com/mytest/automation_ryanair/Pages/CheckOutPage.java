package com.mytest.automation_ryanair.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
	WebDriver driver;

	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
	}

	public Page CheckoutButton() {
		Page object = new Page(driver);
		object.name = "Checkout	";
		object.by = By.xpath("//button[span[@translate='trips.summary.buttons.btn_checkout']]");
		return object;
	}

	public Page SeeAllCar() {
		Page object = new Page(driver);
		object.name = "See All Car Popup";
		object.by = By.xpath("//button[contains(text(),'See all cars')]");
		return object;
	}

	public Page CloseCarMessagePopUp() {
		Page object = new Page(driver);
		object.name = "Close Car Popup";
		object.by = By.xpath("//div[@class='popup-msg']//div");
		return object;
	}

	public Page AddedToBasket() {
		Page object = new Page(driver);
		object.name = "Added To Basket Message";
		object.by = By.xpath("//*[contains(text(),'Added to basket')]");
		return object;
	}

	public Page GeneralPassengerTitle() {
		Page object = new Page(driver);
		object.name = "Passenger Title";
		object.by = By.xpath("(//select[contains(@id,'title')])");
		return object;
	}

	public Page GeneralInfantDayOfBirth() {
		Page object = new Page(driver);
		object.name = "Infant Day of Birth	";
		object.by = By.xpath("(//div[contains(@class,'dob')]//select[contains(@name,'day')])");
		return object;
	}

	public Page GeneralInfantMonthOfBirth() {
		Page object = new Page(driver);
		object.name = "Infant Month of Birth	";
		object.by = By.xpath("(//div[contains(@class,'dob')]//select[contains(@name,'month')])");
		return object;
	}

	public Page GeneralInfantYearOfBirth() {
		Page object = new Page(driver);
		object.name = "Infant Year of Birth	";
		object.by = By.xpath("(//div[contains(@class,'dob')]//select[contains(@name,'year')])");
		return object;
	}

	public Page GeneralPassengerFirstName() {
		Page object = new Page(driver);
		object.name = "Passenger First Name	";
		object.by = By.xpath("(//input[contains(@id,'first')])");
		return object;
	}

	public Page GeneralPassengerLastName() {
		Page object = new Page(driver);
		object.name = "Passenger Last Name	";
		object.by = By.xpath("(//input[contains(@id,'last')])");
		return object;
	}

	public Page GeneralInfantFirstName() {
		Page object = new Page(driver);
		object.name = "Infant First Name";
		object.by = By.xpath("(//input[contains(@id,'infFirst')])");
		return object;
	}

	public Page GeneralInfantLastName() {
		Page object = new Page(driver);
		object.name = "Infant Last Name	";
		object.by = By.xpath("(//input[contains(@id,'infLast')])");
		return object;
	}

	public Page CardNumber() {
		Page object = new Page(driver);
		object.name = "Card Number";
		object.by = By.xpath("//input[contains(@id,'cardNumber')]");
		return object;
	}

	public Page CardType() {
		Page object = new Page(driver);
		object.name = "Card Type";
		object.by = By.xpath("//select[contains(@id,'cardType')]");
		return object;
	}

	public Page ExpiryMonth() {
		Page object = new Page(driver);
		object.name = "Expiry Month";
		object.by = By.xpath("//select[contains(@id,'expiryMonth')]");
		return object;
	}

	public Page ExpiryYear() {
		Page object = new Page(driver);
		object.name = "Expiry Year";
		object.by = By.xpath("//select[contains(@name,'expiryYear')]");
		return object;
	}

	public Page PhoneNumberCountry() {
		Page object = new Page(driver);
		object.name = "Phone Number Country";
		object.by = By.xpath("//select[contains(@name,'phoneNumberCountry')]");
		return object;
	}

	public Page PhoneNumber() {
		Page object = new Page(driver);
		object.name = "Phone Number";
		object.by = By.xpath("//input[contains(@name,'phoneNumber')]");
		return object;
	}

	public Page BillingAddressAddressLine1() {
		Page object = new Page(driver);
		object.name = "Billing Address Line 1";
		object.by = By.xpath("//input[contains(@name,'billingAddressAddressLine1')]");
		return object;
	}

	public Page BillingAddressCity() {
		Page object = new Page(driver);
		object.name = "Billing Address City";
		object.by = By.xpath("//input[contains(@name,'billingAddressCity')]");
		return object;
	}

	public Page SecurityCode() {
		Page object = new Page(driver);
		object.name = "Security Code(CVV)";
		object.by = By.xpath("//input[contains(@name,'securityCode')]");
		return object;
	}

	public Page CardHolderName() {
		Page object = new Page(driver);
		object.name = "Card Holder Name";
		object.by = By.xpath("//input[contains(@name,'cardHolderName')]");
		return object;
	}

	public Page AcceptTerms() {
		Page object = new Page(driver);
		object.name = "Accept Terms";
		object.by = By.xpath("//label[contains(@for,'acceptTerms')]//div");
		return object;
	}

	public Page PayNow() {
		Page object = new Page(driver);
		object.name = "Pay Now";
		object.by = By.xpath("//button[contains(text(),'Pay Now')]");
		return object;
	}

	public Page ErrorPrompt() {
		Page object = new Page(driver);
		object.name = "Error Message Prompt";
		object.by = By.xpath("//prompt[contains(@class,'error prompt-text')]");
		return object;
	}
}
