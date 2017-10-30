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


public class _0101_01_GuestModeHomeScreenTests extends TestBase {

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
	public _0101_01_GuestModeHomeScreenTests() throws Throwable {
		_01_testHomeScreenRefresh();
		_02_testHomeScreenAddFriendIcon();
		_03_testHomeScreenSignInBtn();
		_04_testHomeScreenFriends();
		_05_testHomeScreenNearby();
		_06_testHomeScreenAddLocation();
		_07_testHomeScreenClickUserProfile();
		_08_testHomeScreenUserItems();
	}
	
	public void _01_testHomeScreenRefresh() throws Throwable {
		beforeTest();
		swipeToDownTimes(20);
		homeScreenPage.verifyIfUserIsOnHomeScreen();
	}
	
	public void _02_testHomeScreenAddFriendIcon() throws Throwable {	
		beforeTest();
		homeScreenPage.clickAddFriendButton();
		onboardingPage.verifyLoginWelcomeBtn();
	}
	
	public void _03_testHomeScreenSignInBtn() throws Throwable {	
		beforeTest();
		homeScreenPage.clickGuestModeSignInButton();
		onboardingPage.verifyLoginWelcomeBtn();
	}
	
	public void _04_testHomeScreenFriends() throws Throwable {	
		beforeTest();
		swipeToUp();
		homeScreenPage.verifyFriendsActivity();
		homeScreenPage.clickFriends();
		onboardingPage.verifyLoginWelcomeBtn();
	}

	public void _05_testHomeScreenNearby() throws Throwable {	
		beforeTest();
		swipeToUp();
		homeScreenPage.verifyFriendsActivity();
		homeScreenPage.clickNearby();
		homeScreenPage.verifyAddYourLocation();
	}
	
	public void _06_testHomeScreenAddLocation() throws Throwable {	
		beforeTest();
		swipeToUp();
		homeScreenPage.verifyFriendsActivity();
		homeScreenPage.clickNearby();
		homeScreenPage.verifyAddYourLocation();
		homeScreenPage.clickAddYourLocation();
		onboardingPage.setSearchLocation("Sydney, NSW, Australia");
		onboardingPage.clickSydneyNswAustralia();
		homeScreenPage.verifyUserPicture();
		navigateBack();
		swipeToUp();
		homeScreenPage.verifySydneyNswAustralia();
		homeScreenPage.verifyUserPicture();
		homeScreenPage.verifyUserContentText();
	}
	
	//add homescreen tests using counted scroll
//	@Test
//	public void testHomeScreenCommunity() throws Throwable {	
//		beforeTest();
//		swipeToUp();
//		homeScreenPage.verifyCommunity();
//		swipeToUp();
//		homeScreenPage.verifyUserPicture();
//		homeScreenPage.verifyUserContentText();
//		homeScreenPage.verifyGuidedMeditationAvatar();
//	}
	
	public void _07_testHomeScreenClickUserProfile() throws Throwable {	
		beforeTest();
		swipeToUp();
		homeScreenPage.clickUserPicture();
		onboardingPage.verifyLoginWelcomeBtn();
	}
	
	public void _08_testHomeScreenUserItems() throws Throwable {	
		beforeTest();
		swipeToUp();
		homeScreenPage.verifyTimerCounter();
		homeScreenPage.verifyUserViewContent();
		homeScreenPage.verifyUserViewDescription();
	}
}