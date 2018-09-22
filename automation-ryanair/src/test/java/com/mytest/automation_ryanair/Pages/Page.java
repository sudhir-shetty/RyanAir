package com.mytest.automation_ryanair.Pages;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import org.junit.Assert;

public class Page {

	public WebDriver driver;
	public String name;
	public By by;
	public WebDriverWait wait;

	public Page(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 60);

	}

	public WebElement GetWebElement() {
		WaitForElementToBeVisible();
		return driver.findElement(by);
	}

	public List<WebElement> GetWebElements() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		List<WebElement> list = driver.findElements(by);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return list;
	}

	public void WaitForElementToBeVisible() {
		wait.until(ExpectedConditions.presenceOfElementLocated(this.by));
		((JavascriptExecutor) driver).executeScript("window.focus();");

	}

	public void WaitForElementToBeClickable() {
		wait.until(ExpectedConditions.elementToBeClickable(this.by));
		((JavascriptExecutor) driver).executeScript("arguments[0].focus();", GetWebElement());
	}

	public void ClearAndEnterTxt(String text) {
		GetWebElement().clear();
		GetWebElement().sendKeys(text);
		GetWebElement().sendKeys(Keys.TAB);
		Reporter.addStepLog("Entered text '" + text + "' in to field '" + this.name + "'");
		DeadWait(800);
	}

	public void SelectElementByIndex(String index) {
		Select selectElement = new Select(GetWebElement());
		selectElement.selectByIndex(Integer.parseInt(index));
		Reporter.addStepLog("Selected Index '" + index + "' in field '" + this.name + "'");
		DeadWait(800);
	}

	public void SelectElementBytext(String Text) {
		Select selectElement = new Select(GetWebElement());
		selectElement.selectByVisibleText(Text);
		Reporter.addStepLog("Selected Text '" + Text + "' in field '" + this.name + "'");
		DeadWait(800);
	}

	public void ClickOnElement() throws Exception {
		WaitForClickable();
		int tries = 5;
		while (true) {
			try {
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);", GetWebElement());
				GetWebElement().click();
				Reporter.addStepLog("Clicked on  field '" + this.name + "'");
				DeadWait(800);
				return;
			} catch (WebDriverException e) {

				if (tries-- == 0)
					throw e;
				else
					DeadWait(5000);
			}

			catch (Exception e) {

				if (tries-- == 0)
					throw e;
				else
					DeadWait(1000);
			}
		}

	}

	public void KeyBoardClickElement() throws Exception {

		try {
			TakeScreenShot();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		WaitForClickable();
		int tries = 5;
		while (true) {
			try {

				Actions ob = new Actions(driver);
				ob.moveToElement(GetWebElement());
				ob.click(GetWebElement());
				Action action = ob.build();
				action.perform();
				Reporter.addStepLog("Clicked on  field '" + this.name + "'");
				DeadWait(1000);
				return;
			} catch (Exception e) {
				if (tries-- == 0)
					throw e;
				else
					DeadWait(1000);
			}
		}
	}

	public void JavascriptClickElement() throws Exception {

		WaitForClickable();
		int tries = 5;
		while (true) {
			try {

				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].scrollIntoView(true);", GetWebElement());
				executor.executeScript("arguments[0].click();", GetWebElement());
				Reporter.addStepLog("Clicked on  field '" + this.name + "'");
				DeadWait(1000);
				return;
			} catch (Exception e) {
				if (tries-- == 0)
					throw e;
				else
					DeadWait(1000);
			}
		}
	}

	public String GetTextOfElement() {
		String text = GetWebElement().getText();
		Reporter.addStepLog("Displayed text '" + text + "' on element '" + this.name + "'");

		return text;
	}

	public String GetValueOfElement() {
		String text = GetWebElement().getAttribute("value");
		Reporter.addStepLog("Displayed Value '" + text + "' fors element '" + this.name + "'");
		System.out.println(text);

		return text;
	}

	public void TakeScreenShot() throws IOException {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File screenFile = new File("screenshots/" + screenshot.getName());
		Files.copy(screenshot, screenFile);

		Reporter.addStepLog(
				" Screenshot: <img data-featherlight='" + screenFile.getAbsolutePath() + "' width='40%' src='"
						+ screenFile.getAbsolutePath() + "' data-src='" + screenFile.getAbsolutePath() + "'>");
	}

	public void DeadWait(int miliSex) {
		try {
			Thread.sleep(miliSex);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public boolean CheckElementPresence() {
		try {

			new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(this.by));
			if (driver.findElements(by).size() > 0)
				;
			{
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				return true;
			}
		} catch (Exception e) {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			return false;
		}
	}

	public WebDriver SwtichBrowser(String BrowserTitle) {
		if (driver.getWindowHandles().size() < 2)
			DeadWait(3000);

		for (String iterable_element : driver.getWindowHandles()) {

			driver.switchTo().window(iterable_element);

			System.out.println(driver.getTitle());
			if (driver.getTitle().equalsIgnoreCase(BrowserTitle))
				return driver;
		}

		return driver;
	}

	public void WaitForClickable() {
		if (!GetWebElement().isEnabled())
			wait.until(ExpectedConditions.elementToBeClickable(by));

	}

	public boolean CheckElementToBeDisplayed(int seconds) throws IOException {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		int tries = seconds;
		while (true) {
			try {

				driver.findElement(by);
				TakeScreenShot();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				return true;
			} catch (Exception e) {
				if (tries-- == 0) {
					TakeScreenShot();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					return false;
				} else
					DeadWait(1000);
			}
		}
	}

	public void AssertElementIsDisplayedWithSeconds(int sec) throws IOException {
		if (CheckElementToBeDisplayed(sec)) {
			TakeScreenShot();
			Reporter.addStepLog(
					"<b><font size='2' color='green'>PASS --- ELEMENT DISPLAYED SUCCESSFULLY !!!</font></b> "
							+ this.name);

		} else {
			TakeScreenShot();
			Reporter.addStepLog(
					"<b><font size='2' color='red'>FAIL --- ELEMENT NOT DISPLAYED !!! </font></b>" + this.name);
			Assert.fail("<b>ELEMENT NOT DISPLAYED</b>");
		}
	}

	public void AssertTextLogIfTheElementInDisplayedWithSeconds(String expected) throws IOException {
		if (GetTextOfElement().contains(expected)) {
			TakeScreenShot();
			Reporter.addStepLog("<b><font size='2' color='green'>PASS --- MESSAGE SUCCESSFULLY DISPLAYED !!! </font></b>" + expected);

		} else {
			TakeScreenShot();
			Reporter.addStepLog(
					"<b><font size='2' color='red'>FAIL --- MESSAGE NOT DISPLAYED !!! EXPECTED MESSAGE ---->  </font></b>"
							+ expected);
			Reporter.addStepLog("<b><font size='2' color='red'>FAIL --- ACTUAL MESSAGE ----> </font></b>" + expected);
			Assert.fail("<b>WRONG MESSAGE DISPLAYED</b>");
		}
	}

}
