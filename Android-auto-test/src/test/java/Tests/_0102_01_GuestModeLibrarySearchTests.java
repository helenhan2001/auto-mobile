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


public class _0102_01_GuestModeLibrarySearchTests extends TestBase {

	ProfilePage profilePage;
	PlayerPage playerPage;
	OnboardingPage onboardingPage;
	HomePage homePage;
	LibraryLandingPage libraryLandingPage;
	LibrarySearchPage librarySearchPage;
	LibraryMeditationPage libraryMeditationPage;

	@BeforeTest
	@Override
	public void setUpPage() {
		homePage = new HomePage(driver);
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
		resetApp();
		homePage.clickSkip();
		onboardingPage.clickAFewMonthsOrMore();
	}
	
	@Test
	public _0102_01_GuestModeLibrarySearchTests() throws Throwable {
		_01_testSearchScreenElements();
		_02_testSearchCancelFlow();
		_03_testSearchMeditationYogaForSleep();
		_04_testSearchImagesDisplay();
		_05_testPlayImageMeditationYogaForSleep();
		_06_testSearchMeditationAndVerifyLandingElements();
	}
	
	public void _01_testSearchScreenElements() throws Throwable {
		beforeTest();
		homePage.clickLibraryTab();
		libraryLandingPage.clickSearchFieldForMeditations();
		librarySearchPage.verifySearchIconTitleSubTitle();
	}
	
	public void _02_testSearchCancelFlow() throws Throwable {
		beforeTest();
		homePage.clickLibraryTab();
		libraryLandingPage.clickSearchFieldForMeditations();
		librarySearchPage.clickBackBtn();
		libraryLandingPage.verifyExploreText();
	}
	
	public void _03_testSearchMeditationYogaForSleep() throws Throwable {
		beforeTest();
		homePage.clickLibraryTab();
		libraryLandingPage.clickSearchFieldForMeditations();		
		librarySearchPage.setSearchEditTextField("yoga nidra for sleep");
		hideKeyboard();
		librarySearchPage.verifyYogaNidraForSleepMeditationText();
	}

	public void _04_testSearchImagesDisplay() throws Throwable {
		beforeTest();
		homePage.clickLibraryTab();
		libraryLandingPage.clickSearchFieldForMeditations();
		librarySearchPage.setSearchEditTextField("yoga nidra for sleep");
		librarySearchPage.verifyMeditationImagesListAfterSearch();
	}

	public void _05_testPlayImageMeditationYogaForSleep() throws Throwable {
		beforeTest();
		homePage.clickLibraryTab();
		libraryLandingPage.clickSearchFieldForMeditations();		
		librarySearchPage.setSearchEditTextField("yoga nidra for sleep");
		hideKeyboard();
		librarySearchPage.verifyYogaNidraForSleepMeditationText();
		librarySearchPage.clickYogaNidraForSleepMeditationText();
		libraryMeditationPage.verifyImageViewGuided();
	}

	public void _06_testSearchMeditationAndVerifyLandingElements() throws Throwable {
		beforeTest();
		homePage.clickLibraryTab();
		libraryLandingPage.clickSearchFieldForMeditations();
		librarySearchPage.setSearchEditTextField("yoga nidra for sleep");
		hideKeyboard();
		librarySearchPage.verifyYogaNidraForSleepMeditationText();
		librarySearchPage.verifyGuidedText();
		hideKeyboard();
		swipeToUp();
		librarySearchPage.verifyTalksText();
		librarySearchPage.verifyIntroToYogaNidraText();
	}
}