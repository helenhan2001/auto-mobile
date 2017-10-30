package Tests;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.HomeScreenPage;
import Pages.OnboardingPage;
import Pages.ProfilePage;
import Pages.SettingsPage;
import Pages.TimerPage;


public class _0105_01_GuestModeProfileSettingsTests extends TestBase {

	HomePage homePage;
	ProfilePage profilePage;
	TimerPage timerPage;
	SettingsPage settingsPage;
	OnboardingPage onboardingPage;
	HomeScreenPage homeScreenPage;

	@BeforeTest
	@Override
	public void setUpPage() {
		homePage = new HomePage(driver);
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
		homePage.clickSkip();
		onboardingPage.clickAFewMonthsOrMore();
		homeScreenPage.verifyIfUserIsOnHomeScreen();
	}
	
	@Test
	public void testProfileAddInfo() throws Throwable {
		beforeTest();
		profilePage.clickTabProfile();
		profilePage.clickAddPhoto();
		onboardingPage.verifyLoginWelcomeBtn();	
	}
	
	@Test
	public void testProfileEnterName() throws Throwable {
		beforeTest();
		profilePage.clickTabProfile();
		profilePage.clickEnterYourName();
		onboardingPage.verifyLoginWelcomeBtn();
	}
	
	@Test
	public void testProfileDetailedCharts() throws Throwable {
		beforeTest();
		profilePage.clickTabProfile();
		profilePage.clickDetailedCharts();
		profilePage.verifyChartsTitle();
	}
	
	@Test
	public void testProfileYourMilestones() throws Throwable {
		beforeTest();
		profilePage.clickTabProfile();
		profilePage.clickYourMilestones();
		profilePage.verifyMilestonesEmptyGreeting();
	}
	
	@Test
	public void testProfileFriends() throws Throwable {
		beforeTest();
		profilePage.clickTabProfile();
		profilePage.clickFriends();
		onboardingPage.verifyLoginWelcomeBtn();
	}
	
	@Test
	public void testSettingsOpeningScreen() throws Throwable {
		beforeTest();
		profilePage.clickTabProfile();
		profilePage.clickGuestProfileUserSettings();
		settingsPage.clickOpeningScreen();
		onboardingPage.verifyLoginWelcomeBtn();
	}
	
	@Test
	public void testSettingsViewPrivacyTab() throws Throwable {
		beforeTest();
		profilePage.clickTabProfile();
		profilePage.clickGuestProfileUserSettings();
		settingsPage.clickPrivacy();
		onboardingPage.verifyLoginWelcomeBtn();
	}
		
}