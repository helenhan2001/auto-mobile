package Pages;

import java.util.List;

import Tests.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeScreenPage extends BasePage {
	private OnboardingPage onboardingPage;
	private AndroidDriver<AndroidElement> driver;

	public HomeScreenPage(AppiumDriver driver) {
		super(driver);
	}

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/meditating_now")
	private MobileElement meditationNowNumber;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/image_view_logo")
	private MobileElement logo;

	@AndroidFindBy(className = "android.view.View")
	private MobileElement map;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/image_view_add_friend")
	private MobileElement addFriendBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Community']")
	private MobileElement community;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/button_announcement_close")
	private MobileElement closeAnnouns;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/welcome_button_skip")
	private MobileElement skip;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/guest_mode_sign_in_button")
	private MobileElement guestModeSignInButton;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/text_view_invite_from_contacts")
	private MobileElement inviteFromContacts;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/text_view_invite_from_facebook")
	private MobileElement inviteFromFacebook;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/text_view_add_location")
	private MobileElement addYourLocation;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/pociv")
	private MobileElement userPic;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/text_view_friends_activity")
	private MobileElement friendsActivity;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Friends']")
	private MobileElement friends;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Nearby']")
	private MobileElement nearby;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sydney, NSW, Australia']")
	private MobileElement sydneyNswAustralia;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/text_view_content")
	private MobileElement userContentText;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/image_view_library_avatar")
	private MobileElement guidedMeditationAvatar;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/text_view_time_desc")
	private MobileElement userTimerCounter;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/text_view_content")
	private MobileElement userViewContent;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/text_view_user_description")
	private MobileElement userViewDescription;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/text_view_menu")
	private MobileElement editBtn;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/button_clear")
	private MobileElement xBtn;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/button_cancel")
	private MobileElement cancelLocationBtn;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/tab_home")
	private MobileElement tabHome;
	
	@AndroidFindBy(accessibility = "IwGWCF8")
	private MobileElement friend1Id;
	
	@AndroidFindBy(accessibility = "Friend1")
	private MobileElement friend1Title;
	
	@AndroidFindBy(accessibility = "Sydney, NSW, Australia")
	private MobileElement friend1CitySydney;
	
	@AndroidFindBy(accessibility = "FRIENDS 1")
	private MobileElement friends1;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Quality Assurance']")
	private MobileElement qualityAssurance;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Be Here Now']")
	private MobileElement beHereNow;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Announcements']")
	private MobileElement announcements;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='365 DAYS TOGETHER']")
	private MobileElement daysTogether;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/pociv")
	private List<MobileElement> userPicListItem;
	
	public void clickSkip() {
		clickElement(skip);
	}	
	
	public void clickUserPicListItem(int arrayNumber) {
		clickElement(userPicListItem.get(arrayNumber));
	}	
	
	public void verifyNumberLogoMap() throws InterruptedException {
		verifyElementIsVisible(meditationNowNumber);
		isNumberCorrect();
		verifyLogo();
		verifyMap();
	}
	
	public void verifyDaysTogether() throws InterruptedException {
		verifyElementIsVisible(daysTogether);
	}
	
	public void verifyAnnouncements() throws InterruptedException {
		verifyElementIsVisible(announcements);
	}
	
	public void verifyBeHereNow() throws InterruptedException {
		verifyElementIsVisible(beHereNow);
	}
	
	public void verifyFriend1Profile() {
		verifyElementIsVisible(friend1Id);
		verifyElementIsVisible(friend1Title);
		verifyElementIsVisible(friend1CitySydney);
		clickElement(friends1);
		//waitForElementToBeVisible(qualityAssurance);
		//need to move to context?..
	}	
	
	public void clickTabHome() {
		clickElement(tabHome);
	}	
	
	public void verifyOrAddLocationSydney() throws InterruptedException {
		if (elementExists(sydneyNswAustralia) == true)
		{		
			clickSydneyNswAustralia();
			clickEdit();
			clickX();
			clilickCancelLocation();
			verifyAddYourLocation();
			TestBase.navigateBack();
			swipeToDown();
			verifyNearby();
		}
		else
		{
			clickNearby();
			clickAddYourLocation();
			onboardingPage.setSearchLocation("Sydney, NSW, Australia");
			onboardingPage.clickSydneyNswAustralia();
			TestBase.navigateBack();
			swipeToUp();
			verifySydneyNswAustralia();		
		}
		
		clickTabHome();
		
		if (elementExists(sydneyNswAustralia) == false)
		{		
			clickNearby();
			clickAddYourLocation();
			onboardingPage.setSearchLocation("Sydney, NSW, Australia");
			onboardingPage.clickSydneyNswAustralia();
			TestBase.navigateBack();
			swipeToUp();
			verifySydneyNswAustralia();
		}
		else
		{
			clickSydneyNswAustralia();
			clickEdit();
			clickX();
			clilickCancelLocation();
			verifyAddYourLocation();
			TestBase.navigateBack();
			swipeToDown();
			verifyNearby();	
		}
	}
	
	public void clilickCancelLocation() {
		clickElement(cancelLocationBtn);
	}
	
	public void clickX() {
		clickElement(xBtn);
	}
	
	public void clickEdit() {
		clickElement(editBtn);
	}
	
	public void verifyUserViewDescription() {
		verifyElementIsVisible(userViewDescription);
	}
	
	public void verifyUserViewContent() {
		verifyElementIsVisible(userViewContent);
	}
	
	public void verifyTimerCounter() {
		verifyElementIsVisible(userTimerCounter);
	}
	
	public void verifyGuidedMeditationAvatar() {
		verifyElementIsVisible(guidedMeditationAvatar);
	}
	
	public void verifyUserContentText() {
		verifyElementIsVisible(userContentText);
	}
	
	public void verifySydneyNswAustralia() {
		verifyElementIsVisible(sydneyNswAustralia);
	}
	
	public void clickSydneyNswAustralia() {
		clickElement(sydneyNswAustralia);
	}
	
	public void clickAddYourLocation() {
		clickElement(addYourLocation);
	}
	
	public void verifyAddYourLocation() {
		verifyElementIsVisible(addYourLocation);
	}
	
	public void verifyFriendsActivity() {
		verifyElementIsVisible(friendsActivity);
	}
	
	public void verifyFriends() {
		verifyElementIsVisible(friends);
	}
	
	public void clickFriends() {
		clickElement(friends);
	}
	
	public void clickNearby() {
		clickElement(nearby);
	}

	public void clickUserPicture() {
		clickElement(userPic);
	}
	
	public void verifyUserPicture() {
		verifyElementIsVisible(userPic);
	}
	
	public void checkIfinviteFromFacebook() {
		inviteFromFacebook.isDisplayed();
	}
	
	public void clickInviteFromContacts() {
		clickElement(inviteFromContacts);
	}
	
	public void clickAddFriendButton() {
		clickElement(addFriendBtn);
	}
	
	public void clickGuestModeSignInButton() {
		clickElement(guestModeSignInButton);
	}
	
	public void clickSkipAndVerifyNumberLogoMap() throws InterruptedException {
		clickSkip();
		verifyElementIsVisible(meditationNowNumber);
		isNumberCorrect();
		verifyLogo();
		verifyMap();
	}
	
	public void verifyIfUserIsOnHomeScreen() throws InterruptedException {
		verifyElementIsVisible(meditationNowNumber);
		isNumberCorrect();
		verifyLogo();
		verifyMap();
	}
	
	public boolean isNumberCorrect() {
		String numberString = meditationNowNumber.getText();
		String sub_str = " meditating now";
		String number_str = ",";
		String numberStr = numberString.replace(sub_str, "");
		int numberNow = Integer.parseInt(numberStr.replaceAll(number_str, ""));
		if (numberNow > 1000) // our app should always have more than 1000 users
								// online at same time
			return true;
		else
			return false;
	}

	public boolean isElementCorrect(String result) {
		return false;
	}

	public void verifyLogo() {
		verifyElementIsVisible(logo);
	}

	public void verifyMap() {
		verifyElementIsVisible(map);
	}
	
	public void refreshHomescreenAndVerifyUserIsOnHomeScreen() throws InterruptedException {
		for (int i = 1; i < 5; i++) {
			swipeToDown();
			verifyIfUserIsOnHomeScreen();
		}
	}

	public boolean isCommunityExist() {
		return elementExists(community);
	}

	public boolean isNearbyExist() {
		return elementExists(nearby);
	}

	public void verifyNearby() {
		verifyElementIsVisible(nearby);
	}

	public void verifyCommunity() throws InterruptedException {
		verifyElementIsVisible(community);
	}

	public void clickCloseAnnouns() {
		clickElement(closeAnnouns);
	}

	public boolean elementExists(MobileElement element) {
		try {
			element.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
