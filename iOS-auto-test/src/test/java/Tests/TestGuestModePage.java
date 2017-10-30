// package Tests;
//
// import org.testng.annotations.AfterMethod;
// import org.testng.annotations.BeforeClass;
// import org.testng.annotations.BeforeMethod;
// import org.testng.annotations.BeforeTest;
//
// import Pages.GuestModePage;
// import Pages.LibraryExplorePage;
//
// public class TestGuestModePage extends TestBase {
//
// GuestModePage guestModePage;
// LibraryExplorePage libraryPage;
//
// @BeforeTest
// @Override
// public void setUpPage() throws Throwable {
// libraryPage = new LibraryExplorePage(driver);
// guestModePage = new GuestModePage(driver);
// }
//
// @BeforeClass
// @Override
// public void navigateTo() throws InterruptedException {
//
// }
//
// @BeforeMethod
//
// public void BeforeTestMethod() throws Throwable {
//
// }
//
// @AfterMethod
//
// public void AfterTestMethod() {
// driver.closeApp();
// driver.launchApp();
// }
//
// // @Test(priority = 5)
// // public void testGuestModeLibrary() throws Throwable {
// //
// // guestModePage.skipBtn();
// // guestModePage.moreThanYear();
// // driver.switchTo().alert().accept();
// // Thread.sleep(100);
// // guestModePage.clickTabGuided();
// // Thread.sleep(1300);
// //
// // Assert.assertTrue(libraryPage.verifyEnglish(), "library English bell not
// // correctly");
// //
// // // libraryPage.sendkeySearchBtn();
// //
// // }
//
// }
