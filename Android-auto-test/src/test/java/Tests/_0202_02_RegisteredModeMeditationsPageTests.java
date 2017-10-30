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


public class _0202_02_RegisteredModeMeditationsPageTests extends TestBase {

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
		homePage.clickLibraryTab();
		swipeToUp();
		libraryLandingPage.clickMeditationTitle();
//		libraryLandingPage.verifyLibraryTitleElement();
//		libraryLandingPage.clickSearchFieldForMeditations();		
//		librarySearchPage.setSearchEditTextField("yoga nidra for sleep");
//		hideKeyboard();
//		librarySearchPage.verifyYogaNidraForSleepMeditationText();
//		librarySearchPage.clickYogaNidraForSleepMeditationText();
//		libraryMeditationPage.verifyImageViewGuided();
	}
	
	@Test
	public void testMeditationElementsYogaForSleep() throws Throwable {	
		beforeTest();
		libraryMeditationPage.verifyMeditationPage();
	}
	
	@Test
	public void testBookmarkMeditation() throws Throwable {	
		beforeTest();
		libraryMeditationPage.clickBookmarkBtn();	
	}
	
	@Test
	public void testShareElements() throws Throwable {	
		beforeTest();
		libraryMeditationPage.clickShareBtn();
	}

	@Test
	public void testPlayMeditationFinishEarly() throws Throwable {
		beforeTest();
		libraryMeditationPage.clickMeditationImageBig();
		playerPage.finishMeditationEarly();
	}
	
	@Test
	public void testPlayMeditationFinishEarlyDontLog() throws Throwable {
		beforeTest();
		swipeToUpSmall();
		libraryMeditationPage.clickMeditationImageBig();
		Thread.sleep(10000);
		playerPage.clickPlayPauseBtn();
		playerPage.verifyFinishEarly();
		playerPage.clickFinishEarly();
		playerPage.clickDontLog();
	}

}