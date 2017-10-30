package Tests;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.HomeScreenPage;
import Pages.OnboardingPage;
import Pages.ProfilePage;
import Pages.SettingsPage;
import Pages.TimerPage;


public class _0205_01_RegisteredModeProfileSettingsTests extends TestBase {

	HomePage homePage;
	ProfilePage profilePage;
	TimerPage timerPage;
	SettingsPage settingsPage;
	OnboardingPage onboardingPage;
	HomeScreenPage homeScreenPage;

	@BeforeTest
	@Override
	public void setUpPage() {
		homePage = new HomePage(driver);
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
		onboardingPage.loginAccount("qa@insight.co", "Test123456");
	}
	
	@Test
	public void testQualityAssuranceElement() throws Throwable {
		beforeTest();
		profilePage.clickTabProfile();
		profilePage.verifyQualityAssurance();
	}
	
	@Test
	public void testEditProfileAndPrivacyBtn() throws Throwable {
		beforeTest();
		profilePage.clickTabProfile();
		profilePage.verifyEditProfileAndPrivacyBtn();
	}
	
	@Test
	public void testStatsTab() throws Throwable {
		beforeTest();
		profilePage.clickTabProfile();
		profilePage.verifyStatsTab();
	}
	
	@Test
	public void testActivityTab() throws Throwable {
		beforeTest();
		profilePage.clickTabProfile();
		profilePage.verifyActivityTab();
	}
	
	@Test
	public void testConsecutiveDays() throws Throwable {
		beforeTest();
		profilePage.clickTabProfile();
		profilePage.verifyConsecutiveDays();
	}
	
	@Test
	public void testSeeDetailedChartsAndStats() throws Throwable {
		beforeTest();
		profilePage.clickTabProfile();
		profilePage.verifySeeDetailedChartsAndStats();
	}
	
	@Test
	public void testDaysWeeksMonthsAllTime() throws Throwable {
		beforeTest();
		profilePage.clickTabProfile();
		profilePage.verifyDaysWeeksMonthsAllTime();
	}
	
	@Test
	public void test365DaysTogether() throws Throwable {
		beforeTest();
		profilePage.clickTabProfile();
		profilePage.verify365DaysTogether();
	}
	
	@Test
	public void testMilestonesAchieved() throws Throwable {
		beforeTest();
		profilePage.clickTabProfile();
		profilePage.verifyMilestonesAchieved();
	}
	
	@Test
	public void testDaysWithAtLeastOneSession() throws Throwable {
		beforeTest();
		profilePage.clickTabProfile();
		swipeToUp();
		profilePage.verifyDaysWithAtLeastOneSession();
		profilePage.verifyProfileFaq();
	}
	
	@Test
	public void verifyProfileFaq() throws Throwable {
		beforeTest();
		profilePage.clickTabProfile();
		swipeToUp();
		profilePage.verifyProfileFaq();
	}
}