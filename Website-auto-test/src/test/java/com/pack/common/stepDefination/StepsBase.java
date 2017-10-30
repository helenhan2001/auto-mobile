package com.pack.common.stepDefination;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;

public class StepsBase {

	protected static WebDriver driver;

	public StepsBase() {
		if (driver == null) {
			try {
				driver = WebDriverFactory.createWebDriver();
			} catch (Throwable e) {
				e.printStackTrace();
				System.console().printf(e.getMessage());
				System.exit(-1);
			}

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			driver.manage().window().maximize();
		}
	}

	public WebElement getElement(By by) {
		return driver.findElement(by);
	};

	public void JavascriptClick(WebElement jselement) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", jselement);
	}

	public List<WebElement> GetElements(By by) {
		return driver.findElements(by);
	}

	public void tearDown() {
		driver.quit();
	}
}
