package com.mytest.automation_ryanair.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPopUpPaage {
	
	WebDriver driver;

	public LoginPopUpPaage(WebDriver driver) {
		this.driver = driver;
	}

	public Page LoginLink() {
		Page object = new Page(driver);
		object.name = "Login Link";
		object.by = By.xpath("//div[@id='ryanair-navbar']//li[@id='myryanair-auth-login']");
		return object;
	}
	
	public Page UsernameTextbox() {
		Page object = new Page(driver);
		object.name = "Username Textbox";
		object.by = By.xpath("//div[@class='form-field']//input[contains(@id,'email')]");
		return object;
	}
	
	public Page PasswordTextBox() {
		Page object = new Page(driver);
		object.name = "Password Textbox";
		object.by = By.xpath("//password-input/input[contains(@id,'password')]");
		return object;
	}
	
	public Page LoginButton() {
		Page object = new Page(driver);
		object.name = "Login Button";
		object.by = By.xpath("//div[@class='modal-form-group']//button");
		return object;
	}
	
	public Page UserAvataar() {
		Page object = new Page(driver);
		object.name = "User Avataar";
		object.by = By.xpath("//div[contains(@class,'avatar-user')]");
		return object;
	}
}
