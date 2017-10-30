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


public class _0202_05_RegisteredModeSharingTests extends TestBase {

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
	
	private void beforeMeditationTest() throws Throwable {	
		onboardingPage.loginAccount("qa@insight.co", "Test123456");
		homePage.clickLibraryTab();
		swipeToUp();
		libraryLandingPage.clickMeditationTitle();
//		libraryLandingPage.clickSearchFieldForMeditations();		
//		librarySearchPage.setSearchEditTextField("yoga nidra for sleep");
//		librarySearchPage.clickYogaNidraForSleepText();
		libraryMeditationPage.clickShareBtn();
	}
	
	private void beforeTeacherTest() throws Throwable {	
		onboardingPage.loginAccount("qa@insight.co", "Test123456");
		homePage.clickLibraryTab();
		libraryLandingPage.click365DayPlaylist();
//		libraryLandingPage.clickSearchFieldForMeditations();		
//		librarySearchPage.setSearchEditTextField("365 Day Playlist");
//		librarySearchPage.click365DayPlaylist();
//		Thread.sleep(3000);
		libraryMeditationPage.clickShareBtnPublisher();
	}
	
	@Test
	public void testMeditationShareElementFacebook() throws Throwable {	
		beforeMeditationTest();
		libraryMeditationPage.clickFacebook();
	}
	
	@Test
	public void testMeditationShareElementMessenger() throws Throwable {	
		beforeMeditationTest();
		libraryMeditationPage.clickMessenger();
	}
	
	@Test
	public void testMeditationShareElementWhatsApp() throws Throwable {	
		beforeMeditationTest();
		libraryMeditationPage.clickWhatsApp();
	}
	
	@Test
	public void testTeacherShareElementFacebook() throws Throwable {	
		beforeTeacherTest();
		libraryMeditationPage.clickFacebook();
	}
	
	@Test
	public void testTeacherShareElementMessenger() throws Throwable {	
		beforeTeacherTest();
		libraryMeditationPage.clickMessenger();
	}
	
	@Test
	public void testTeacherShareElementWhatsApp() throws Throwable {	
		beforeTeacherTest();
		libraryMeditationPage.clickWhatsApp();
	}
}