package com.pack.common.pages;

import org.openqa.selenium.By;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CreateUserPage {

	private WebDriver driver;

	public CreateUserPage(WebDriver driver) {
		this.driver = driver;
	}

	private By createEmployee 	= By.xpath("//a [contains(text(), 'Create')]");
	private By firstName 		= By.xpath("//input[@ng-model='selectedEmployee.firstName']");
	private By lastName	 		= By.xpath("//input[@ng-model='selectedEmployee.lastName']");
	private By startDate 		= By.xpath("//input[@ng-model='selectedEmployee.startDate']");
	private By email	 		= By.xpath("//input[@ng-model='selectedEmployee.email']");
	private By addButton 		= By.xpath("//button[@ng-show='isCreateForm']");

	public void clickCreatBtn() {
		WebElement eleCreateBtn = driver.findElement(createEmployee);
		eleCreateBtn.click();
	}

	public void FillInEmployeeForm(String FirstName, String LastName, String StartDate, String Email) {

		WebElement eleFirstName = driver.findElement(firstName);
		eleFirstName.clear();
		eleFirstName.sendKeys(FirstName);
		WebElement eleLastName = driver.findElement(lastName);
		eleLastName.clear();
		eleLastName.sendKeys(LastName);
		WebElement eleStartDate = driver.findElement(startDate);
		eleStartDate.clear();
		eleStartDate.sendKeys(StartDate);
		WebElement eleEmail = driver.findElement(email);
		eleEmail.clear();
		eleEmail.sendKeys(Email);

	}

	public boolean isToolTipDisplayed() {
		Actions action = new Actions(driver);
		
		WebElement eleStartDate = driver.findElement(startDate);
		action.moveToElement(eleStartDate).build().perform();

		String tooltipText = eleStartDate.getAttribute("title");
		return tooltipText.contains("Please enter a date formatting YYYY-MM-DD");


	}

	public void clickAddBtn() {

		WebElement eleAddBtn = driver.findElement(addButton);
		eleAddBtn.click();
	}
}
