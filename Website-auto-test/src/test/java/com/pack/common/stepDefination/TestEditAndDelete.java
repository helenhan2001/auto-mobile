package com.pack.common.stepDefination;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.junit.Assert;

import com.pack.common.pages.CreateUserPage;
import com.pack.common.pages.EditAndDeletePage;
import com.pack.common.pages.LoginPage;

import cucumber.api.java.en.Then;

public class TestEditAndDelete extends StepsBase {

	@Then("^I select one user and click the Edit Btn to Edit User$")
	public void i_select_one_user_and_click_the_Edit_Btn_to_Edit_User() throws Throwable {

		EditAndDeletePage page = new EditAndDeletePage(driver);

		page.selectedEmployee();
		page.editUser();

		CreateUserPage updatePage = new CreateUserPage(driver);
		updatePage.FillInEmployeeForm("Tom00UpdateName", "Tom00LatName", "2012-02-01", "Test@Tom.com");

		page.updateUser();
		String updateName = driver
				.findElement(By
						.xpath("//li[@ng-repeat='employee in employees' and contains(., 'Tom00UpdateName Tom00LatName')]"))
				.getText();

		Assert.assertTrue(updateName.contains("Tom00UpdateName Tom00LatName"));
	}

	@Then("^I select one user and delete the user when edit$")
	public void i_select_one_user_and_delete_the_user_when_edit() throws Throwable {
		EditAndDeletePage page = new EditAndDeletePage(driver);
		page.selectedEmployee();
		page.editUser();
		page.deleteInEdit();
		Thread.sleep(1000);
	}

	@Then("^I select the test user and click to delete the user$")
	public void i_select_the_test_user_and_click_to_delete_the_user() throws Throwable {
		EditAndDeletePage page = new EditAndDeletePage(driver);
		if (page.selectedEmployee()) {
			page.delUser();
		}
	 	Assert.assertFalse("The Employee not deleted successfully! ", page.verifyTextPresent("Tom00"));

		page.logout();
	}

}
