package com.mytest.automation_ryanair.PageFunctions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.listener.Reporter;
import com.mytest.automation_ryanair.Pages.CheckOutPage;

public class CheckOutPageFunctions extends CheckOutPage {
	public CheckOutPageFunctions(WebDriver driver) {
		super(driver);
	}

	public void CheckOutAndFillPassengerDetails() throws Exception {

		AddedToBasket().CheckElementToBeDisplayed(2);

		if (CheckoutButton().CheckElementToBeDisplayed(2))
			CheckoutButton().JavascriptClickElement();

		if (SeeAllCar().CheckElementToBeDisplayed(2))
			CloseCarMessagePopUp().JavascriptClickElement();

		PayNow().CheckElementToBeDisplayed_NoLog(1);
		FillPassengerDetails();

		// Hard-coded value is just for test
		PhoneNumberCountry().SelectElementBytext("Spain");
		PhoneNumber().ClearAndEnterTxt("667545678");

	}

	public void FillPassengerDetails() throws IOException {
		
		GeneralPassengerFirstName_First().CheckElementToBeDisplayed(5);
		
		for (WebElement element : GeneralPassengerFirstName().GetWebElements()) {
			element.clear();
			element.sendKeys(new CommonFunctions().RandomString(5));
		}

		for (WebElement element : GeneralPassengerLastName().GetWebElements()) {
			element.clear();
			element.sendKeys(new CommonFunctions().RandomString(5));
		}

		for (WebElement element : GeneralPassengerTitle().GetWebElements()) {
			Select select = new Select(element);
			select.selectByIndex(2);
		}

		if (GeneralInfantFirstName().GetWebElements().size() > 0) {
			for (WebElement element : GeneralInfantFirstName().GetWebElements()) {
				element.clear();
				element.sendKeys(new CommonFunctions().RandomString(5));
			}

			for (WebElement element : GeneralInfantLastName().GetWebElements()) {
				element.clear();
				element.sendKeys(new CommonFunctions().RandomString(5));
			}

			for (WebElement element : GeneralInfantDayOfBirth().GetWebElements()) {
				Select select = new Select(element);
				select.selectByIndex(Integer.parseInt(new CommonFunctions().getRandomNumberBetween(1, 25)));
			}

			for (WebElement element : GeneralInfantMonthOfBirth().GetWebElements()) {
				Select select = new Select(element);
				select.selectByIndex(Integer.parseInt(new CommonFunctions().getRandomNumberBetween(1, 10)));
			}

			for (WebElement element : GeneralInfantMonthOfBirth().GetWebElements()) {
				Select select = new Select(element);
				select.selectByIndex(Integer.parseInt(new CommonFunctions().getRandomNumberBetween(2017, 2018)));
			}
		} else {
			Reporter.addScenarioLog(
					"As per the given WebElement paths. We couldnt find any Infant fields. If script failed because of this, the please check the infant path.");
		}

	}

	public void FillCardInfor(String CardNumber, String CardType, String ExpiryMonth, String ExpiryYear,
			String SecurityCode, String CardHolder) throws IOException {

		CardNumber().ClearAndEnterTxt(CardNumber);
		CardType().SelectElementBytext(CardType);
		ExpiryMonth().SelectElementBytext(ExpiryMonth);
		ExpiryYear().SelectElementBytext(ExpiryYear);
		SecurityCode().ClearAndEnterTxt(SecurityCode);
		CardHolderName().ClearAndEnterTxt(CardHolder);
		BillingAddressAddressLine1().ClearAndEnterTxt(new CommonFunctions().RandomString(10));
		BillingAddressCity().ClearAndEnterTxt(new CommonFunctions().RandomString(10));

	}

	public void AcceptTermsAndPayNow() throws Exception {
		AcceptTerms().ClickOnElement();
		PayNow().ClickOnElement();
	}

	public void CheckCardDeclineMessageIsDisplayed() throws IOException {
		ErrorPrompt().AssertElementIsDisplayedWithSeconds(15);

		ErrorPrompt().AssertTextLogIfTheElementInDisplayedWithSeconds(
				"As your payment was not authorised we could not complete your reservation. Please ensure that the information was correct or use a new payment to try again");

	}
}