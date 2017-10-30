package Tests;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.GroupsPage;
import Pages.HomePage;
import Pages.HomeScreenPage;
import Pages.OnboardingPage;
import Pages.ProfilePage;
import Pages.SettingsPage;
import Pages.TimerPage;


public class _0103_01_GuestModeTimerTests extends TestBase {

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
		homePage.clickSkip();
		onboardingPage.clickAFewMonthsOrMore();
		homeScreenPage.verifyIfUserIsOnHomeScreen();
	}
	
	@Test
	public void testTimerHelp() throws Throwable {
		beforeTest();
		timerPage.clickTabTimer();
		timerPage.clickTimerHelp();
		timerPage.verifyTimerHelpTitle();
		timerPage.verifyDurationActivityWarmupText();
	}
	
	@Test
	public void testTimerStartingBells() throws Throwable {
		beforeTest();
		timerPage.clickTabTimer();
		Thread.sleep(5000);
		//test if silent none and vibrate are present
		//add count for waiting for element array
		timerPage.clickBellImageByIndex(2);
		timerPage.clickGetBtn();
		timerPage.verifyAsianStyleBundleText();
		//click get
		timerPage.clickBellImageByIndex(2);
		timerPage.clickBellImageByIndex(2);
		timerPage.clickBellImageByIndex(2);
		timerPage.clickBellImageByIndex(2);
	}
	
	@Test
	public void testTimerSavePreset() throws Throwable {
		beforeTest();
		timerPage.clickTabTimer();
		timerPage.clickDots();
		//element is above start button, cannot focus on Save as a preset
		//timerPage.clickStart();
		//onboardingPage.verifyLoginWelcomeBtn();
	}

}