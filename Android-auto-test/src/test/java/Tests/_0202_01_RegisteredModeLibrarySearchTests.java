package Tests;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LibraryLandingPage;
import Pages.LibraryMeditationPage;
import Pages.LibrarySearchPage;
import Pages.OnboardingPage;
import Pages.PlayerPage;
import Pages.ProfilePage;


public class _0202_01_RegisteredModeLibrarySearchTests extends TestBase {

	HomePage homePage;
	ProfilePage profilePage;
	PlayerPage playerPage;
	OnboardingPage onboardingPage;
	LibraryLandingPage libraryLandingPage;
	LibrarySearchPage librarySearchPage;
	LibraryMeditationPage libraryMeditationPage;

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
	}
	
	@Test
	public void testSearchScreenElements() throws Throwable {
		beforeTest();
		homePage.clickLibraryTab();
		libraryLandingPage.clickSearchFieldForMeditations();
		librarySearchPage.verifySearchIconTitleSubTitle();
	}
	
	@Test
	public void testSearchCancelFlow() throws Throwable {
		beforeTest();
		homePage.clickLibraryTab();
		libraryLandingPage.clickSearchFieldForMeditations();
		librarySearchPage.clickBackBtn();
		libraryLandingPage.verifyExploreText();
	}
	
	@Test
	public void testSearchImagesDisplay() throws Throwable {
		beforeTest();
		homePage.clickLibraryTab();
		libraryLandingPage.clickSearchFieldForMeditations();
		librarySearchPage.setSearchEditTextField("yoga nidra for sleep");
		librarySearchPage.verifyMeditationImagesListAfterSearch();
	}
	
	@Test
	public void testPlayImageMeditationYogaForSleep() throws Throwable {
		beforeTest();
		homePage.clickLibraryTab();
		libraryLandingPage.clickSearchFieldForMeditations();		
		librarySearchPage.setSearchEditTextField("yoga nidra for sleep");
		hideKeyboard();
		librarySearchPage.verifyYogaNidraForSleepMeditationText();
		librarySearchPage.clickYogaNidraForSleepMeditationText();
		libraryMeditationPage.verifyImageViewGuided();
	}
	
	@Test
	public void testSearchMeditationAndVerifyLandingElements() throws Throwable {
		beforeTest();
		homePage.clickLibraryTab();
		libraryLandingPage.clickSearchFieldForMeditations();
		librarySearchPage.setSearchEditTextField("yoga nidra for sleep");
		librarySearchPage.verifyMeditationImagesListAfterSearch();
		librarySearchPage.verifyYogaNidraForSleepMeditationText();
		librarySearchPage.verifyGuidedText();
		swipeToUp();
		librarySearchPage.verifyTalksText();
		librarySearchPage.verifyIntroToYogaNidraText();
	}
	
}