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


public class _0102_02_GuestModeMeditationPageLibraryTests extends TestBase {

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
		homePage.clickLibraryTab();
		swipeToUp();
		libraryLandingPage.clickMeditationTitle();
		//libraryLandingPage.clickSearchFieldForMeditations();		
		//librarySearchPage.searchYogaNidraForSleep();
	}
	
	@Test
	public _0102_02_GuestModeMeditationPageLibraryTests() throws Throwable {	
		_01_testMeditationTeacherElement();
		_02_testBookmarkMeditation();
		_03_testShareElements();
		_04_testListenPrivately();
		_05_testPlayMeditationFinishEarly();
		_06_testMeditationTags();
	}
	
	public void _01_testMeditationTeacherElement() throws Throwable {	
		beforeTest();
		libraryMeditationPage.verifyMeditationPage();
		libraryMeditationPage.verifyTeacherName();
	}
	
	public void _02_testBookmarkMeditation() throws Throwable {	
		beforeTest();
		libraryMeditationPage.clickBookmarkBtn();
		onboardingPage.verifyLoginWelcomeBtn();
	}
	
	public void _03_testShareElements() throws Throwable {	
		beforeTest();
		libraryMeditationPage.clickShareBtn();
	}
	
	public void _04_testListenPrivately() throws Throwable {	
		beforeTest();
		libraryMeditationPage.clickDots();
		libraryMeditationPage.verifyListenPrivately();
		libraryMeditationPage.clickCheckBox();
		onboardingPage.verifyLoginWelcomeBtn();
	}

	public void _05_testPlayMeditationFinishEarly() throws Throwable {
		beforeTest();
		swipeToUpSmall();
		libraryMeditationPage.clickPlayImage();
		onboardingPage.verifyLoginWelcomeBtn();
	}

	public void _06_testMeditationTags() throws Throwable {
		beforeTest();
		libraryMeditationPage.verifyMeditationPage();
		swipeToUp();
		libraryMeditationPage.verifyMeditationTagsElement();
	}	
}