package com.pack.common.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditAndDeletePage {

	private WebDriver driver;

	private By EditUser = By.xpath("//a[@id='bEdit']");
	private By UpdateBtn = By.xpath("//button[text()='Update']");
	private By DeleteBtn = By.xpath("//a[@id='bDelete']");
	private By InDelete = By.xpath("//p[@ng-click='deleteEmployee()']");
	private By LogoutBtn = By.xpath("//p[text()='Logout']");
	private By EmployeeSelected = By.xpath("//li[@ng-repeat='employee in employees' and contains(., 'Tom00')]");

	public EditAndDeletePage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean selectedEmployee() {

		WebElement eleEmployeeSelected = driver.findElement(EmployeeSelected);
		if (eleEmployeeSelected == null) {
			return false;
		}

		eleEmployeeSelected.click();
		return true;

	}

	public void editUser() {
		WebElement eleEdit = driver.findElement(EditUser);
		eleEdit.click();

	}

	public void deleteInEdit() throws Throwable {

		WebElement eleInDel = driver.findElement(InDelete);
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(eleInDel));

		eleInDel.click();
		acceptAlert("Are you sure you want to delete");
	}

	public void acceptAlert(String expectedAlertMsg) throws Throwable {
		Thread.sleep(100);
		Alert alert = driver.switchTo().alert();
		String actualAlertMeg = alert.getText();
		Assert.assertTrue("The Alert messgae not correct", actualAlertMeg.startsWith(expectedAlertMsg));
		alert.accept();

	}

	public void delUser() throws Throwable {
		WebElement eleDel = driver.findElement(DeleteBtn);

		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(eleDel));

		eleDel.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		// acceptAlert("Are you sure you want to delete");

	}

	public void updateUser() {
		WebElement eleUpdateUser = driver.findElement(UpdateBtn);
		eleUpdateUser.click();

	}

	public boolean verifyTextPresent(String value) {
		return driver.getPageSource().contains(value);
	}

	public void logout() {

		WebElement eleLogoutBtn = driver.findElement(LogoutBtn);
		eleLogoutBtn.click();
		driver.quit();

	}

}
