package Tests;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.GroupsPage;
import Pages.HomePage;
import Pages.HomeScreenAddFriendsPage;
import Pages.HomeScreenPage;
import Pages.LibraryLandingPage;
import Pages.LibraryMeditationPage;
import Pages.LibrarySearchPage;
import Pages.OnboardingPage;
import Pages.PlayerPage;
import Pages.ProfilePage;
import Pages.SettingsPage;
import Pages.TimerPage;
import Pages.UserProfilePage;

public class _0201_01_RegisteredModeHomeScreenTests extends TestBase {
	
	HomePage homePage;
	HomeScreenPage homeScreenPage;
	OnboardingPage onboardingPage;
	HomeScreenAddFriendsPage homeScreenAddFriendsPage;
	UserProfilePage userProfilePage;
	ProfilePage profilePage;
	SettingsPage settingsPage;
	PlayerPage playerPage;
	LibraryMeditationPage libraryMeditationPage;
	TimerPage timerPage;
	GroupsPage groupsPage;
	LibraryLandingPage libraryLandingPage;
	LibrarySearchPage librarySearchPage;

	@BeforeTest
	@Override
	public void setUpPage() {
		homePage = new HomePage(driver);
		homeScreenPage = new HomeScreenPage(driver);
		onboardingPage = new OnboardingPage(driver);
		homeScreenAddFriendsPage = new HomeScreenAddFriendsPage(driver);
		userProfilePage = new UserProfilePage(driver);
		profilePage = new ProfilePage(driver);
		settingsPage = new SettingsPage(driver);
		playerPage = new PlayerPage(driver);
		libraryMeditationPage = new LibraryMeditationPage(driver);
		timerPage = new TimerPage(driver);
		groupsPage = new GroupsPage(driver);
		libraryLandingPage = new LibraryLandingPage(driver);
		librarySearchPage = new LibrarySearchPage (driver);
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
		onboardingPage.loginAccount("qa@insight.co", "Test123456");
		homeScreenPage.verifyIfUserIsOnHomeScreen();
	}
	
	@Test
	public void testHomeScreenRefresh() throws Throwable {
		beforeTest();
		swipeToDownTimes(5);
		homeScreenPage.verifyIfUserIsOnHomeScreen();
	}
	
	@Test
	public void testHomescreenAddFriends() throws Throwable {
		beforeTest();
		swipeToDownTimes(4);
		homeScreenPage.clickAddFriendButton();
		homeScreenAddFriendsPage.verifyBackBtn();
		homeScreenAddFriendsPage.verifyFriends();
		homeScreenAddFriendsPage.clickInviteFriendsFromContacts();
		navigateBack();
		homeScreenAddFriendsPage.verifyInviteFriendsFromContactsText();
		homeScreenAddFriendsPage.verifyinviteFriendsFromFacebookText();
		homeScreenAddFriendsPage.clickInviteFriendsFromFacebook();
		navigateBack();
		homeScreenAddFriendsPage.verifyInviteFriendsFromContactsText();
		homeScreenAddFriendsPage.verifyinviteFriendsFromFacebookText();
		homeScreenAddFriendsPage.clickBackBtn();
		homeScreenPage.verifyIfUserIsOnHomeScreen();
	}

	@Test
	public void testHomescreenFriendsProfile() throws Throwable {	
		beforeTest();
		swipeToDownTimes(2);
		homeScreenPage.clickFriends();
		homeScreenPage.clickUserPicture();
		homeScreenPage.verifyFriend1Profile();
		userProfilePage.verifyUserTitle();
		userProfilePage.verifySydneyCity();
		userProfilePage.verifyMessage();		
	}
	
	@Test
	public void testFriendTimerSession() throws Throwable {
		beforeTest();
		homePage.clickLibraryTab();
		libraryLandingPage.verifyLibraryTitleElement();
		libraryLandingPage.clickSearchFieldForMeditations();		
		librarySearchPage.setSearchEditTextField("yoga nidra for sleep");
		hideKeyboard();
		librarySearchPage.clickYogaNidraForSleepMeditationText();
		libraryMeditationPage.verifyImageViewGuided();
		swipeToUpSmall();
		libraryMeditationPage.clickPlayImage();
		playerPage.finishMeditationEarly();
		timerPage.clickDoneBtn();
		timerPage.clickDoneText();
		timerPage.clickTabTimer();
		timerPage.clickStart();
		Thread.sleep(5000);
		timerPage.verifyCountDown();
		timerPage.clickPlayPause();
		timerPage.clickFinishEarly();
		timerPage.clickDoneBtn();
		onboardingPage.loginAccount("friend1@test.a.com", "Test123456");
		homeScreenPage.clickUserPicture();
		userProfilePage.verifyUserTitle();
		userProfilePage.verifyCompletedTimerSessionImage();
	}
	
	//add tries for groups to find

//	@Test
//	public void testHomescreenCommunity() throws Throwable {
//		onboardingPage.loginAccount("testacc2@a.com", "Test123456");
//		swipeToUpTimes(6);
//		homeScreenPage.verifyCommunity();
//		homeScreenPage.verifyUserPicture();
//		homeScreenPage.verifyUserContentText();
//		homeScreenPage.verifyGuidedMeditationAvatar();
//	}
	
	@Test
	public void testAddRemoveGroupsVisibility() throws Throwable {	
		onboardingPage.createNewRandomAccount();
		groupsPage.clickTabGroups();
	}
}
