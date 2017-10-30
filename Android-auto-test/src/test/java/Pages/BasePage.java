/*
 * Copyright 2014-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package Pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * A base for all the pages within the suite
 */
public abstract class BasePage {
	private static final int KEYBOARD_ANIMATION_DELAY = 1000;
	private static final int XML_REFRESH_DELAY = 1000;
	public static String getNewEmail;

	/**
	 * The driver
	 */
	protected final AppiumDriver driver;

	/**
	 * A base constructor that sets the page's driver
	 *
	 * The page structure is being used within this test in order to separate
	 * the page actions from the tests.
	 *
	 * Please use the AppiumFieldDecorator class within the page factory. This
	 * way annotations like @AndroidFindBy within the page objects.
	 *
	 * @param driver
	 *            the appium driver created in the beforesuite method.
	 */
	protected BasePage(AppiumDriver driver) {
		this.driver = driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
	}

	/**
	 * Tries three times to send text to element properly.
	 *
	 * Note: This method was needed because Appium sometimes sends text to
	 * textboxes incorrectly.
	 *
	 * @param input
	 *            String to be sent
	 * @param element
	 *            WebElement to receive text, cannot be a secure text field.
	 * @param appendNewLine
	 *            true to append a new line character to incoming string when
	 *            sending to element, else false
	 *
	 * @return true if keys were successfully sent, otherwise false.
	 */
	protected boolean sendKeysToElement(String input, WebElement element, boolean appendNewLine)
			throws InterruptedException {
		final int MAX_ATTEMPTS = 3;
		int attempts = 0;

		do {
			element.clear();
			Thread.sleep(KEYBOARD_ANIMATION_DELAY);

			if (appendNewLine) {
				element.sendKeys(input + "\n");
			} else {
				element.sendKeys(input);
			}

			Thread.sleep(XML_REFRESH_DELAY);
		} while (!element.getText().contains(input) && ++attempts < MAX_ATTEMPTS);

		return element.getText().contains(input);
	}
	
	public void swipeToUp() throws InterruptedException {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, 1000);
		Thread.sleep(1000);
	}
	
	public void swipeToDown() {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, 1000);
	}
	
	public void swipeToLeftUsingMobileArrayElement(List<MobileElement> element, int index, int duration) throws InterruptedException{
	    Point p = element.get(index).getCenter();
	    int startx = p.getX() * 5/6;
	    int starty = p.getY();
	    int endx = p.getX() / 6;
	    //int endy = p.getY();
	    driver.swipe(startx, starty, endx, starty, duration);
	    Thread.sleep(200);
	}
	
	public void swipeToUpSmall() throws InterruptedException {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width / 2, height * 2 / 4, width / 2, height / 4, 1000);
		Thread.sleep(200);
	}
	
	public boolean elementExists(MobileElement element) {
		try {
			element.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static String getRandomEmail() {
		DateFormat df = new SimpleDateFormat("yyyyMMdd.HHmmss.SSS");
		Date today = Calendar.getInstance().getTime();
		String reportDate = df.format(today);
		String randomEmail = reportDate + "@a.com";
		getNewEmail = randomEmail;
		return randomEmail;
	}
	
	public void verifyElementIsVisible(MobileElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 45);
		wait.until(ExpectedConditions.visibilityOf(element));
		//Assert.assertTrue(element.isDisplayed(), element + " is not visible");
	}
	
	public void verifyElementIsNotDisplayed(MobileElement element) {
		verifyElementIsVisible(element);
		try {
			element.isDisplayed();
			Assert.fail(element + " shouldn't be displayed");
			}
			catch (NoSuchElementException e) {}
	}
	
	public void clickElement(MobileElement element){
		verifyElementIsVisible(element);
		 int tries = 0;
		  while ( tries < 20 ) {
		    try {	    	
				element.click();
		      break;
		    } catch ( NoSuchElementException e ) {
		    	}
		    }		      	
	}
	
	public void setElement(MobileElement element, String string) {
    	verifyElementIsVisible(element);
		 int tries = 0;
		  while ( tries < 20 ) {
		    try {
				element.clear();
				element.sendKeys(string);
		      break;
		    } catch ( NoSuchElementException e ) {
		    	}
		  }
	}
	
	public void setElementNoWait(MobileElement element, String string) {
		 int tries = 0;
		  while ( tries < 10 ) {
		    try {
				//element.clear();
				element.sendKeys(string);
		      break;
		    } catch ( NoSuchElementException e ) {
		    	}
		  }
	}
}