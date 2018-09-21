package com.mytest.automation_ryanair.PageFunctions;

import org.openqa.selenium.WebDriver;

import com.mytest.automation_ryanair.Pages.LoginPopUpPaage;


public class LoginPopupPageFunctions extends LoginPopUpPaage{
	
	public LoginPopupPageFunctions(WebDriver driver) {
		super(driver);
	}
	
	public void Login(String username,String password) throws Exception {
		LoginLink().ClickOnElement();
		UsernameTextbox().ClearAndEnterTxt(username);
		PasswordTextBox().ClearAndEnterTxt(password);
		LoginButton().ClickOnElement();
	}

}
