package com.mytest.automation_ryanair.PageFunctions;

import org.openqa.selenium.WebDriver;

import com.mytest.automation_ryanair.Pages.CheckOutPage;


public class CheckOutPageFunctions extends CheckOutPage {
	public CheckOutPageFunctions(WebDriver driver) {
		super(driver);
	}
	
	public void CheckOut() throws Exception {
		CheckoutButton().WaitForClickable();
		CheckoutButton().JavascriptClickElement();
		
	}
}
