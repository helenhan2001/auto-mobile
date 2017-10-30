package com.pack.common.stepDefination;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.pack.common.pages.CreateUserPage;
import com.pack.common.pages.EditAndDeletePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

public class TestCreateUser extends StepsBase {

	@Then("^Create createEmployee successfully$")
	public void create_createEmployee_successfully(DataTable table) throws Throwable {

		CreateUserPage page = new CreateUserPage(driver);

		for (List<String> row : table.cells(1)) {
			page.clickCreatBtn();
			page.FillInEmployeeForm(row.get(0), row.get(1), row.get(2), row.get(3));
			page.clickAddBtn();

			// This is for server has error message when fill in special
			// character.

			// String expectedStatus = row.get(4);
			// if (expectedStatus.equals("failed")) {
			// try {
			// page.clickAddBtn();
			// Thread.sleep(2000);;
			// deletePage.acceptAlert("Error trying to create a new employee");
			// } catch (UnhandledAlertException f) {
			// try {
			// Alert alert = driver.switchTo().alert().accept();
			// } catch (NoAlertPresentException e) {
			// e.printStackTrace();
			// }
			// }
			// }else{
			// page.clickAddBtn();
			// }
			//
		}

	}

	@Then("^I fill in blank data I can see the tip message$")
	public void i_fill_in_blank_data_I_can_see_the_tip_message() throws Throwable {

		CreateUserPage page = new CreateUserPage(driver);
		page.clickCreatBtn();
		page.FillInEmployeeForm("", "", "", "");
		Assert.assertTrue("First Start Date tip message not correct!", page.isToolTipDisplayed());

	}

}