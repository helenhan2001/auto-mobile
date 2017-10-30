package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.DiscoveryInterestGroupsPage;
import Pages.GuestModePage;
import Pages.LibraryExplorePage;
import Pages.LibrarySearchPage;
import Pages.LoginPage;
import Pages.SecondLanguagePage;
import Pages.TimerPage;

public class TestTimerPage extends TestBase {

	TimerPage timerPage;
	LibraryExplorePage libraryPage;
	GuestModePage guestPage;
	LibrarySearchPage librarySearchPage;
	SecondLanguagePage secondLanguagePage;
	LibraryExplorePage libraryExplorePage;
	DiscoveryInterestGroupsPage discoveryInterestGroupsPage;
	LoginPage loginPage;

	@BeforeTest(alwaysRun = true)
	@Override
	public void setUpPage() throws Throwable {
		libraryPage = new LibraryExplorePage(driver);
		librarySearchPage = new LibrarySearchPage(driver);
		libraryExplorePage = new LibraryExplorePage(driver);
		secondLanguagePage = new SecondLanguagePage(driver);
		discoveryInterestGroupsPage = new DiscoveryInterestGroupsPage(driver);
		loginPage = new LoginPage(driver);
		timerPage = new TimerPage(driver);

	}

	@BeforeClass(alwaysRun = true)
	@Override
	public void navigateTo() throws InterruptedException {
		 
	}

	@BeforeMethod(alwaysRun = true)

	public void BeforeTestMethod() throws Throwable {
		
	}

	@AfterMethod

	public void AfterTestMethod() throws InterruptedException {
		 

	}

	@Test (groups = { "Smoke" })
	public void testTimerAmbientSound() throws Throwable {

		timerPage.clickTimerBtn();
		assertVisibleWithTimer(timerPage.ambientSound, "ambientSound  is not display correct");
		timerPage.clickAmbientSound();
		
		timerPage.clickBackButton();
		timerPage.clickTimerTitle();
		timerPage.clickTimerCloseButton();
	}

	@Test(groups = { "Smoke" })
	public void testTimerEndingbell() throws Throwable {

		timerPage.clickTimerBtn();
		timerPage.clickTimerTitle();
		assertVisibleWithTimer(timerPage.endingbell, "endingbell  is not display correct");
		timerPage.clickEndingbell();
		timerPage.clickBackButton();
		
		timerPage.clickTimerCloseButton();
	}

	@Test(groups = { "Smoke" })
	public void testTimerStart() throws Throwable {

		timerPage.clickTimerBtn();

		timerPage.clickTimerTitle();
		assertVisibleWithTimer(timerPage.timerStart, "Timer start is not display correct");
		timerPage.clickTimerStart();
		Thread.sleep(5000);

		timerPage.clickPlayPauseButton();

		timerPage.clickFinishEarlyTwo();
		timerPage.clickFinishMeditation();
		Thread.sleep(2000);
		timerPage.clickDoneButton();
		timerPage.clickTimerCloseButton();

		 
	}

	@Test(groups = { "Smoke" })
	public void testTimerIntervalbells() throws Throwable {

		timerPage.clickTimerBtn();
		timerPage.clickTimerTitle();
		assertVisibleWithTimer(timerPage.intervalbells, "intervalbells is not display correct");
		timerPage.clickIntervalbells();
		timerPage.clickBackButton();
		
		timerPage.clickTimerCloseButton();
	}

	@Test(groups = { "Smoke" })
	public void testTimerDuration() throws Throwable {

		timerPage.clickTimerBtn();
		timerPage.clickTimerTitle();
		assertVisibleWithTimer(timerPage.duration, "duration is not display correct");
		timerPage.clickDuration();
		assertVisibleWithTimer(timerPage.meditation, "meditation  is not display correct");
		assertVisibleWithTimer(timerPage.durationInfiniteButton, "durationInfiniteButton  is not display correct");
		timerPage.clickBackButton();
		
		
		timerPage.clickTimerCloseButton();
	}

	@Test(groups = { "Smoke" } )
	public void testTimerPresets() throws Throwable {

		timerPage.clickTimerBtn();
		timerPage.clickTimerPresets();
		assertVisibleWithTimer(timerPage.timerPresets, "timerPresets  is not display correct");
		timerPage.clickTimerCloseButton();
	}

	@Test 
	public void testTimerSecondUser() throws Throwable {

		timerPage.clickTimerBtn();

		Thread.sleep(2000);
		timerPage.clickTimerTitle();
		timerPage.clickTimerStart();
		Thread.sleep(5000);

		timerPage.clickPlayPauseButton();

		timerPage.clickFinishEarlyTwo();
		timerPage.clickFinishMeditation();
		Thread.sleep(5000);
		timerPage.clickDoneButton();
		Thread.sleep(3000);

		timerPage.clickTimerCloseButton();
		
		loginPage.LogoutApp();
		loginPage.LoginAppUserTwo();
		assertDisplayedWithTimer(timerPage.homeMeditaionMsg, "Helen homeMeditaionMsg is not display correct");

	}

}
