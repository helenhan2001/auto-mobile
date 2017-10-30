package com.pack.common.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private WebDriver driver;

	private By signin = By.xpath("//a[@title='Sign in']");

	private By username = By.id("user_session_email");
	private By Pwd = By.id("user_session_password");
	private By signTile = By.xpath("//h1[text()='helen']");
	private By submitBtn = By.xpath("//button[text()='Login']");
	// private By errorMsg = By.xpath("//");
	private By publishBtn = By.xpath("//a[@title='Publish']");

	private By upload = By.xpath("//a[text()='Begin upload']");

	private By startScratch = By.xpath("//span[text()='No thanks, I will start from scratch']");

	// private By title = By.xpath("//p[@class='large-caption']");

	// private By title = By.xpath("//p[@data-reactid='.0.3.0.0.1.0']");

	private By titlefill = By.xpath("//input[@maxlength='255']");

	private By typeContent = By.xpath("//span[text()='Lecture or podcast']");

	private By language = By.xpath("//span[text()='English (English)']");
	private By whom = By.xpath("//span[text()='Everyone']");
	private By yoga = By.xpath("//span[text()='Yoga']");
	private By practice = By.xpath("//span[text()='Affirmation Meditation']");

	private By traditions = By.xpath("//span[text()='Traditions']");
	private By buddhism = By.xpath("//span[text()='Buddhism']");
	private By religious = By.xpath("//span[text()='Religious']");

	private By benefit = By.xpath("//span[text()='Recovery and healing']");
	private By benefitDetails = By.xpath("//span[text()='Dealing with grief']");
	private By sacred = By.xpath("//span[text()='Sacred']");
	private By lecture = By.xpath("//span[text()='Lecture']");

	private By no = By.xpath("//span[text()='No']");

	private By uploadMp3 = By.xpath("//input[@class='form-upload']");
	private By uploadImg = By.xpath("//input[@name='picture']");
	private By textarea = By.xpath("//textarea[@class='form-textarea form-large form-flat']");

	// private By imgDone = By.xpath("//a[text()='Done']");
	private By imgDone = By.xpath("//a[@class='close vertical-center']");

	private By copyrightYes = By.xpath("//span[text()='YES']");
	private By previewUpload = By.xpath("//a[text()='Preview upload']");

	private By submit = By.xpath("//a[text()='Exit and submit for approval']");
	private By uploadCompleted = By.xpath("//h1[text()='Upload completed!']");
	private By trackList = By.xpath("//a[text()='Go to track list']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickPublish() {

		WebElement publish = driver.findElement(publishBtn);
		publish.click();

	}

	public void clickSigninBtn() {

		WebElement signinBtn = driver.findElement(signin);
		signinBtn.click();

	}

	public void clickUpload() {

		WebElement uploadBtn = driver.findElement(upload);
		uploadBtn.click();

	}

	public void clickStartScratch() throws InterruptedException {

		WebElement startScratchBtn = driver.findElement(startScratch);
		startScratchBtn.click();
		Thread.sleep(300);
	}

	public void uploadContent() throws InterruptedException {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.querySelectorAll('[data-reactid=\".0.3.0.0.1\"]')[0].click();");
		Thread.sleep(300);
		WebElement titleSendkey = driver.findElement(titlefill);
		titleSendkey.sendKeys("HelenTestUpload");

		// type of content
		jse.executeScript("document.querySelectorAll('[data-reactid=\".0.3.1.0.1\"]')[0].click();");

		WebElement typeContentBtn = driver.findElement(typeContent);
		typeContentBtn.click();
		// next page
		jse.executeScript("document.querySelectorAll('[data-reactid=\".0.3.2.0.0\"]')[0].click();");

		// language
		jse.executeScript("document.querySelectorAll('[data-reactid=\".0.3.0.0\"]')[0].click();");
		WebElement languageBtn = driver.findElement(language);
		languageBtn.click();

		// whom
		jse.executeScript("document.querySelectorAll('[data-reactid=\".0.3.1.0.1\"]')[0].click();");
		WebElement whomBtn = driver.findElement(whom);
		whomBtn.click();

		// next page
		jse.executeScript("document.querySelectorAll('[data-reactid=\".0.3.2.0.1.0\"]')[0].click();");

		// Activity- what is primary user
		jse.executeScript("document.querySelectorAll('[data-reactid=\".0.3.1.0.1\"]')[0].click();");
		WebElement yogaBtn = driver.findElement(yoga);
		yogaBtn.click();

		// Activity- what is primary practice
		jse.executeScript("document.querySelectorAll('[data-reactid=\".0.3.2.0.1\"]')[0].click();");
		WebElement practiceBtn = driver.findElement(practice);
		practiceBtn.click();

		// Origins & Influences
		jse.executeScript("document.querySelectorAll('[data-reactid=\".0.3.5.0.1\"]')[0].click();");
		WebElement traditionsBtn = driver.findElement(traditions);
		traditionsBtn.click();

		WebElement buddhismBtn = driver.findElement(buddhism);
		buddhismBtn.click();

		// Does this contain spiritual or religious references?
		jse.executeScript("document.querySelectorAll('[data-reactid=\".0.3.8.0.1\"]')[0].click();");
		WebElement religiousBtn = driver.findElement(religious);
		religiousBtn.click();

		// What is the primary benefit for the listener?
		jse.executeScript("document.querySelectorAll('[data-reactid=\".0.3.a.0.0.1\"]')[0].click();");
		WebElement benefitBtn = driver.findElement(benefit);
		benefitBtn.click();

		WebElement benefitDetailsBtn = driver.findElement(benefitDetails);
		benefitDetailsBtn.click();

		// Additional categorization
		jse.executeScript("document.querySelectorAll('[data-reactid=\".0.3.e.0.0.1\"]')[0].click();");
		WebElement lectureBtn = driver.findElement(lecture);
		lectureBtn.click();

		// Meditation or formal practice contained within the file
		jse.executeScript("document.querySelectorAll('[data-reactid=\".0.3.e.2.0.1\"]')[0].click();");
		WebElement noBtn = driver.findElement(no);
		noBtn.click();

		// next page
		jse.executeScript("document.querySelectorAll('[data-reactid=\".0.3.h.0.1.0\"]')[0].click();");

		// click browser then upload mp3
		// jse.executeScript("document.querySelectorAll('[data-reactid=\".0.3.0.0.1.1\"]')[0].click();");

		String filePath = System.getProperty("user.dir") + "/src/test/java/ambient_ocean.mp3";

		WebElement uploadMp3Btn = driver.findElement(uploadMp3);
		uploadMp3Btn.sendKeys(filePath);
		Thread.sleep(3000);

		// click browser then upload image
		// jse.executeScript("document.querySelectorAll('[data-reactid=\".0.3.0.0.1.1\"]')[0].click();");

		String filePathImg = System.getProperty("user.dir") + "/src/test/java/new.jpg";

		WebElement uploadImgBtn = driver.findElement(uploadImg);
		uploadImgBtn.sendKeys(filePathImg);
		Thread.sleep(3000);

		WebElement imgDoneBtn = driver.findElement(imgDone);
		imgDoneBtn.click();
		Thread.sleep(3000);

		// textarea
		jse.executeScript("document.querySelectorAll('[data-reactid=\".0.3.2.0.0\"]')[0].click();");
		Thread.sleep(3000);
		WebElement textareaBtn = driver.findElement(textarea);

		textareaBtn.sendKeys("This is test for textArea for 1000");
		Thread.sleep(3000);
		// Do you own the copyright?
		jse.executeScript("document.querySelectorAll('[data-reactid=\".0.3.4.0.1\"]')[0].click();");

		WebElement copyrightYesBtn = driver.findElement(copyrightYes);
		copyrightYesBtn.click();
		Thread.sleep(500);
		// Preview upload

		WebElement previewUploadBtn = driver.findElement(previewUpload);
		previewUploadBtn.click();

		// Exit and submit for approval

		WebElement submitBtn = driver.findElement(submit);
		submitBtn.click();

		//
		WebElement uploadCompletedBtn = driver.findElement(uploadCompleted);
		// uploadCompletedBtn.isDisplayed();.

		WebElement trackListBtn = driver.findElement(trackList);
		trackListBtn.click();

	}

	// public void enterName(String userName) {
	// new WebDriverWait(driver,
	// 30).until(ExpectedConditions.visibilityOfElementLocated(username));
	// WebElement loginName = driver.findElement(username);
	// if (loginName.isDisplayed())
	// loginName.sendKeys(userName);
	//
	// }

	public void enterName(String userName) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(username));
		WebElement loginName = driver.findElement(username);
		if (loginName.isDisplayed())
			loginName.sendKeys(userName);

	}

	public void enterPwd(String password) {

		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(Pwd));
		WebElement loginPwd = driver.findElement(Pwd);
		if (loginPwd.isDisplayed())
			loginPwd.sendKeys(password);
	}

	public void login(String userName, String password) {

		WebElement loginName = driver.findElement(username);
		WebElement loginPwd = driver.findElement(Pwd);
		loginName.sendKeys(userName);
		loginPwd.sendKeys(password);
	}

	public String getSignTitle() {

		WebElement pageTitle = driver.findElement(signTile);
		String title = pageTitle.getText();
		return title;

	}

	public void clickLogin() {

		WebElement loginBtn = driver.findElement(submitBtn);
		loginBtn.submit();

	}

	public boolean verifyLoginSuccessfulMsg() {
		String expectedTitle = "helen";
		return getSignTitle().contains(expectedTitle);

	}

	public boolean verifySignInPageTitle() {
		String expectedTitle = "Insight Timer";
		return driver.getTitle().contains(expectedTitle);

	}

	// public boolean errorSingIn() {
	//
	// enterName("errorUserName");
	// enterPwd("errorPwd");
	// clickLogin();
	// return getErrorMessage().contains("Invalid");
	//
	// }

	// public String getErrorMessage() {
	// String strErrorMsg = null;
	// WebElement errorMessage = driver.findElement(errorMsg);
	// if (errorMessage.isDisplayed() && errorMessage.isEnabled())
	// strErrorMsg = errorMessage.getText();
	// return strErrorMsg;
	//
	// }

	// public boolean verifyFooter() {
	//
	// WebElement eleAngularJS = driver.findElement(angularJS);
	//
	// WebElement eleCoffeeScript = driver.findElement(coffeeScript);
	//
	// WebElement eleBourbon = driver.findElement(bourbon);
	//
	// WebElement eleRails = driver.findElement(rails);
	//
	// WebElement eleJensKrause = driver.findElement(jensKrause);
	//
	// if (eleAngularJS.isDisplayed() && eleCoffeeScript.isDisplayed() &&
	// eleBourbon.isDisplayed()
	// && eleRails.isDisplayed() && eleJensKrause.isDisplayed()) {
	//
	// return true;
	// }
	//
	// return false;
	//
	// }
}
