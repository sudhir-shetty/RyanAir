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
		object.by = By.xpath("//span[@translate='trips.summary.buttons.btn_checkout']");
		return object;
	}

}
