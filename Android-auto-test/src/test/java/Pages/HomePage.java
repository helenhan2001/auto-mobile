package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePage {

	private AndroidDriver<AndroidElement> driver;

	public HomePage(AppiumDriver driver) {
		super(driver);
	}

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/login_button")
	private MobileElement buttonLogin;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/email_text_input")
	private MobileElement email;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/password_text_input")
	private MobileElement password;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/login_button")
	private MobileElement homeLogin;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/meditating_now")
	private MobileElement meditationNowNumber;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/image_view_logo")
	private MobileElement logo;

	@AndroidFindBy(className = "android.view.View")
	private MobileElement map;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/image_view_add_friend")
	private MobileElement addFriend;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Nearby']")
	private MobileElement nearby;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Thich Nhat Hanh']")
	private MobileElement groupThichNhatHanh;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Insight Community']")
	private MobileElement groupInsightCommunity;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Beginner's Mind\"]")
	private MobileElement groupBeginnersMind;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Women Meditate Worldwide']")
	private MobileElement groupWomenMeditateWorldwide;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Community']")
	private MobileElement community;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/button_announcement_close")
	private MobileElement closeAnnouns;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/welcome_button_skip")
	private static MobileElement skip;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/guest_mode_sign_in_button")
	private MobileElement guestModeSignInButton;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/image_view_add_friend")
	private MobileElement addFriendButton;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/text_view_invite_from_contacts")
	private MobileElement inviteFromContacts;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/text_view_invite_from_facebook")
	private MobileElement inviteFromFacebook;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/pociv")
	private MobileElement userPic;
	
	@AndroidFindBy(accessibility = "com.spotlightsix.zentimerlite2:id/profile")
	private MobileElement userProfile;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/welcome_tnc")
	private MobileElement byContinuingYouAgreeToTermsAndConditions;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Terms & Privacy']")
	private MobileElement termsAndPrivacy;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/welcome_register_fb")
	private MobileElement orContinueWithFacebook;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/tab_guided")
	private MobileElement tabLibrary;
	
	public void clickLibraryTab() {
		clickElement(tabLibrary);
	}
	
	public void clickOrContinueWithFacebook() throws InterruptedException {
		clickElement(orContinueWithFacebook);
		Thread.sleep(3000);
	}
	
	public void verifyTermsAndPrivacy() {
		verifyElementIsVisible(termsAndPrivacy);
	}
	
	public void clickByContinuingYouAgreeToTermsAndConditions() {
		clickElement(byContinuingYouAgreeToTermsAndConditions);	
	}
	
	public void verifyUserProfileIsNotDisplayed() {
		verifyElementIsNotDisplayed(userProfile);
	}	
	
	public void clickUserPic() {
		clickElement(userPic);
	}
	
	public void checkIfinviteFromFacebook() {

		inviteFromFacebook.isDisplayed();
	}
	
	public void clickInviteFromContacts() {
		clickElement(inviteFromContacts);
	}
	
	public void clickAddFriendButton() {
		clickElement(addFriendButton);
	}
	
	public void clickGuestModeSignInButton() {
		clickElement(guestModeSignInButton);
	}
	
	public void verifyGuestModeSignInButton() {
		verifyElementIsVisible(guestModeSignInButton);
	}
	
	public void clickSkipAndVerifyNumberLogoMap() throws InterruptedException {
		clickSkip();
		verifyElementIsVisible(meditationNowNumber);
		isNumberCorrect();
		verifyLogo();
		verifyMap();
	}
	
	public void clickSkip() {
		clickElement(skip);
	}

	public void homeLogin() {
		clickElement(buttonLogin);
	}

	public void email() {
		setElement(email, "han.helen8@gmail.com");
	}

	public void password() {
		setElement(password, "Passw0rd");
	}

	public void clickLogin() {
		clickElement(homeLogin);
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

	public void verifyAddFriend() {
		verifyElementIsVisible(addFriend);
	}

	public boolean isGroupOneExist() {
		return elementExists(groupThichNhatHanh);
	}

	public boolean isGroupTwoExist() {
		return elementExists(groupInsightCommunity);
	}

	public boolean isGroupThreeExist() {
		return elementExists(groupBeginnersMind);
	}

	public boolean isGroupFourExist() {
		return elementExists(groupWomenMeditateWorldwide);
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

	public void verifyGroupOne() {
		verifyElementIsVisible(groupThichNhatHanh);
	}

	public void verifyGroupTwo() {
		verifyElementIsVisible(groupInsightCommunity);
	}

	public void verifyGroupThree() {
		verifyElementIsVisible(groupBeginnersMind);
	}

	public void verifyGroupFour() {
		verifyElementIsVisible(groupWomenMeditateWorldwide);
	}

	public void verifyCommunity() {
		verifyElementIsVisible(community);
	}

	public void clickCloseAnnouns() {

		closeAnnouns.click();
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
