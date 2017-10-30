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


public class _0204_01_RegisteredModeGroupsTests extends TestBase {

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
		onboardingPage.loginAccount("qa@insight.co", "Test123456");
	}
	
	@Test
	public void testGroupsLandingElements() throws Throwable {
		beforeTest();
		groupsPage.clickTabGroups();
		groupsPage.verifyCommunityGuidelines();
	}

}