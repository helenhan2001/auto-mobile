package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.DiscoveryInterestGroupsPage;
import Pages.LibraryExplorePage;
import Pages.LibrarySearchPage;
import Pages.LoginPage;
import Pages.MyLibraryPage;
import Pages.TimerPage;

public class TestMyLibraryPage extends TestBase {

	LibraryExplorePage libraryExplorePage;
	MyLibraryPage myLibraryPage;
	LibrarySearchPage librarySearchPage;
	TimerPage timerPage;
	LoginPage loginPage;
	DiscoveryInterestGroupsPage discoveryInterestGroupsPage;

	@BeforeTest(alwaysRun = true)
	@Override
	public void setUpPage() throws Throwable {
		libraryExplorePage = new LibraryExplorePage(driver);
		myLibraryPage = new MyLibraryPage(driver);
		timerPage = new TimerPage(driver);
		loginPage = new LoginPage(driver);
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

	@Test(groups = { "Smoke" })
	public void testLibraryHomePage() throws Throwable {

		libraryExplorePage.clickTabGuided();
		assertVisibleWithTimer(libraryExplorePage.explore, "Explore not display correct");

		assertVisibleWithTimer(libraryExplorePage.popular, "popularnot display correct");

		assertVisibleWithTimer(libraryExplorePage.guidedMeditations, "guidedMeditations not display correct");

		assertVisibleWithTimer(libraryExplorePage.music, "music not display correct");
		assertVisibleWithTimer(libraryExplorePage.Day365list, "Day 365 list not display correct");
		assertVisibleWithTimer(libraryExplorePage.talks, "Talks not display correct");
		assertVisibleWithTimer(libraryExplorePage.teachers, "Teachers not display correct");

	}

	@Test(groups = { "Smoke" })
	public void testMyLibraryPage() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.clickMyLIBRARY();

		assertVisibleWithTimer(libraryExplorePage.myLibrary, "my library not display correct");
		assertVisibleWithTimer(libraryExplorePage.myBookmarks, "my bookmarks not display correct");
		assertVisibleWithTimer(libraryExplorePage.myTeachers, "my teachers not display correct");
		assertVisibleWithTimer(libraryExplorePage.myTopics, "my Topics not display correct");
	}

	@Test(groups = { "Smoke" })
	public void testMyLibraryPopularFiveMins() throws Throwable {

		libraryExplorePage.clickTabGuided();
		libraryExplorePage.clickPopular();
		myLibraryPage.clickFiveMinsTwo();
		//
		// Thread.sleep(2000);
		// assertVisibleWithTimer(librarySearchPage.allFiles, "ALL Files is not
		// display correctly");
		//
	}

	@Test(groups = { "Smoke" })
	public void testMyLibraryPopularTenMins() throws Throwable {

		libraryExplorePage.clickTabGuided();
		libraryExplorePage.clickPopular();
		myLibraryPage.clickTenMinsTwo();

		// Thread.sleep(3000);
		// assertVisibleWithTimer(librarySearchPage.allFiles, "ALL Files is not
		// display correctly");
		//
	}

	@Test(priority = 4)
	public void testMyLibraryPopularFifteenMins() throws Throwable {

		libraryExplorePage.clickTabGuided();
		libraryExplorePage.clickPopular();
		myLibraryPage.clickFifteenMinsTwo();

		// Thread.sleep(3000);
		// assertVisibleWithTimer(librarySearchPage.allFiles, "ALL Files is not
		// display correctly");

	}

	@Test(priority = 5)
	public void testMyLibraryPopularTwentyMins() throws Throwable {

		libraryExplorePage.clickTabGuided();
		libraryExplorePage.clickPopular();
		myLibraryPage.clickTwentyMinsTwo();

		//
		// Thread.sleep(2000);
		// assertVisibleWithTimer(librarySearchPage.allFiles, "ALL Files is not
		// display correctly");
		//
	}

	@Test(priority = 6)
	public void testMyLibraryPopularThirtyMins() throws Throwable {

		libraryExplorePage.clickTabGuided();
		libraryExplorePage.clickPopular();
		myLibraryPage.clickThirtyMinsTwo();
		//
		// Thread.sleep(2000);
		// assertVisibleWithTimer(librarySearchPage.allFiles, "ALL Files is not
		// display correctly");
		//
	}

	@Test(priority = 7)
	public void testMyLibraryPopularThirtyPlusMins() throws Throwable {

		libraryExplorePage.clickTabGuided();
		libraryExplorePage.clickPopular();
		myLibraryPage.clickThirtyPlusMins();
		//
		// Thread.sleep(2000);
		// assertVisibleWithTimer(librarySearchPage.allFiles, "ALL Files is not
		// display correctly");
		//
	}

	@Test(groups = { "Smoke" })
	public void testTeacherFollow() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.sendkeySearchBtn("HeatherSundberg");

		// librarySearchPage.fillSearchTextField("HeatherSundberg");

		myLibraryPage.clickSearchTeacherName();

		libraryExplorePage.clickFollow();

		libraryExplorePage.clickFollowing();

		myLibraryPage.clickTeacherFollowButton();
		libraryExplorePage.clickFollowLowCase();
		libraryExplorePage.clickFollowing();

	}

	@Test(groups = { "Smoke" })
	public void testPlayGM() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.clickMyLIBRARY();
		myLibraryPage.clickMyBookmarksOne();
		myLibraryPage.clickPlayGMButton();

		Thread.sleep(5000);

		timerPage.clickPlayPauseButton();

		timerPage.clickFinishEarlyTwo();
		timerPage.clickFinishMeditation();
		Thread.sleep(3000);
		timerPage.clickDoneButton();
		Thread.sleep(1000);

		loginPage.LogoutApp();
		loginPage.LoginAppUserTwo();
		//assertDisplayedWithTimer(timerPage.homeMeditaionMsg, "Helen homeMeditaionMsg is not display correct");

	}

	@Test(groups = { "Smoke" })
	public void testMyBookMarksPage() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.clickMyLIBRARY();

		libraryExplorePage.clickMyBookmarks();

		assertVisibleWithTimer(myLibraryPage.myBookmarksOne, "my myBookmarksOne not display correct");
		assertVisibleWithTimer(myLibraryPage.myBookmarksTwo, "my myBookmarksTwo not display correct");
		//assertVisibleWithTimer(myLibraryPage.myBookmarksThree, "my myBookmarksThree not display correct");
		assertVisibleWithTimer(myLibraryPage.myBookmarksFour, "my myBookmarksFour not display correct");
		//assertVisibleWithTimer(myLibraryPage.myBookmarksFive, "my myBookmarksFive not display correct");
	}

	@Test(groups = { "Smoke" })
	public void testMyInterestPage() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.clickMyLIBRARY();

		libraryExplorePage.clickMyTopics();

		assertVisibleWithTimer(myLibraryPage.myInterestsOne, "my myInterestsOne not display correct");
		assertVisibleWithTimer(myLibraryPage.myInterestsTwo, "my myInterestsTwo not display correct");

		assertVisibleWithTimer(myLibraryPage.myInterestsFour, "my myInterestsFour not display correct");
		assertVisibleWithTimer(myLibraryPage.myInterestsFive, "my myInterestsFive not display correct");
	}

	@Test(groups = { "Smoke" })
	public void testMyTeachersPage() throws Throwable {

		libraryExplorePage.clickTabGuided();

		libraryExplorePage.clickMyLIBRARY();

		libraryExplorePage.clickMyTeachers();

		assertVisibleWithTimer(myLibraryPage.teacherNameOne, "my teacherNameOne not display correct");
		assertVisibleWithTimer(myLibraryPage.teacherNameTwo, "my teacherNameTwo not display correct");
		assertVisibleWithTimer(myLibraryPage.teacherNameThree, "my teacherNameThree not display correct");
		assertVisibleWithTimer(myLibraryPage.teacherNameFour, "my teacherNameFour not display correct");
		assertVisibleWithTimer(myLibraryPage.teacherNameFive, "my teacherNameFive not display correct");
	}

	
	@Test(groups = { "regression" })
	public void testGuidedMeditationSeeAll() throws Throwable {

		libraryExplorePage.clickTabGuided();
		libraryExplorePage.clickGM();

	//	assertVisibleWithTimer(libraryExplorePage.GMDisplay, "Guided Meditation is not display correct");
		swipeToUp(1000);

		libraryExplorePage.clickSeeAllGM();
		librarySearchPage.clickMOSTPlayed();
		librarySearchPage.clickLongToShort();

		assertVisibleWithTimer(libraryExplorePage.GMLongToShort, "GM LongToShort is not display correct");
		libraryExplorePage.clickTabGuided();

	}
	@Test(groups = { "regression" })
	public void testInterestFollowh() throws Throwable {

		libraryExplorePage.clickTabGuided();
		libraryExplorePage.sendkeySearchBtn("mindfulness");
		libraryExplorePage.clickSecularMindfulness();
		
		
		libraryExplorePage.clickFollow();

		libraryExplorePage.clickFollowing();

		assertVisibleWithTimer(libraryExplorePage.secularMindfulness,"secularMindfulness is not sdipslay correctly");
	
	}
}
