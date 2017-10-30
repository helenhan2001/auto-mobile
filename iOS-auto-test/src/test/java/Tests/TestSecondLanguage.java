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

public class TestSecondLanguage extends TestBase {

	LibraryExplorePage libraryPage;
	GuestModePage guestPage;
	LibrarySearchPage librarySearchPage;
	SecondLanguagePage secondLanguagePage;
	LibraryExplorePage libraryExplorePage;
	DiscoveryInterestGroupsPage discoveryInterestGroupsPage;
	LoginPage loginPage;

	@BeforeTest
	@Override
	public void setUpPage() throws Throwable {
		libraryPage = new LibraryExplorePage(driver);
		librarySearchPage = new LibrarySearchPage(driver);
		libraryExplorePage = new LibraryExplorePage(driver);
		secondLanguagePage = new SecondLanguagePage(driver);
		discoveryInterestGroupsPage = new DiscoveryInterestGroupsPage(driver);
		loginPage = new LoginPage(driver);
	}

	@BeforeClass
	@Override
	public void navigateTo() throws InterruptedException {

	}

	@BeforeMethod

	public void BeforeTestMethod() throws Throwable {

	}

	@AfterMethod
	public void AfterTestMethod() throws InterruptedException {
	}

	@Test
	public void testAllSecondLanguage() throws Throwable {
		testSecondLanguageDeutsch();
		testSecondLanguageChinese();
	}

	public void testSecondLanguageDeutsch() throws Throwable {

		libraryExplorePage.clickTabGuided();

		Thread.sleep(2000);

		secondLanguagePage.clickLanguageSelectorButton();
		secondLanguagePage.clickDeutsch();
		Thread.sleep(2000);

		assertVisibleWithTimer(secondLanguagePage.entdecken, "Entdecken not display correct");
		assertVisibleWithTimer(secondLanguagePage.myBookmarkForDeutsch,
				"myBookmarkForDeutsch translate is not display correct");
		assertVisibleWithTimer(secondLanguagePage.myInterestForDeutsch,
				"myInterestForDeutsch translate is not display correct");
		assertVisibleWithTimer(secondLanguagePage.myTeacherForDeutsch,
				"myTeacherForDeutsch translate is not display correct");
		assertVisibleWithTimer(secondLanguagePage.seeAllForDeutsch,
				"seeAllForDeutsch translate is not display correct");

		secondLanguagePage.clickLanguageSelectorButton();

		secondLanguagePage.clickEnglish();
	}

	@Test(priority = 1)
	public void testSecondLanguageChinese() throws Throwable {

		libraryExplorePage.clickTabGuided();

		secondLanguagePage.clickLanguageSelectorButton();

		secondLanguagePage.clickChinese();
		Thread.sleep(2000);
		assertVisibleWithTimer(secondLanguagePage.chineseExplore, "ChineseExplore not display correct");

		secondLanguagePage.clickLanguageSelectorButton();

		secondLanguagePage.clickEnglish();

	}

	@Test(priority = 2)
	public void testSecondLanguageChineseSeeAll() throws Throwable {

		libraryExplorePage.clickTabGuided();

		secondLanguagePage.clickLanguageSelectorButton();

		secondLanguagePage.clickChinese();
		Thread.sleep(2000);

		assertVisibleWithTimer(secondLanguagePage.chineseExplore, "ChineseExplore not display correct");
		swipeToUp(1000);

		secondLanguagePage.clickSeeAllChinese();
		librarySearchPage.clickMOSTPlayed();
		librarySearchPage.clickLongToShort();
		Thread.sleep(2000);

		assertVisibleWithTimer(secondLanguagePage.chineseLongerGMOne, "chineseLongerGMOne not display correct");

		// assertVisibleWithTimer(secondLanguagePage.chineseLongerGMTwo,
		// "chineseLongerGMTwo not display correct");

		secondLanguagePage.clickLanguageSelectorButton();

		secondLanguagePage.clickEnglish();

	}

	@Test(priority = 3)
	public void testSecondLanguageDansk() throws Throwable {

		libraryExplorePage.clickTabGuided();

		secondLanguagePage.clickLanguageSelectorButton();

		secondLanguagePage.clickDansk();
		Thread.sleep(2000);
		assertVisibleWithTimer(secondLanguagePage.opdage, "DanskExplore not display correct");
		assertVisibleWithTimer(secondLanguagePage.myBookmarkForDansk,
				"myBookmarkForDansk translate is not display correct");
		assertVisibleWithTimer(secondLanguagePage.myTeacherForDansk,
				"myTeacherForDansk translate is not display correct");
		assertVisibleWithTimer(secondLanguagePage.myInterestForDansk,
				"myInterestForDansk translate  is not display correct");
		assertVisibleWithTimer(secondLanguagePage.seeAllForDansk, "seeAllForDansk translate is not display correct");

		secondLanguagePage.clickLanguageSelectorButton();

		secondLanguagePage.clickEnglish();

	}

	@Test(priority = 4)
	public void testSecondLanguageIndonesian() throws Throwable {

		libraryExplorePage.clickTabGuided();

		secondLanguagePage.clickLanguageSelectorButton();

		secondLanguagePage.clickIndonesian();
		Thread.sleep(2000);
		assertVisibleWithTimer(secondLanguagePage.indonesianExplore, "indonesianExplore not display correct");
		assertVisibleWithTimer(secondLanguagePage.myBookmarkForIndonesian,
				"myBookmarkForIndonesian translate is not display correct");
		assertVisibleWithTimer(secondLanguagePage.myInterestForIndonesian,
				"myInterestForIndonesian translate is not display correct");
		assertVisibleWithTimer(secondLanguagePage.myTeacherForIndonesian,
				"myTeacherForIndonesian translateis not display correct");
		assertVisibleWithTimer(secondLanguagePage.seeAllForIndonesian,
				"seeAllForIndonesian translate  is not display correct");

		secondLanguagePage.clickLanguageSelectorButton();

		secondLanguagePage.clickEnglish();

	}
	// @Test(priority = 1)
	// public void testSecondLanguageChinese() throws Throwable {
	//
	// libraryExplorePage.clickTabGuided();
	//
	// Thread.sleep(2000);
	//
	// secondLanguagePage.clickEnglish();
	// secondLanguagePage.clickChinese();
	// Thread.sleep(2000);
	//
	// assertVisibleWithTimer(secondLanguagePage.chineseExplore, "exist
	// ChineseExplore not display correct");
	//
	// }
	//
	// @Test(priority = 2)
	// public void testSecondLanguageDansk() throws Throwable {
	// loginPage.LogoutApp();
	// loginPage.LoginApp();
	//
	// libraryExplorePage.clickTabGuided();
	//
	// Thread.sleep(2000);
	//
	// secondLanguagePage.clickEnglish();
	// secondLanguagePage.clickDansk();
	// Thread.sleep(2000);
	//
	// assertVisibleWithTimer(secondLanguagePage.deutsch, "exist DanskExplore
	// not display correct");
	//
	// }

}
