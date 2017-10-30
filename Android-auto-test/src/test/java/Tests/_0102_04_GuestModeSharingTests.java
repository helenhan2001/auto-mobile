package Tests;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LibraryItemsPage;
import Pages.LibraryLandingPage;
import Pages.LibraryMeditationPage;
import Pages.LibrarySearchPage;
import Pages.OnboardingPage;
import Pages.PlayerPage;
import Pages.ProfilePage;


public class _0102_04_GuestModeSharingTests extends TestBase {

	HomePage homePage;
	ProfilePage profilePage;
	PlayerPage playerPage;
	OnboardingPage onboardingPage;
	LibraryLandingPage libraryLandingPage;
	LibrarySearchPage librarySearchPage;
	LibraryMeditationPage libraryMeditationPage;
	LibraryItemsPage libraryItemsPage;

	@BeforeTest
	@Override
	public void setUpPage() {
		homePage = new HomePage(driver);
		profilePage = new ProfilePage(driver);
		playerPage = new PlayerPage(driver);
		onboardingPage = new OnboardingPage(driver);
		libraryLandingPage = new LibraryLandingPage(driver);
		librarySearchPage = new LibrarySearchPage(driver);
		libraryMeditationPage = new LibraryMeditationPage(driver);
		libraryItemsPage = new LibraryItemsPage(driver);
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

	private void beforeTestMeditation() throws Throwable {	
		resetApp();
		homePage.clickSkip();
		onboardingPage.clickAFewMonthsOrMore();
		homePage.clickLibraryTab();
		swipeToUp();
		libraryLandingPage.clickMeditationTitle();
		//libraryLandingPage.clickSearchFieldForMeditations();		
		//librarySearchPage.setSearchEditTextField("yoga nidra for sleep");
		//librarySearchPage.clickYogaNidraForSleepText();
		libraryMeditationPage.clickShareBtn();
	}
	
	private void beforeTestTeacher() throws Throwable {	
		resetApp();
		homePage.clickSkip();
		onboardingPage.clickJustStartingOut();
		homePage.clickLibraryTab();
		libraryLandingPage.click365DayPlaylist();
		//libraryLandingPage.clickSearchFieldForMeditations();		
		//librarySearchPage.setSearchEditTextField("365 Day Playlist");
		//librarySearchPage.click365DayPlaylist();
		libraryMeditationPage.clickShareBtnPublisher();
	}
	
	@Test
	public void testMeditationShareElementFacebook() throws Throwable {	
		beforeTestMeditation();
		libraryMeditationPage.clickFacebook();
	}
	
	@Test
	public void testMeditationShareElementMessenger() throws Throwable {	
		beforeTestMeditation();
		libraryMeditationPage.clickMessenger();
	}
	
	@Test
	public void testMeditationShareElementWhatsApp() throws Throwable {	
		beforeTestMeditation();
		libraryMeditationPage.clickWhatsApp();
	}
	
	@Test
	public void testTeacherShareElementFacebook() throws Throwable {	
		beforeTestTeacher();
		libraryMeditationPage.clickFacebook();
	}
	
	@Test
	public void testTeacherShareElementMessenger() throws Throwable {	
		beforeTestTeacher();
		libraryMeditationPage.clickMessenger();
	}
	
	@Test
	public void testTeacherShareElementWhatsApp() throws Throwable {	
		beforeTestTeacher();
		libraryMeditationPage.clickWhatsApp();
	}
}