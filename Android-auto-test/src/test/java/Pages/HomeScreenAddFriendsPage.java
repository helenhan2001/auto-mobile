package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeScreenAddFriendsPage extends BasePage {

	private AndroidDriver<AndroidElement> driver;

	public HomeScreenAddFriendsPage(AppiumDriver driver) {
		super(driver);
	}

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/image_view_navigation")
	private MobileElement backBtn;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Friends']")
	private MobileElement friends;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Invite friends from Contacts']")
	private MobileElement inviteFriendsFromContactsText;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/text_view_invite_from_contacts")
	private MobileElement inviteFriendsFromContacts;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Invite friends from Facebook']")
	private MobileElement inviteFriendsFromFacebookText;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/text_view_invite_from_facebook")
	private MobileElement inviteFriendsFromFacebook;
	
	public void clickInviteFriendsFromContacts() throws InterruptedException {
		clickElement(inviteFriendsFromContacts);
		Thread.sleep(3000);
	}
	
	public void clickInviteFriendsFromFacebook() throws InterruptedException {
		clickElement(inviteFriendsFromFacebook);
		Thread.sleep(3000);
	}
	
	public void verifyInviteFriendsFromContactsText() {
		verifyElementIsVisible(inviteFriendsFromContactsText);
	}
	
	public void verifyinviteFriendsFromFacebookText() {
		verifyElementIsVisible(inviteFriendsFromFacebookText);
	}
	
	public void clickBackBtn() {
		clickElement(backBtn);
	}

	public void verifyBackBtn() {
		verifyElementIsVisible(backBtn);
	}
	
	public void verifyFriends() {
		verifyElementIsVisible(friends);
	}
}
