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

package Tests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * An abstract base for all of the Android tests within this package
 *
 * Responsible for setting up the Appium test Driver
 */
public abstract class TestBase {

	public static String getNewEmail;
	public static AndroidDriver<MobileElement> driver;

	@BeforeTest
	public abstract void setUpPage();

	@BeforeSuite

	public void setUpAppium() throws MalformedURLException, InterruptedException {

		boolean isLocal = true;

		if (isLocal) {
			File f = new File("src/test/java");
			File fs = new File(f, "203.apk");
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "GalaxyDemo");
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "200000");
			cap.setCapability("autoDismissAlerts", "true");
			cap.setCapability("autoAcceptAlerts", "true");
			cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} else {

			final String URL_STRING = "http://127.0.0.1:4723/wd/hub";

			URL url = new URL(URL_STRING);

			// Use a empty DesiredCapabilities object
			DesiredCapabilities capabilities = new DesiredCapabilities();

			driver = new AndroidDriver<MobileElement>(url, capabilities);

			// Use a higher value if your mobile elements take time to show up
			driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		}

	}
	
	public static String getTodayDate() {
		DateFormat df = new SimpleDateFormat("yyyyMMdd.HH.mm");
		Date today = Calendar.getInstance().getTime();
		String reportDate = df.format(today);
		return reportDate;
	}

	public boolean takeScreenshot(final String name) {
        String screenshotDirectory = System.getProperty("appium.screenshots.dir");
        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
    }

	public static void navigateBack() throws InterruptedException {	
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	public static boolean hideKeyboard() {
		try {
			driver.hideKeyboard();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static void closeApp() throws InterruptedException {
		driver.closeApp();
	}
	
	public static void resetApp() throws InterruptedException {
		driver.resetApp();
	}
	
	public static void launchApp() throws InterruptedException {
		driver.launchApp();
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
	
	public void swipeToUpTimes(int n) throws InterruptedException {
		
		for (int i = 0; i < n; i++)
		{
			int width = driver.manage().window().getSize().width;
			int height = driver.manage().window().getSize().height;
			driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, 1000);
			Thread.sleep(1000);
		}
	}
	
	public void swipeToDownTimes(int n) throws InterruptedException {
		for (int i = 0; i < n; i++)
		{
			int width = driver.manage().window().getSize().width;
			int height = driver.manage().window().getSize().height;
			driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, 1000);
			Thread.sleep(1000);
		}
	}

	public void swipeToUp() throws InterruptedException {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, 1000);
		Thread.sleep(1000);
	}
	
	public void swipeToUpSmall() throws InterruptedException {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width / 2, height * 2 / 4, width / 2, height / 4, 1000);
		Thread.sleep(200);
	}
	
	public void swipeToUpSmallTimes(int n) throws InterruptedException {
		
		for (int i = 0; i < n; i++)
		{
			int width = driver.manage().window().getSize().width;
			int height = driver.manage().window().getSize().height;
			driver.swipe(width / 2, height * 2 / 4, width / 2, height / 4, 1000);
			Thread.sleep(200);
		}
	}

	public void swipeToDown() {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, 1000);
	}

	public void swipeToLeft(int during) {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width * 3 / 4, height / 2, width / 4, height / 2, during);
	}

	public void swipeToRight(int during) {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width / 4, height / 2, width * 3 / 4, height / 2, during);
	}
	
	public void swipeUpToElement(MobileElement element) throws InterruptedException{
		for (int i=1; i<10; i++) {
			swipeToUp();
			Thread.sleep(200);
			if (elementExists(element)) {
				Thread.sleep(100);
				break;
			}
		}
	}
	
	public void verifyElementIsVisible(MobileElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertTrue(element.isDisplayed(), element + " is not visible");
	}
	
	public void verifyElementIsNotDisplayed(MobileElement element) {
		verifyElementIsVisible(element);
		try {
			element.isDisplayed();
			Assert.fail(element + " shouldn't be displayed");
			}
			catch (NoSuchElementException e) {}
	}
	
	public boolean elementExists(MobileElement element) {
		try {
			element.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Always remember to quit
	 */
	@AfterSuite
	public void tearDownAppium() {
		//driver.quit();
	}

	/**
	 *
	 * Creates a navigation page and navigates to the Class' category within the
	 * navigation drawer
	 *
	 */
	@BeforeClass
	public void navigateTo() throws InterruptedException {

		// login();

	}

	/**
	 * Restart the app after every test class to go back to the main screen and
	 * to reset the behavior
	 */
	@AfterClass
	public void restartApp() {
		//driver.resetApp();
	}

}
