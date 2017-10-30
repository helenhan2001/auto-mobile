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


public class _0102_03_GuestModeLanguagesLibraryTests extends TestBase {

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
		resetApp();
		homePage.clickSkip();
		onboardingPage.clickAFewMonthsOrMore();
	}
	
	@Test
	public void testLanguageSelectElements() throws Throwable {
		beforeTest();
		homePage.clickLibraryTab();
		libraryLandingPage.verifyExploreText();
		libraryLandingPage.verifyLanguageButton();
	}
	
	@Test
	public void testLanguageSelectGerman() throws Throwable {
		beforeTest();
		homePage.clickLibraryTab();
		libraryLandingPage.clickLanguageButton();
		libraryLandingPage.clickGerman();
	}
	
	@Test
	public void testLanguageSelectItalian() throws Throwable {
		beforeTest();
		homePage.clickLibraryTab();
		libraryLandingPage.clickLanguageButton();
		libraryLandingPage.clickItalian();
	}
	
	@Test
	public void testLanguageSelectFrench() throws Throwable {
		beforeTest();
		homePage.clickLibraryTab();
		libraryLandingPage.clickLanguageButton();
		libraryLandingPage.clickFrench();
	}
	
	@Test
	public void testLanguageSelectSpanish() throws Throwable {
		beforeTest();
		homePage.clickLibraryTab();
		libraryLandingPage.clickLanguageButton();
		libraryLandingPage.clickSpanish();
	}
	
	@Test
	public void testLanguageSelectMandarin() throws Throwable {
		beforeTest();
		homePage.clickLibraryTab();
		libraryLandingPage.clickLanguageButton();
		libraryLandingPage.clickMandarin();
	}
}