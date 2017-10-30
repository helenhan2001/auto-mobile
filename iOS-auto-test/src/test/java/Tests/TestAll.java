package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.DiscoveryInterestGroupsPage;
import Pages.GuestModePage;
import Pages.HomePage;
import Pages.LibraryExplorePage;
import Pages.LibrarySearchPage;
import Pages.LoginPage;
import Pages.MyLibraryPage;
import Pages.SecondLanguagePage;
import Pages.TimerPage;

public class TestAll extends TestBase {

	HomePage homePage;
	LibraryExplorePage libraryPage;
	GuestModePage guestPage;
	LibrarySearchPage librarySearchPage;
	SecondLanguagePage secondLanguagePage;
	LibraryExplorePage libraryExplorePage;
	DiscoveryInterestGroupsPage discoveryInterestGroupsPage;
	LoginPage loginPage;
	MyLibraryPage myLibraryPage;
	TimerPage timerPage;
    
	@BeforeTest(alwaysRun = true)
	@Override
	public void setUpPage() throws Throwable {
		libraryPage = new LibraryExplorePage(driver);
		librarySearchPage = new LibrarySearchPage(driver);
		libraryExplorePage = new LibraryExplorePage(driver);
		secondLanguagePage = new SecondLanguagePage(driver);
		discoveryInterestGroupsPage = new DiscoveryInterestGroupsPage(driver);
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		timerPage = new TimerPage(driver);
		myLibraryPage = new MyLibraryPage(driver);
		 
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
       takeScreenshot("After TestAll");
	}

	@Test 
	public void testAll() throws Throwable {

		tryLogin();

		// Library Home page
		libraryExplorePage.clickTabGuided();

		assertVisibleWithTimer(libraryExplorePage.explore, "Explore not display correct");
		assertVisibleWithTimer(libraryExplorePage.popular, "popularnot display correct");
		assertVisibleWithTimer(libraryExplorePage.guidedMeditations, "guidedMeditations not display correct");
		assertVisibleWithTimer(libraryExplorePage.music, "music not display correct");
		assertVisibleWithTimer(libraryExplorePage.Day365list, "Day 365 list not display correct");
		assertVisibleWithTimer(libraryExplorePage.talks, "Talks not display correct");
		assertVisibleWithTimer(libraryExplorePage.teachers, "Teachers not display correct");

		// Click MY library
		libraryExplorePage.clickMyLIBRARY();
		assertVisibleWithTimer(libraryExplorePage.myLibrary, "my library not display correct");
		assertVisibleWithTimer(libraryExplorePage.myBookmarks, "my bookmarks not display correct");
		assertVisibleWithTimer(libraryExplorePage.myTeachers, "my teachers not display correct");
		assertVisibleWithTimer(libraryExplorePage.myTopics, "my Topics not display correct");

		// Check My BookMarks
		libraryExplorePage.clickMyBookmarks();
		assertVisibleWithTimer(myLibraryPage.myBookmarksOne, "my myBookmarksOne not display correct");
		assertVisibleWithTimer(myLibraryPage.myBookmarksTwo, "my myBookmarksTwo not display correct");
		// assertVisibleWithTimer(myLibraryPage.myBookmarksThree, "my
		// myBookmarksThree not display correct");
		assertVisibleWithTimer(myLibraryPage.myBookmarksFour, "my myBookmarksFour not display correct");
		// assertVisibleWithTimer(myLibraryPage.myBookmarksFive, "my
		// myBookmarksFive not display correct");

		// Check My Topics
		libraryExplorePage.clickTabGuided();
		libraryExplorePage.clickMyLIBRARY();
		libraryExplorePage.clickMyTopics();
		assertVisibleWithTimer(myLibraryPage.myInterestsOne, "my myInterestsOne not display correct");
		assertVisibleWithTimer(myLibraryPage.myInterestsTwo, "my myInterestsTwo not display correct");
		assertVisibleWithTimer(myLibraryPage.myInterestsFour, "my myInterestsFour not display correct");
		assertVisibleWithTimer(myLibraryPage.myInterestsFive, "my myInterestsFive not display correct");

		// check Teachers
		libraryExplorePage.clickTabGuided();
		libraryExplorePage.clickMyLIBRARY();
		libraryExplorePage.clickMyTeachers();
		assertVisibleWithTimer(myLibraryPage.teacherNameOne, "my teacherNameOne not display correct");
		assertVisibleWithTimer(myLibraryPage.teacherNameTwo, "my teacherNameTwo not display correct");
		assertVisibleWithTimer(myLibraryPage.teacherNameThree, "my teacherNameThree not display correct");
		assertVisibleWithTimer(myLibraryPage.teacherNameFour, "my teacherNameFour not display correct");
		assertVisibleWithTimer(myLibraryPage.teacherNameFive, "my teacherNameFive not display correct");

		// Follow Teacher
		libraryExplorePage.clickTabGuided();
		libraryExplorePage.sendkeySearchBtn("HeatherSundberg");
		// librarySearchPage.fillSearchTextField("HeatherSundberg");
		myLibraryPage.clickSearchTeacherName();
		libraryExplorePage.clickFollow();
		libraryExplorePage.clickFollowing();
		myLibraryPage.clickTeacherFollowButton();
		libraryExplorePage.clickFollowLowCase();
		libraryExplorePage.clickFollowing();

		// Follow Interest
		libraryExplorePage.clickTabGuided();

		libraryExplorePage.sendkeySearchBtn("mindfulness");
		libraryExplorePage.clickSecularMindfulness();
		libraryExplorePage.clickFollow();
		libraryExplorePage.clickFollowing();

		// Go back English, check search

		libraryExplorePage.clickTabGuided();
		// libraryExplorePage.clickSearchBtn();
		libraryExplorePage.sendkeySearchBtn("sleep");

		discoveryInterestGroupsPage.clickSleepNow();
		discoveryInterestGroupsPage.clickFilterAll();
		myLibraryPage.clickFilterBtn();
		myLibraryPage.clickTenMins();
		myLibraryPage.clickSubmitBtn();
		// librarySearchPage.clickMOSTPlayed();

		assertVisibleWithTimer(librarySearchPage.sleepNow, "sleepNow is not dipslay correctly");
		assertVisibleWithTimer(librarySearchPage.tenMinsSleepOne, "tenMinsSleepOne is not display correctly");

		// Second Language Dansk
		libraryExplorePage.clickTabGuided();
		secondLanguagePage.clickLanguageSelectorButton();
		secondLanguagePage.clickDansk();
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

		// Second Language Indonesian
		secondLanguagePage.clickLanguageSelectorButton();
		secondLanguagePage.clickIndonesian();

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

		// Second Language Deutsch
		secondLanguagePage.clickLanguageSelectorButton();
		secondLanguagePage.clickDeutsch();

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

		// Select see all in Chinese

		secondLanguagePage.clickLanguageSelectorButton();
		secondLanguagePage.clickChinese();
		assertVisibleWithTimer(secondLanguagePage.chineseExplore, "ChineseExplore is not display correct");
		assertVisibleWithTimer(secondLanguagePage.newChinese, "newChinese is not display correct");
		// secondLanguagePage.clickSeeAllChinese();
		// librarySearchPage.clickMOSTPlayed();
		// librarySearchPage.clickLongToShort();
		// assertVisibleWithTimer(secondLanguagePage.chineseLongerGMOne,
		// "chineseLongerGMOne not display correct");
		// secondLanguagePage.clickLanguageSelectorButton();
		// secondLanguagePage.clickEnglish();

		// Timer

		timerPage.clickTimerBtn();
		timerPage.clickTimerTitle();
		assertVisibleWithTimer(timerPage.ambientSound, "ambientSound is not display correct");
		timerPage.clickAmbientSound();
		timerPage.clickBackButton();
		assertVisibleWithTimer(timerPage.endingbell, "endingbell  is not display correct");
		timerPage.clickEndingbell();
		timerPage.clickBackButton();
		assertVisibleWithTimer(timerPage.intervalbells, "intervalbells is not display correct");
		timerPage.clickIntervalbells();
		timerPage.clickBackButton();
		assertVisibleWithTimer(timerPage.duration, "duration is not display correct");
		timerPage.clickDuration();
		assertVisibleWithTimer(timerPage.meditation, "meditation  is not display correct");
		// assertVisibleWithTimer(timerPage.durationInfiniteButton,
		// "durationInfiniteButton is not display correct");
		timerPage.clickBackButton();

		timerPage.clickTimerStart();
		Thread.sleep(5000); // this sleep for perform timer running
		timerPage.clickPlayPauseButton();
		timerPage.clickFinishEarlyTwo();
		timerPage.clickFinishMeditation();
		timerPage.clickDoneButton();

		timerPage.clickTimerPresets();
		assertVisibleWithTimer(timerPage.timerPresets, "timerPresets is not display correct");
		timerPage.clickTimerCloseButton();

		// Test Home page,

		homePage.clickTabNow();

		assertEnabledWithTimer(homePage.map, "map is not display correctly");
		assertEnabledWithTimer(homePage.logo, "logo is not display  correctly");
		assertEnabledWithTimer(homePage.addFriend, "addFriend is not display correctly");
		assertEnabledWithTimer(homePage.meditationToday, "meditationToday is not display correctly");
		assertEnabledWithTimer(homePage.meditationNow, "meditationNow is not display correctly");

		// Logout
		tryLogoutApp();
	}

}
