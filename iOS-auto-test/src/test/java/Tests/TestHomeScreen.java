package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.GuestModePage;
import Pages.HomePage;

public class TestHomeScreen extends TestBase {

	HomePage page;
	GuestModePage guestModePage;

	@BeforeTest(alwaysRun = true)
	@Override
	public void setUpPage() throws Throwable {
		page = new HomePage(driver);
		guestModePage = new GuestModePage(driver);

	}

	@BeforeClass(alwaysRun = true)
	@Override
	public void navigateTo() throws InterruptedException {
		page.clickTabNow();
	}

	@BeforeMethod(alwaysRun = true)

	public void BeforeTestMethod() throws Throwable {

	}

	@AfterMethod(alwaysRun = true)

	public void AfterTestMethod() throws InterruptedException {
		// tryLogoutApp();
		// driver.resetApp();
	}

	@Test(groups = { "Smoke" })
	public void testHomeScreenRefresh() throws Throwable {
	  
			assertEnabledWithTimer(page.map, "map is not display correctly");

			assertEnabledWithTimer(page.logo, "logo is not display correctly");
			assertEnabledWithTimer(page.addFriend, "addFriend is not display  correctly");
			assertEnabledWithTimer(page.meditationToday, "meditationToday is not  display correctly");
 
	}

//	@Test(groups = { "Smoke" })
//	public void testSeeMoreFriendActivity() throws Throwable {
//		//scroll("down");
//	// 	page.clickInviteUserButton();
//	 	page.clickAddFriend();
//		
//		assertEnabledWithTimer(page.helenitqa, "helenitqa SeeMoreFriendActivity is not display correctly");
//
//	}
//
//	@Test(groups = { "Smoke" })
//	public void testSeeMoreNearBy() throws Throwable {
//		guestModePage.clickTabNow();
//		  
//		page.clickNearby();
//		 
//		assertEnabledWithTimer(page.nearbyCells, "see more nearby is not display correctly ");
//
//	}

	// @Test(groups = { "Smoke" })
	// public void testHomeScreenLogo() throws Throwable {
	//
	// assertEnabledWithTimer(page.logo, "logo is not display correctly");
	//
	// }
	//
	// @Test(groups = { "Smoke" })
	// public void testHomeScreenMeditationNow() throws Throwable {
	//
	// assertEnabledWithTimer(page.meditationNow, "meditationNow is not display
	// correctly");
	//
	// }
	//
	// @Test(groups = { "Smoke" })
	// public void testHomeScreenMeditationToday() throws Throwable {
	//
	// assertEnabledWithTimer(page.meditationToday, "meditationToday is not
	// display correctly");
	//
	// }
	//
	// @Test(groups = { "Smoke" })
	// public void testHomeScreenMeditationAddFriend() throws Throwable {
	//
	// assertEnabledWithTimer(page.addFriend, "addFriend is not display
	// correctly");
	//
	// }
	//
	// @Test(groups = { "Smoke" })
	// public void testHomeScreenMeditationNaerBy() throws Throwable {
	//
	// assertEnabledWithTimer(page.nearby, "nearby is not display correctly");
	//
	// }

	// @Test(priority = 7)
	// public void testSeeMoreFriendActivity() throws Throwable {
	// scroll("down");
	// page.clickInviteUserButton();
	// Thread.sleep(6000);
	// assertEnabledWithTimer(page.helenitqa, "helenitqa SeeMoreFriendActivity
	// is not display correctly");
	//
	// }

	// below will update after add IDs
	// @Test(priority = 0)
	// public void testHomeScreenRefresh() throws Throwable {
	// guestModePage.clickTabNow();
	// for (int i = 1; i < 5; i++) {
	// scroll("up");
	// // assertEnabledWithTimer(page.meditationNow, "meditationNow is not
	// display correctly");
	// assertEnabledWithTimer(page.addFriend, "addFriend is not display
	// correctly");
	// // assertEnabledWithTimer(page.meditationToday, "meditationToday is not
	// display correctly");
	//
	// }
	//
	// }
	//
	// @Test(priority = 1)
	// public void testSeeMoreNearBy() throws Throwable {
	// guestModePage.clickTabNow();
	// Thread.sleep(2000);
	//
	// page.clickNearby();
	// Thread.sleep(3000);
	// assertEnabledWithTimer(page.nearbyCells, "see more nearby is not display
	// correctly ");
	//
	// }
	//
	// @Test(priority = 2)
	// public void testGroupOne() throws Throwable {
	// guestModePage.clickTabNow();
	//
	// for (int i = 1; i < 5; i++) {
	// scroll("down");
	//
	// if (page.isGroupOneExist()) {
	//
	//
	// break;
	// }
	// }
	// page.clickGroupOne();
	// //Thread.sleep(400);
	// }
	// Below it update by later
	// // @Test(priority = 0)
	// public void testHomePageFeeds() throws Throwable {
	// guestModePage.clickTabNow();
	// Thread.sleep(2000);
	//
	// assertEnabledWithTimer(page.meditationNow, "meditationNow is not display
	// correctly");
	// assertEnabledWithTimer(page.addFriend, "addFriend is not display
	// correctly");
	//
	// assertEnabledWithTimer(page.meditationToday, "meditationToday is not
	// display correctly");
	//
	// page.clickSeeMoreFriendActivity();
	//
	// }
	// @Test(priority = 3) public void testGroupTwo() throws Throwable {
	// guestModePage.clickTabNow(); for (int i = 1; i < 5; i++) {
	// scroll("down");
	//
	// if (page.isGroupTwoExist()) { break; } }
	//
	// assertVisibleWithTimer(page.groupTwo,
	// "Insight Timer Home Screen GroupTwo not dipslay correctly"); //
	//
	// @Test(priority = 4) public void testGroupThree() throws Throwable {
	// guestModePage.clickTabNow(); for (int i = 1; i < 5; i++) {
	// scroll("down");
	//
	// if (page.isGroupThreeExist()) { break; } }
	// assertVisibleWithTimer(page.groupThree,
	// "Insight Timer Home Screen GroupThree not dipslay correctly"); //
	//
	//
	// @Test(priority = 5) public void testGroupFour() throws Throwable {
	// guestModePage.clickTabNow(); for (int i = 1; i < 6; i++) {
	// scroll("down");
	//
	// if (page.isGroupFourExist()) { break; } }
	//
	// assertVisibleWithTimer(page.groupFour,
	// "Insight Timer Home Screen GroupFour not dipslay correctly"); //
	//
	// @Test(priority = 6) public void testCommunity() throws Throwable {
	// guestModePage.clickTabNow(); for (int i = 1; i < 7; i++) {
	// scroll("down");
	//
	// if (page.isCommunityExist()) { break; } }
	//
	// assertVisibleWithTimer(page.community,
	// "Insight Timer Home Screen Community not dipslay correctly"); //
	// }
	//

}
