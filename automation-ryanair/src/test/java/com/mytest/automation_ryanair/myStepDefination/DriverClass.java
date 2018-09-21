package com.mytest.automation_ryanair.myStepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DriverClass {
	WebDriver driver;

	public DriverClass() {

	}

	public WebDriver OpenBrower(String browserName) {

		if (browserName.contains("firefox"))

			driver = new FirefoxDriver();
		else
		{
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
			driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.get("https://www.ryanair.com/ie/en");
		driver.findElement(By.xpath("//div/*[@id='glyphs.close']")).click();
		driver.manage().window().fullscreen();
		return driver;

	}

}
