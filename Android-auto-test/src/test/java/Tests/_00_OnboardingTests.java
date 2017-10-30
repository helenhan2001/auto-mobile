package Tests;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.GroupsPage;
import Pages.HomePage;
import Pages.HomeScreenPage;
import Pages.OnboardingPage;
import Pages.ProfilePage;
import Pages.SettingsPage;
import Pages.TimerPage;


public class _00_OnboardingTests extends TestBase {

	HomePage homePage;
	GroupsPage groupsPage;
	ProfilePage profilePage;
	TimerPage timerPage;
	SettingsPage settingsPage;
	OnboardingPage onboardingPage;
	HomeScreenPage homeScreenPage;

	@BeforeTest
	@Override
	public void setUpPage() {
		homePage = new HomePage(driver);
		groupsPage = new GroupsPage(driver);
		timerPage = new TimerPage(driver);
		profilePage = new ProfilePage(driver);
		settingsPage = new SettingsPage(driver);
		onboardingPage = new OnboardingPage(driver);
		homeScreenPage = new HomeScreenPage(driver);
	}
	
	@BeforeClass
	@Override
	public void navigateTo() throws InterruptedException {

	}
	
	@AfterMethod()
	public void tearDown(ITestResult testResult, Method testMethod) {
		if (testResult.getStatus() == ITestResult.FAILURE) { 
		takeScreenshot(testMethod.getName() + getTodayDate());
		}
	}
	
	private void beforeTest() throws Throwable {
		resetApp();
	}
	
	@Test
	public void onboardingTests() throws Throwable {	
		_01_testLoginUser();
		_02_testAddPhoto();
		_03_testSearchLocation();
		_04_testRegisterUserFull();
		_05_testRegisterUserSimple();
		_06_testRegisterAndLoginUser();
		_07_testResetPassword();
		_08_testRegisterFieldsInputValidation();
		_09_testFacebookScreenFailedLogin();
		_10_testTermsAndConditions();
		_11_testOnboardingAFewMonthsOrMore();
		_12_testOnboardingMoreThanAYear();
		_13_testOnboardingImATeacher();
		_14_testOnboardingImNotHereToMeditate();
	}
	
	public void _01_testLoginUser() throws Throwable {	
		beforeTest();
		onboardingPage.clickLoginWelcomeBtn();
		onboardingPage.setEmail("qa@insight.co");
		onboardingPage.setPassword("Test123456");
		hideKeyboard();
		onboardingPage.clickLoginBtnLong();
		homeScreenPage.verifyNumberLogoMap();
	}
	
	public void _02_testAddPhoto() throws Throwable {	
		beforeTest();
		onboardingPage.clickRegisterItsFreeBtn();
		onboardingPage.setRegFieldsForRandomAcc("NewRandomAccount", "Test123456");
		onboardingPage.clickRegisterBtnLong();
		onboardingPage.clickAddPhotoBtn();
		onboardingPage.clickAllowBtn();
		navigateBack();
		onboardingPage.verifyLocationFieldIsDisplayed();
	}
	
	public void _03_testSearchLocation() throws Throwable {	
		beforeTest();
		onboardingPage.clickRegisterItsFreeBtn();
		onboardingPage.setRegFieldsForRandomAcc("NewRandomAccount", "Test123456");
		onboardingPage.clickRegisterBtnLong();
		onboardingPage.clickLocation();
		onboardingPage.setSearchLocation("Rio ");
		onboardingPage.clickRioDeJaneiroAndVerifyVisibility();
	}
	
	public void _04_testRegisterUserFull() throws Throwable {	
		beforeTest();
		onboardingPage.clickRegisterItsFreeBtn();
		onboardingPage.setRegFieldsForRandomAcc("NewRandomAccount", "Test123456");
		onboardingPage.clickRegisterBtnLong();
		onboardingPage.clickLocation();
		onboardingPage.setSearchLocation("Sydney, NSW, ");
		onboardingPage.clickSydneyNswAustraliaAndVerifyVisibility();
		onboardingPage.clickAddPhotoBtn();
		onboardingPage.clickAllowBtn();
		navigateBack();
		onboardingPage.clickFinishBtnLong();
		homeScreenPage.verifyNumberLogoMap();
	}
	
	public void _05_testRegisterUserSimple() throws Throwable {	
		beforeTest();
		onboardingPage.createNewRandomAccount();
		homeScreenPage.verifyNumberLogoMap();
	}
	
	public void _06_testRegisterAndLoginUser() throws Throwable {	
		beforeTest();
		onboardingPage.clickRegisterItsFreeBtn();
		onboardingPage.setRegFieldsForRandomAcc("NewRandomAccount", "Test123456");
		onboardingPage.clickRegisterBtnLong();
		onboardingPage.clickFinishBtnLong();
		homeScreenPage.verifyIfUserIsOnHomeScreen();
		resetApp();
		onboardingPage.clickLoginWelcomeBtn();
		onboardingPage.setEmail(BasePage.getNewEmail);
		onboardingPage.setPassword("Test123456");
		hideKeyboard();
		onboardingPage.clickLoginBtnLong();
		homeScreenPage.verifyNumberLogoMap();
	}
	
	public void _07_testResetPassword() throws Throwable {	
		beforeTest();
		onboardingPage.clickRegisterItsFreeBtn();
		onboardingPage.setRegFieldsForRandomAcc("NewRandomAccount", "Test123456");
		onboardingPage.clickRegisterBtnLong();
		onboardingPage.clickFinishBtnLong();
		homeScreenPage.verifyNumberLogoMap();
		resetApp();
		onboardingPage.clickLoginWelcomeBtn();
		onboardingPage.clickResetPasswordField();
		Thread.sleep(2000);
		onboardingPage.setEmail(BasePage.getNewEmail);
		onboardingPage.clickResetPasswordBtnLong();
		onboardingPage.verifyResetPasswordMessageInstructionsSent();
	}
	
	public void _08_testRegisterFieldsInputValidation() throws Throwable {	
		beforeTest();
		onboardingPage.clickRegisterItsFreeBtn();
		onboardingPage.setName("123456789012345678901234567890123456789012345678901");
		onboardingPage.clickRegisterBtnLong();
		onboardingPage.verifyFullNameLimitIs50Characters();
		onboardingPage.setName("Default Name");
		onboardingPage.setEmail("WrongEmail");
		onboardingPage.clickRegisterBtnLong();
		onboardingPage.verifyPleaseInputValidEmailAddress();
		onboardingPage.setEmail(BasePage.getRandomEmail());
		onboardingPage.setPassword("12345");
		onboardingPage.clickRegisterBtnLong();
		onboardingPage.verifyPasswordMustMeAtLeast6Characters();
		onboardingPage.setPassword("1234567890123456789012345678901");
		onboardingPage.clickRegisterBtnLong();
		onboardingPage.verifyfullNameLimitIs30Characters();
	}
	
	public void _09_testFacebookScreenFailedLogin() throws Throwable {	
		beforeTest();
		homePage.clickOrContinueWithFacebook();
		navigateBack();
		onboardingPage.verifyFacebookLoginFailedMessage();
		onboardingPage.clickOkBtn();
		homePage.clickSkip();
		onboardingPage.verifyJustStartingOutIsDisplayed();
	}
	
	public void _10_testTermsAndConditions() throws Throwable {	
		beforeTest();
		homePage.clickByContinuingYouAgreeToTermsAndConditions();
		homePage.verifyTermsAndPrivacy();
	}
	
	public void _11_testOnboardingAFewMonthsOrMore() throws Throwable {
		beforeTest();
		homePage.clickSkip();
		onboardingPage.clickAFewMonthsOrMore();
		homeScreenPage.verifyIfUserIsOnHomeScreen();
	}
	
	public void _12_testOnboardingMoreThanAYear() throws Throwable {
		beforeTest();
		homePage.clickSkip();
		onboardingPage.clickMoreThanAYear();
		homeScreenPage.verifyIfUserIsOnHomeScreen();
	}
	
	public void _13_testOnboardingImATeacher() throws Throwable {
		beforeTest();
		homePage.clickSkip();
		onboardingPage.clickImATeacher();
		homeScreenPage.verifyIfUserIsOnHomeScreen();
	}
	
	public void _14_testOnboardingImNotHereToMeditate() throws Throwable {
		beforeTest();
		homePage.clickSkip();
		onboardingPage.clickImNotHereToMeditate();
		homeScreenPage.verifyIfUserIsOnHomeScreen();	
	}
}