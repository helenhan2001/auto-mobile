package Tests;

import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.DiscoveryInterestGroupsPage;
import Pages.GuestModePage;
import Pages.LibraryExplorePage;
import Pages.LibrarySearchPage;
import Pages.MyLibraryPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;

public class TestLibrarySearchFilterSortPage extends TestBase {

	LibraryExplorePage libraryPage;
	GuestModePage guestPage;
	LibrarySearchPage librarySearchPage;
	MyLibraryPage myLibraryPage;
	LibraryExplorePage libraryExplorePage;
	DiscoveryInterestGroupsPage discoveryInterestGroupsPage;

	@BeforeTest(alwaysRun = true)
	@Override
	public void setUpPage() throws Throwable {
		libraryPage = new LibraryExplorePage(driver);
		librarySearchPage = new LibrarySearchPage(driver);
		libraryExplorePage = new LibraryExplorePage(driver);
		myLibraryPage = new MyLibraryPage(driver);
		discoveryInterestGroupsPage = new DiscoveryInterestGroupsPage(driver);
	}

	@BeforeClass(alwaysRun = true)
	@Override
	public void navigateTo() throws InterruptedException {

	}

	@BeforeMethod(alwaysRun = true)

	public void BeforeTestMethod() throws Throwable {
		 
	}

	@AfterMethod(alwaysRun = true)

	public void AfterTestMethod() throws InterruptedException {
		  
	}


	
	@Test(groups = { "regression" })
	public void testFilterSortingFiveMins() throws Throwable {
		libraryExplorePage.clickTabGuided();

		libraryExplorePage.sendkeySearchBtn("sleep");

		discoveryInterestGroupsPage.clickSleepNow();

		discoveryInterestGroupsPage.clickFilterAll();
		 
		myLibraryPage.clickFilterBtn();

		myLibraryPage.clickFiveMins();

		myLibraryPage.clickSubmitBtn();
		 
		librarySearchPage.clickMOSTPlayed();
		librarySearchPage.clickLongToShort();

		assertVisibleWithTimer(librarySearchPage.sleepNow, "sleepNow is not sdipslay correctly");
assertVisibleWithTimer(librarySearchPage.fiveMinsSleepOne, "fiveMinsSleepOne is not sdipslay correctly");

	}

	@Test(groups = { "regression" })
	public void testFilterSortingTenMins() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.sendkeySearchBtn("sleep");

		discoveryInterestGroupsPage.clickSleepNow();

		discoveryInterestGroupsPage.clickFilterAll();
		 
		myLibraryPage.clickFilterBtn();

		myLibraryPage.clickTenMins();

		myLibraryPage.clickSubmitBtn();
		 
		librarySearchPage.clickMOSTPlayed();
		librarySearchPage.clickLongToShort();


		assertVisibleWithTimer(librarySearchPage.sleepNow, "sleepNow is not sdipslay correctly");
		assertVisibleWithTimer(librarySearchPage.tenMinsSleepOne, "tenMinsSleepOne is not sdipslay correctly");

	}

	@Test(groups = { "regression" })
	public void testFilterSortingFifteenMins() throws Throwable {

		libraryExplorePage.clickTabGuided();
		libraryExplorePage.sendkeySearchBtn("sleep");

		discoveryInterestGroupsPage.clickSleepNow();

		discoveryInterestGroupsPage.clickFilterAll();

		 
		myLibraryPage.clickFilterBtn();

		myLibraryPage.clickFifteenMins();

		myLibraryPage.clickSubmitBtn();
		 
		assertVisibleWithTimer(librarySearchPage.sleepNow, "sleepNow is not sdipslay correctly");
	//	assertVisibleWithTimer(librarySearchPage.fifteenMinsSleepOne, "fifteenMinsSleepOne is not dipslay correctly");

	}

	@Test(groups = { "regression" })
	public void testFilterSortingTwentyMins() throws Throwable {

		libraryExplorePage.clickTabGuided();
		libraryExplorePage.sendkeySearchBtn("sleep");

		discoveryInterestGroupsPage.clickSleepNow();

		discoveryInterestGroupsPage.clickFilterAll();
 
		myLibraryPage.clickFilterBtn();

		myLibraryPage.clickTwentyMins();

		myLibraryPage.clickSubmitBtn();
		 

		assertVisibleWithTimer(librarySearchPage.sleepNow, "sleepNow is not sdipslay correctly");
	//	assertVisibleWithTimer(librarySearchPage.twentyMinsSleepOne, "twentyMinsSleepOne is not dipslay correctly");

	}

	@Test(groups = { "regression" })
	public void testFilterSortingThirtyMins() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.sendkeySearchBtn("sleep");

		discoveryInterestGroupsPage.clickSleepNow();

		discoveryInterestGroupsPage.clickFilterAll();
 
		myLibraryPage.clickFilterBtn();

		myLibraryPage.clickThirtyMins();

		myLibraryPage.clickSubmitBtn();
		 
//		librarySearchPage.clickMOSTPlayedTwo();
//		Thread.sleep(1000);
//		librarySearchPage.clickLongToShort();

		assertVisibleWithTimer(librarySearchPage.sleepNow, "sleepNow is not sdipslay correctly");
	//	assertVisibleWithTimer(librarySearchPage.thirtyMinsSleepOne, "thirtyMinsSleepOne is not sdipslay correctly");

	}

	@Test(groups = { "regression" })
	public void testFilterSortingThirtyPlusMins() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.sendkeySearchBtn("sleep");
		libraryExplorePage.sendkeySearchBtn("sleep");

		discoveryInterestGroupsPage.clickSleepNow();

		discoveryInterestGroupsPage.clickFilterAll();
		 
		myLibraryPage.clickFilterBtn();

		myLibraryPage.clickThirtyPlusMins();

		myLibraryPage.clickSubmitBtn();
		 
//		librarySearchPage.clickMOSTPlayed();
//		Thread.sleep(1000);
//		librarySearchPage.clickLongToShort();

		assertVisibleWithTimer(librarySearchPage.sleepNow, "sleepNow is not sdipslay correctly");
	//	assertVisibleWithTimer(librarySearchPage.thirtyPlusMinsSleepOne,
		//		"thirtyPlusMinsSleepOne is not sdipslay correctly");

	}

	@Test(groups = { "regression" })
	public void testFilterSortingMaleOnly() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.sendkeySearchBtn("sleep");

		discoveryInterestGroupsPage.clickSleepNow();

		discoveryInterestGroupsPage.clickFilterAll();

		 
		myLibraryPage.clickFilterBtn();

		List<IOSElement> Radios = driver.findElementsByAccessibilityId("icon option unselected");

		MobileElement maleOnly = Radios.get(0);

		maleOnly.click();

		// myLibraryPage.clickMaleOnly();

		myLibraryPage.clickSubmitBtn();
		 
//		librarySearchPage.clickMOSTPlayed();
//		Thread.sleep(1000);
//		librarySearchPage.clickLongToShort();

		assertVisibleWithTimer(librarySearchPage.sleepNow, "sleepNow is not sdipslay correctly");
	//	assertVisibleWithTimer(librarySearchPage.maleOnlyOne, "maleOnlyOne is not sdipslay correctly");

	}

	@Test(groups = { "regression" })
	public void testFilterSortingFamaleOnly() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.sendkeySearchBtn("sleep");

		discoveryInterestGroupsPage.clickSleepNow();

		discoveryInterestGroupsPage.clickFilterAll();
		 
		myLibraryPage.clickFilterBtn();

		List<IOSElement> Radios = driver.findElementsByAccessibilityId("icon option unselected");

		MobileElement femaleOnly = Radios.get(1);

		femaleOnly.click();

		// myLibraryPage.clickMaleOnly();

		myLibraryPage.clickSubmitBtn();
//		Thread.sleep(3000);
//		librarySearchPage.clickMOSTPlayed();
//		librarySearchPage.clickLongToShort();

		assertVisibleWithTimer(librarySearchPage.sleepNow, "sleepNow is not sdipslay correctly");
	//	assertVisibleWithTimer(librarySearchPage.femaleOnlyOne, "femaleOnlyOne is not sdipslay correctly");

	}

	@Test(groups = { "regression" })
	public void testFilterSortingWithBackMusic() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.sendkeySearchBtn("sleep");

		discoveryInterestGroupsPage.clickSleepNow();

		discoveryInterestGroupsPage.clickFilterAll();

		 
		myLibraryPage.clickFilterBtn();

		List<IOSElement> Radios = driver.findElementsByAccessibilityId("icon option unselected");

		MobileElement withBack = Radios.get(2);

		withBack.click();

		// myLibraryPage.clickMaleOnly();

		myLibraryPage.clickSubmitBtn();
		 
//		librarySearchPage.clickMOSTPlayed();
//		librarySearchPage.clickLongToShort();

		assertVisibleWithTimer(librarySearchPage.sleepNow, "sleepNow is not sdipslay correctly");
		// assertVisibleWithTimer(librarySearchPage.withBackMusicOne,
		// "withBackMusicOne is not sdipslay correctly");

	}

	@Test(groups = { "regression" })
	public void testFilterSortingWithoutBackMusic() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.sendkeySearchBtn("sleep");

		discoveryInterestGroupsPage.clickSleepNow();

		discoveryInterestGroupsPage.clickFilterAll();
		 
		myLibraryPage.clickFilterBtn();

		List<IOSElement> Radios = driver.findElementsByAccessibilityId("icon option unselected");

		MobileElement without = Radios.get(3);

		without.click();

		// myLibraryPage.clickMaleOnly();

		myLibraryPage.clickSubmitBtn();
		 
//		librarySearchPage.clickMOSTPlayed();
//		librarySearchPage.clickLongToShort();

		assertVisibleWithTimer(librarySearchPage.sleepNow, "sleepNow is not sdipslay correctly");
	//	assertVisibleWithTimer(librarySearchPage.withoutBackMusicOne, "withoutBackMusicOne is not sdipslay correctly");

	}

}
