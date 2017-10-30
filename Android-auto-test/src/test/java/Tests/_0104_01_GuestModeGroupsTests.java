package Tests;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.GroupsPage;
import Pages.HomePage;
import Pages.HomeScreenPage;
import Pages.OnboardingPage;


public class _0104_01_GuestModeGroupsTests extends TestBase {

	HomePage homePage;
	GroupsPage groupsPage;
	OnboardingPage onboardingPage;
	HomeScreenPage homeScreenPage;

	@BeforeTest
	@Override
	public void setUpPage() {
		homePage = new HomePage(driver);
		groupsPage = new GroupsPage(driver);
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
		resetApp();
		homePage.clickSkip();
		onboardingPage.clickAFewMonthsOrMore();
		homeScreenPage.verifyIfUserIsOnHomeScreen();
	}
	
	@Test
	public void testGroupsGuestSignIn() throws Throwable {
		beforeTest();
		groupsPage.clickTabGroups();
		homePage.clickGuestModeSignInButton();
		homeScreenPage.clickSkip();
		homePage.verifyGuestModeSignInButton();
		//add verify text
	}

}