package Pages;

import Tests.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OnboardingPage extends BasePage {

	private AndroidDriver<AndroidElement> driver;

	public OnboardingPage(AppiumDriver driver) {
		super(driver);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Just starting out']")
	private MobileElement justStartingOut;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='A few months or more']")
	private MobileElement aFewMonthsOrMore;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='More than a year']")
	private MobileElement moreThanAYear;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"I'm a teacher\"]")
	private MobileElement imATeacher;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"I'm not here to meditate\"]")
	private MobileElement imNotHereToMeditate;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/button_register")
	private MobileElement registerBtn;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/register_button")
	private MobileElement registerBtnLong;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/image_view_checkbox")
	private MobileElement checkBox;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/name_text_input")
	private MobileElement nameInput;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/email_text_input")
	private MobileElement emailInput;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/password_text_input")
	private MobileElement passwordInput;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/button_finish")
	private MobileElement finishBtnLong;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/login_button")
	private MobileElement loginBtnLong;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/text_input_location")
	private MobileElement locationInput;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/button_finish")
	private MobileElement finishBtn;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/reset_password_button")
	private MobileElement resetPasswordBtn;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/reset_button")
	private MobileElement resetPasswordBtnLong;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Instructions sent']")
	private MobileElement resetPasswordMessageInstructionsSent;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/image_view_avatar")
	private MobileElement addPhotoBtn;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/text_input_city_name")
	private MobileElement searchLocation;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sydney, NSW, Australia']")
	private MobileElement sydneyNswAustralia;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Sydney, NSW, Australia']")
	private MobileElement sydneyNswAustraliaPicked;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Rio de Janeiro, RJ, Brazil']")
	private MobileElement rioDeJaneiro;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Rio de Janeiro, RJ, Brazil']")
	private MobileElement rioDeJaneiroPicked;
	
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	private MobileElement allowBtn;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Full name limit is 50 characters']")
	private MobileElement fullNameLimitIs50Characters;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Please input valid email address']")
	private MobileElement pleaseInputValidEmailAddress;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Password must be at least 6 characters']")
	private MobileElement passwordMustMeAtLeast6Characters;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Full Name limit is 30 characters']")
	private MobileElement fullNameLimitIs30Characters;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Facebook Login failed']")
	private MobileElement facebookLoginFailed;

	//@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement okBtn;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/welcome_login_button")
	private MobileElement loginWelcomeBtn;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/welcome_register_with_email")
	private MobileElement registerItsFreeBtn;
	
	public void createNewRandomAccount() throws InterruptedException {
		TestBase.resetApp();
		clickRegisterItsFreeBtn();
		setRegFieldsForRandomAcc("NewRandomAccount", "Test123456");
		clickRegisterBtnLong();
		clickFinishBtnLong();
	}
	
	public void clickLoginWelcomeBtn() {
		clickElement(loginWelcomeBtn);
	}
	
	public void verifyLoginWelcomeBtn() {
		verifyElementIsVisible(loginWelcomeBtn);
	}
	
	public void clickRegisterItsFreeBtn() {
		clickElement(registerItsFreeBtn);
	}
	
	public void clickOkBtn() {
		clickElement(okBtn);
	}
	
	public void verifyJustStartingOutIsDisplayed() {
		verifyElementIsVisible(justStartingOut);
	}
	
	public void verifyFacebookLoginFailedMessage() {
		verifyElementIsVisible(facebookLoginFailed);
	}
	
	public void verifyfullNameLimitIs30Characters() {
		verifyElementIsVisible(fullNameLimitIs30Characters);
	}
	
	public void verifyPasswordMustMeAtLeast6Characters() {
		verifyElementIsVisible(passwordMustMeAtLeast6Characters);
	}
	
	public void verifyPleaseInputValidEmailAddress() {
		verifyElementIsVisible(pleaseInputValidEmailAddress);
	}
	
	public void verifyFullNameLimitIs50Characters() {
		verifyElementIsVisible(fullNameLimitIs50Characters);
	}
	
	public void clickAllowBtn() throws InterruptedException {
		clickElement(allowBtn);
		Thread.sleep(2000);
	}
	
	public void clickSydneyNswAustralia() {
		clickElement(sydneyNswAustralia);
	}
	
	public void clickSydneyNswAustraliaAndVerifyVisibility() {
		clickElement(sydneyNswAustralia);
		verifyElementIsVisible(sydneyNswAustraliaPicked);
	}
	
	public void clickRioDeJaneiroAndVerifyVisibility() {
		clickElement(rioDeJaneiro);
	}
	
	public void setSearchLocation(String name) throws InterruptedException {
		setElement(searchLocation, name);
		Thread.sleep(2000);
	}
	
	public void clickAddPhotoBtn() {
		clickElement(addPhotoBtn);
	}
	
	public void verifyResetPasswordMessageInstructionsSent() {
		verifyElementIsVisible(resetPasswordMessageInstructionsSent);
	}
	
	public void clickResetPasswordBtnLong() {
		clickElement(resetPasswordBtnLong);
	}
	
	public void clickResetPasswordField() {
		clickElement(resetPasswordBtn);
	}
	
	public void clickFinishBtn() {
		clickElement(finishBtn);
	}
	
	public void clickLocation() {
		clickElement(locationInput);
	}
	
	public void verifyLocationFieldIsDisplayed() {
		verifyElementIsVisible(locationInput);
	}
	
	public void clickLoginBtnLong() {
		clickElement(loginBtnLong);
	}
	
	public void clickImNotHereToMeditate() {
		clickElement(imNotHereToMeditate);
	}
	
	public void clickFinishBtnLong() {
		clickElement(finishBtnLong);
	}
	
	public void setRegFieldsForRandomAcc(String name, String password) throws InterruptedException {		
		setName(name);
		Thread.sleep(400);
		setEmail(getRandomEmail());
		Thread.sleep(400);
		setPassword(password);
		Thread.sleep(400);
	}
	
	public void setName(String name) {
		setElement(nameInput, name);
	}
	
	public void setEmail(String email) throws InterruptedException {
		setElement(emailInput, email);
	}
	
	public void setPassword(String pass) throws InterruptedException {
		setElement(passwordInput, pass);
	}
	
	public void clickRegisterBtn() {
		clickElement(registerBtn);
	}
	
	public void clickRegisterBtnLong() {
		clickElement(registerBtnLong);
	}
	
	public void clickCheckBox() {
		clickElement(checkBox);
	}
	
	public void clickJustStartingOut() throws InterruptedException {
		clickElement(justStartingOut);
		Thread.sleep(2000);
	}
	
	public void clickAFewMonthsOrMore() throws InterruptedException {
		clickElement(aFewMonthsOrMore);
		Thread.sleep(2000);
	}
	
	public void clickMoreThanAYear() throws InterruptedException {
		clickElement(moreThanAYear);
		Thread.sleep(2000);
	}
	
	public void clickImATeacher() throws InterruptedException {
		clickElement(imATeacher);
		Thread.sleep(2000);
	}
	
	public void loginAccount(String email, String password) throws Throwable {
		TestBase.resetApp();
		clickLoginWelcomeBtn();
		setEmail(email);
		setPassword(password);
		TestBase.hideKeyboard();
		clickLoginBtnLong();
	}
}
