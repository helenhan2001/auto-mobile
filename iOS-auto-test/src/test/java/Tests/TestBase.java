
package Tests;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Pages.LoginPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * An abstract base for all of the Android tests within this package
 *
 * Responsible for setting up the Appium test Driver
 */
public abstract class TestBase {
	Dimension size;
	String destDir;
	DateFormat dateFormat;
	IOSElement elmentA = null;
	IOSElement elmentB = null;
	int startX = 0, startY = 0, endX = 0, endY = 0;
	int duration = 0, time = 0;
	boolean isLocal = true;

	/**
	 * Make the driver static. This allows it to be created only once and used
	 * across all of the test classes.
	 * 
	 * 
	 * 
	 */

	public static IOSDriver<IOSElement> driver;

	/**
	 * This allows the navigation to work within the app. The category name is
	 * returned so we can navigate to it from the navigation drawer.
	 *
	 * @return The name of the Android category
	 */
	// public abstract String getName();

	/**
	 * A page containing the navigation drawer
	 */
	// private NavigationPage navigationPage;

	/**
	 * Method to initialize the test's page
	 * 
	 * @throws Throwable
	 */
	@BeforeTest(alwaysRun = true)
	public abstract void setUpPage() throws Throwable;

	/**
	 * This method runs before any other method.
	 *
	 * Appium follows a client - server model: We are setting up our appium
	 * client in order to connect to Device Farm's appium server.
	 *
	 * We do not need to and SHOULD NOT set our own DesiredCapabilities Device
	 * Farm creates custom settings at the server level. Setting your own
	 * DesiredCapabilities will result in unexpected results and failures.
	 *
	 * @throws MalformedURLException
	 *             An exception that occurs when the URL is wrong
	 */
	@BeforeSuite(alwaysRun = true)

	public void setUpAppium() throws MalformedURLException, InterruptedException {

		if (isLocal) {
			File f = new File("src/test/java");
			File fs = new File(f, "2610.app");
			File fconfig = new File(f, "myconfig.xcconfig");

			DesiredCapabilities cap = new DesiredCapabilities(); 
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
			cap.setCapability("xcodeConfigFile", fconfig.getAbsolutePath());

			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 7");
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.3");
			// cap.setCapability(MobileCapabilityType.UDID,
			// "F8BA9A0A-F486-4EDD-BF05-49B4F5193696");

			// iPad 9
			// cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPad 9");
			// cap.setCapability(MobileCapabilityType.UDID,
			// "ee5fb5a933f15d6534069a81f68d2008df6fe8a7");
			// cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,
			// "9.3.2");

			// iPHone 10.3.2
			// cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone");
			// cap.setCapability(MobileCapabilityType.UDID,
			// "f38389355f12edefc7cebbeb87c658392f7518f7");
			// cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,
			// "10.3.2");

			// iPad 10.3.3
			// cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ipad10");
			// cap.setCapability(MobileCapabilityType.UDID,
			// "a890d8b14892e51b6c1fd2932a8a917338f17128");
			// cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,
			// "10.3.3");

			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);

			cap.setCapability("simpleIsVisibleCheck", true);

			cap.setCapability("autoAcceptAlerts", true);

			// cap.setCapability(MobileCapabilityType.TAKES_SCREENSHOT, "true");
			// cap.setCapability(MobileCapabilityType.NO_RESET, true);

			// cap.setCapability(MobileCapabilityType.FULL_RESET, false);

			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "1200");

			cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
			cap.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);

			driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		} else {

			final String URL_STRING = "http://127.0.0.1:4723/wd/hub";

			URL url = new URL(URL_STRING);

			// Use a empty DesiredCapabilities object
			DesiredCapabilities capabilities = new DesiredCapabilities();

			driver = new IOSDriver<IOSElement>(url, capabilities);

			// Use a higher value if your mobile elements take time to show up
			driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

		}

	}

	public void tryLogin() throws InterruptedException {
		try {
			LoginPage loginPage = new LoginPage(driver);
			loginPage.LoginApp();
			acceptAlertIfExists();

		} catch (Exception ex) {

		}
	}

	/**
	 * Always remember to quit
	 */
	@AfterSuite(alwaysRun = true)
	public void tearDownAppium() {
		driver.quit();
	}

	/**
	 *
	 * Creates a navigation page and navigates to the Class' category within the
	 * navigation drawer
	 *
	 */
	@BeforeClass(alwaysRun = true)
	public void navigateTo() throws InterruptedException {

	}

	/**
	 * Restart the app after every test class to go back to the main screen and
	 * to reset the behavior
	 */
	@AfterClass(alwaysRun = true)
	public void restartApp() {

		// driver.closeApp();
		// driver.launchApp();
		// driver.resetApp();

	}

	public void swipeToUp(int during) {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, during);
	}

	public void swipeToDown(int during) {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		System.out.println(width);
		System.out.println(height);

		driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, during);
	}

	public void swipeToLeft(int during) {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width * 3 / 4, height / 2, width / 4, height / 2, during);

		// bigger driver.swipe(width -10, height / 2, width / 4, height / 2,
		// during);

	}

	public void swipeToRight(int during) {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width / 4, height / 2, width * 3 / 4, height / 2, during);
		// bigger driver.swipe(10, height / 2, width* 3/4+10, height / 2,
		// during);
	}

	public void SwipeAToBTwo(MobileElement elmentA, MobileElement elmentB, int duration, int time) {
		startX = elmentA.getLocation().x + elmentA.getSize().width / 2;
		startY = elmentA.getLocation().y + elmentA.getSize().height / 2;
		endX = elmentB.getLocation().x + elmentB.getSize().width / 2;
		endY = elmentB.getLocation().y + elmentB.getSize().height / 2;

		for (int i = 0; i < time; i++) {
			driver.swipe(startX, startY, endX, endY, duration);
		}

	}

	// public void SwipeAToB(MobileElement elmentA, MobileElement elmentB, int
	// duration, int time) {
	// TouchAction action = new TouchAction(driver);
	// action.longPress(elmentA).waitAction().moveTo(elmentB).perform().release();
	//
	// }

	// public void SwipeToB(MobileElement elmentB, int duration) {
	//
	// TouchAction action = new TouchAction(driver);
	// action.moveTo(el, x, y);
	// }

	public static void scroll(String direction) {

		JavascriptExecutor js = driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", direction);
		js.executeScript("mobile: scroll", scrollObject);

	}

	public static void scrollToElement(MobileElement element) {
		JavascriptExecutor js = driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("element", ((RemoteWebElement) element).getId());
		js.executeScript("mobile: scroll", scrollObject);
	}

	public boolean isAlertPresent() {
		boolean foundAlert = false;
		WebDriverWait wait = new WebDriverWait(driver,
				20/* timeout in seconds */);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			foundAlert = true;
		} catch (TimeoutException eTO) {
			foundAlert = false;
		}
		return foundAlert;
	}

	//
	//
	// public void acceptAlertIfExists() throws InterruptedException {
	//
	// boolean isIOSTEN = true;
	// if (isIOSTEN) {
	// if (isAlertPresent()) {
	// // driver.switchTo().alert().accept();
	// driver.findElementById("Allow").click();
	// }
	// } else
	//
	// {
	//
	// // WebDriverWait wait = new WebDriverWait(driver,
	// // 30/* timeout in seconds */);
	// // try {
	// // wait.until(new ExpectedCondition<WebElement>() {
	// // @Override
	// // public WebElement apply(WebDriver driver) {
	// // return driver.findElement(By.id("OK"));
	// // }
	// //
	// // @Override
	// // public String toString() {
	// // return "visibility of OK button on alert";
	// // }
	// // });
	// // } catch (TimeoutException ex) {
	// // Assert.fail("can't find the OK button");
	// // }
	//
	// driver.findElementById("OK").click();
	// }
	// }

	public void acceptAlertIfExists() throws InterruptedException {
		if (isAlertPresent()) {

			driver.switchTo().alert().accept();
			Thread.sleep(100);
		}
	}

	// public boolean isTCAgreePresent() {
	// boolean foundTCAgree = false;
	// WebDriverWait wait = new WebDriverWait(driver, 3/* timeout in seconds
	// */);
	// try {
	// wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Agree")));
	// foundTCAgree = true;
	// } catch (TimeoutException eTO) {
	// foundTCAgree = false;
	// }
	// return foundTCAgree;
	// }

	/*
	 * AWS no need to take screen public void takeScreenshot(String fileName) {
	 * 
	 * // Set folder name to store screenshots. String destDir = "screenshots";
	 * // Capture screenshot. File scrFile = ((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.FILE); // Set date format to set It as
	 * screenshot file name. dateFormat = new SimpleDateFormat("dd_hh_mm_ss");
	 * // Create folder under project with name "screenshots" provided to //
	 * destDir. new File(destDir).mkdirs(); // Set file name using current date
	 * time. String destFile = dateFormat.format(new Date()) + fileName +
	 * ".png";
	 * 
	 * try { // Copy paste file at destination folder location
	 * FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile)); } catch
	 * (IOException e) { e.printStackTrace(); } }
	 */

	// Visibility means that the element is not only displayed but also has a
	// height and width that is greater than 0
	public void assertVisibleWithTimer(MobileElement element, String message) {
		WebDriverWait wait = new WebDriverWait(driver,
				30/* timeout in seconds */);
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException ex) {
			takeScreenshot(message);
			Assert.fail(message);
		}
	}

	public void assertEnabledWithTimer(MobileElement element, String message) {
		WebDriverWait wait = new WebDriverWait(driver,
				30/* timeout in seconds */);
		try {
			wait.until(new ExpectedCondition<WebElement>() {
				@Override
				public WebElement apply(WebDriver driver) {
					return element.isEnabled() ? element : null;
				}

				@Override
				public String toString() {
					return "visibility of " + element;
				}
			});
		} catch (TimeoutException ex) {
			takeScreenshot(message);
			Assert.fail(message);
		}
	}

	public void assertDisplayedWithTimer(MobileElement element, String message) {
		WebDriverWait wait = new WebDriverWait(driver,
				30/* timeout in seconds */);
		try {
			wait.until(new ExpectedCondition<WebElement>() {
				@Override
				public WebElement apply(WebDriver driver) {
					return element.isDisplayed() ? element : null;
				}

				@Override
				public String toString() {
					return "visibility of " + element;
				}
			});
		} catch (TimeoutException ex) {
			takeScreenshot(message);
			Assert.fail(message);
		}
	}

	public void checkRepeatElement(String elementId) {
		List<IOSElement> interestOne = driver.findElementsByAccessibilityId(elementId);

		int interestOneSize = interestOne.size();
		Assert.assertTrue(interestOneSize == 1,
				elementId + " repeated " + interestOneSize + " name one not display correct");
	}

	public void tryLogoutApp() throws InterruptedException {
		try {
			LoginPage loginPage = new LoginPage(driver);
			loginPage.LogoutApp();

		} catch (Exception ex) {

		}
	}

	// From AWS it is works well local
	// public void scrollToElement() {
	// waitForElementToLoad(element1,5);
	// int x = element.getLocation().getX();
	// int y = element.getLocation().getY();
	//
	// int x1 = element2.getLocation().getX();
	// int y1 = element2.getLocation().getY();
	//
	// TouchAction touchAction = new TouchAction(driver);
	// touchAction.press(x, y).moveTo(x1, -y1).release().perform();
	// }

	// Below code is scrll to element then click
	// public static void waitForVisibilityAndClick(By locator, long timeout) {
	// AppiumDriver<IOSElement> driver = null;
	// try {
	// driver = AppiumDriverBuilder.getIOSDriver();
	// } catch (MalformedURLException e) {
	// e.printStackTrace();
	// }
	// WebDriverWait wait = new WebDriverWait(driver, timeout);
	//
	// IOSElement elem = (IOSElement)
	// wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	//
	// if (!elem.isDisplayed()) {
	// try {
	// driver.performTouchAction(new IOSTouchAction(driver).press(0,
	// 0).moveTo(elem).release());
	// // log.debug("after scrolling");
	// } catch (WebDriverException e) {
	// if (!e.getMessage().contains("Failed to find scrollable visible parent
	// with 2 visible children")) {
	// e.printStackTrace();
	// throw new WebDriverException(e);
	// } else {
	// log.warn("Failed to find scrollable visible parent with 2 visible
	// children");
	// }
	// }
	// }
	// wait.until(ExpectedConditions.visibilityOf(elem)).click();
	// }

	public boolean verifyTextPresent(String value) {

		// JavascriptExecutor jse = (JavascriptExecutor) driver;
		// String pageSource = jse.executeScript("return
		// document.documentElement.innerHTML;").toString();

		// String pageSource = java.net.URLDecoder.decode(url, "UTF-8");
		String pageSource = driver.getPageSource();

		// JavascriptExecutor jse = (JavascriptExecutor) driver;
		// String pageSource = jse.executeScript("return
		// arguments[0].innerHTML;",
		// driver.findElements(By.tagName("XCUIElementTypeWindow"))).toString();

		System.out.println(pageSource);
		try {

			boolean b = pageSource.contains(value);
			return b;

		} catch (Exception e) {
			return false;
		}

	}
	// {
	// if (driver.getPageSource().contains(value)){
	//
	// return true;
	// }
	// else
	// return false;
	//
	// }

	// try
	// {
	// Assert.IsTrue(verifyTextPresent("Selenium Wiki"));
	// Console.WriteLine("Selenium Wiki test is present on the home page");
	// }
	// catch (Exception)
	// {
	// Console.WriteLine("Selenium Wiki test is not present on the home page");
	// }
	//
	// Scroll-Down Until an Element DisplayedJava
	//
	// WebElement element =
	// driver.findElement(By.xpath("//*[text()[contains(.,'JavaScript for
	// DoExponent')]]"));
	// JavascriptExecutor js =(JavascriptExecutor)driver;
	// js.executeScript("arguments[0].scrollIntoView(true);",element);
	// 1
	// 2
	// 3
	// WebElement element =
	// driver.findElement(By.xpath("//*[text()[contains(.,'JavaScript for
	// DoExponent')]]"));
	// JavascriptExecutor js =(JavascriptExecutor)driver;
	// js.executeScript("arguments[0].scrollIntoView(true);",element);
	public void takeScreenshot(String fileName) {

		if (!isLocal) {
			return; // Don't take screenshots on AWS
		}

		// Set folder name to store screenshots.

		String destDir = "screenshots";
		// Capture screenshot.
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Set date format to set It as screenshot file name.
		dateFormat = new SimpleDateFormat("dd_hh_mm_ss");
		// Create folder under project with name "screenshots" provided to
		// destDir.
		new File(destDir).mkdirs();
		// Set file name using current date time.
		String destFile = dateFormat.format(new Date()) + fileName + ".png";

		try {
			// Copy paste file at destination folder location
			FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
