package Tests;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.OnboardingPage;
import Pages.TimerPage;

public class _0203_01_RegisteredModeTestTimerPage extends TestBase {
	
	TimerPage timerPage;
	HomePage homePage;
	OnboardingPage onboardingPage;

	@BeforeTest
	@Override
	public void setUpPage() {
		timerPage = new TimerPage(driver);
		homePage = new HomePage(driver);
		onboardingPage = new OnboardingPage(driver);
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
		onboardingPage.clickLoginWelcomeBtn();
		homePage.email();
		homePage.password();
		homePage.clickLogin();
	}

	@Test (priority = 1)
	public void testTimerElements() throws Throwable {
		beforeTest();
		timerPage.clickTabTimer();
		timerPage.verifyTimerBell();
		timerPage.verifyTimerConfig();
		timerPage.verifyTimerhelp();
		timerPage.verifyTimerIcon();
		timerPage.verifyTimerLable();
		timerPage.verifyTimerPresets();
	}

	@Test (priority = 2)
	public void testTimerContainer() throws Throwable {
		timerPage.clickDurationcContainer();
		timerPage.clickToolBarBack();
		timerPage.clickBellContainer();
		timerPage.clickToolBarBack();
		timerPage.clickSoundContainer();
		timerPage.verifyToolBarTitle();
		//incorrect implementation of tester class here
		driver.findElementsById("com.spotlightsix.zentimerlite2:id/ambient_image").get(3).click();
		timerPage.clickSaveBtn();
		timerPage.clickEndBellContainer();
		Thread.sleep(2000);
		timerPage.clickToolBarBack();
	}

	@Test (priority = 3)
	public void testTimerStart() throws Throwable {
		timerPage.clickStart();
		Thread.sleep(5000);
		timerPage.verifyCountDown();
		timerPage.verifyMeditationText();
	}

	@Test (priority = 4)
	public void testTimerPause() throws Throwable {
		timerPage.clickPlayPause();
		timerPage.verifyCountDown();
		timerPage.verifyMeditationText();
	}

	@Test (priority = 5)
	public void testFinishEarly() throws Throwable {
		timerPage.clickFinishEarly();
		timerPage.verifyCompleteText();
		timerPage.verifyTimeElapsed();
	}

	@Test (priority = 6)
	public void testTimerDone() throws Throwable {
		timerPage.clickDoneBtn();
		timerPage.verifyImage();
		timerPage.verifySupplement();
	}

	@Test (priority = 7)
	public void testThanksPeople() throws Throwable {
		//screen stucks here on loading
		timerPage.clickPeople();
		timerPage.clickThanksPeopleBtn();	
		timerPage.clickExitThanksPeople();
		timerPage.verifyCount();
		timerPage.verifySupplement();
	}

	@Test (priority = 8)
	public void testDoneTimer() throws Throwable {
		timerPage.clickTimerDone();
		timerPage.verifyTimerBell();
		timerPage.verifyTimerConfig();
		timerPage.verifyTimerhelp();
		timerPage.verifyTimerIcon();
		timerPage.verifyTimerLable();
		timerPage.verifyTimerPresets();
	}
}
