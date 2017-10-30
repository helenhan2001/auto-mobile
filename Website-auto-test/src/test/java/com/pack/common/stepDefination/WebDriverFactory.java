package com.pack.common.stepDefination;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class WebDriverFactory {
	public static WebBrowserTypes BrowserType = WebBrowserTypes.Safari;

	public static WebDriver createWebDriver() throws Throwable {
		switch (BrowserType) {
		case Chrome:
			return CreateChromeDriver();
		case Firefox:
			return createFirefoxDriver();
		case Safari:
			return CreateSarafiDriver();
		case Headless:
			return CreateHeadlessDriver();
		default:
			throw new Exception("The web broswer is not supported for now");
		}
	}

	// private static WebDriver createFirefoxDriver() {
	// System.setProperty("webdriver.gecko.driver",
	// "/Users/insighttimer/HelenTest/driver/geckodriver");
	// FirefoxProfile firefoxProfile = new FirefoxProfile();
	// // WebDriver firefoxDriver = new FirefoxDriver();
	//
	// DesiredCapabilities capabilities = new DesiredCapabilities();
	// capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
	// UnexpectedAlertBehaviour.ACCEPT);
	// return new FirefoxDriver(capabilities);
	//
	//
	// }
	private static WebDriver createFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver", "/Users/insighttimer/HelenTest/driver/geckodriver");
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		return new FirefoxDriver(capabilities);

	}

	private static WebDriver CreateChromeDriver() {

		System.setProperty("webdriver.chrome.driver", "/Users/insighttimer/HelenTest/driver/chromedriver");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
		return new ChromeDriver(dc);
	}

	private static WebDriver CreateSarafiDriver() {

		// DesiredCapabilities capabilities = DesiredCapabilities.safari();
		// capabilities.setCapability(SafariOptions.CAPABILITY, new
		// SafariOptions());
		// capabilities.setCapability("automaticInspection", true);
		// capabilities.setCapability("automaticProfiling", true);
		// capabilities.setCapability("cssSelectorsEnabled", true);
		// capabilities.setCapability("handlesAlerts", true);
		// capabilities.setCapability("javascriptEnabled", true);
		// return new SafariDriver(capabilities);
		//
		//
		// DesiredCapabilities capabilities = DesiredCapabilities.safari();
		// capabilities.setCapability(SafariOptions.CAPABILITY, options);
		// RemoteWebDriver driver = new RemoteWebDriver(
		// new URL("http://localhost:4444/wd/hub"), capabilities);

		DesiredCapabilities capabilities = DesiredCapabilities.safari();
		capabilities.setCapability(SafariOptions.CAPABILITY, new SafariOptions());
		return new SafariDriver(new SafariOptions());

	}

	private static WebDriver CreateHeadlessDriver() {

		HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);
		driver.setJavascriptEnabled(true);

		return driver;
	}
}
