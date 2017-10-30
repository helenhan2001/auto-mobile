package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class UserProfilePage extends BasePage {

	private AndroidDriver<AndroidElement> driver;

	public UserProfilePage(AppiumDriver driver) {
		super(driver);
	}

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/text_view_title")
	private MobileElement userTitle;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/image_view_navigation")
	private MobileElement backBtn;
	
	@AndroidFindBy(accessibility = "Sydney, NSW, Australia")
	private MobileElement sydneyCity;
	
	@AndroidFindBy(accessibility = "profile")
	private MobileElement profilePicture;
	
	@AndroidFindBy(accessibility = "+ FRIEND")
	private MobileElement plusFriend;
	
	@AndroidFindBy(accessibility = "MESSAGE")
	private MobileElement message;
	
	@AndroidFindBy(xpath = "//android.webkit.WebView[@content-desc='profile.jpg (500�500)']")
	private MobileElement profilePictureJpg;
	
	@AndroidFindBy(accessibility = "Report or block user")
	private MobileElement dotsReportOrBlockUser;
	
	@AndroidFindBy(accessibility = "//android.view.View[@content-desc='ACTIVITY']")
	private MobileElement activityTab;
	
	@AndroidFindBy(accessibility = "//android.view.View[@content-desc='STATS']")
	private MobileElement statsTab;
	
	@AndroidFindBy(xpath = "(//android.widget.Image[@content-desc=\"act_meditate\"])[1]")
	private MobileElement TimerSessionImage;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='YogoNidraForSleep_FrankHeke']")
	private MobileElement YogaNidraForSleepMeditationSessionImage;
	
	public void verifyCompletedTimerSessionImage() {
		verifyElementIsVisible(TimerSessionImage);
	}
	
	public void verifyCompletedYogaNidraForSleepMeditationSessionImage() {
		verifyElementIsVisible(YogaNidraForSleepMeditationSessionImage);
	}
	
	public void verifyStatsTab() {
		verifyElementIsVisible(statsTab);
	}
	
	public void verifyActivityTab() {
		verifyElementIsVisible(activityTab);
	}
	
	public void verifyDotsReportOrBlockUser() {
		verifyElementIsVisible(dotsReportOrBlockUser);
	}
	
	public void verifyProfilePictureJpg() {
		verifyElementIsVisible(profilePictureJpg);
	}
	
	public void verifyMessage() {
		verifyElementIsVisible(message);
	}

	public void clickMessageBtn() {
		clickElement(message);
	}
	
	public void verifyPlusFriend() {
		verifyElementIsVisible(plusFriend);
	}
	
	public void clickPlusFriend() {
		clickElement(plusFriend);
	}
	
	public void verifyProfilePicture() {
		verifyElementIsVisible(profilePicture);
	}
	
	public void clickProfilePicture() {
		clickElement(profilePicture);
	}
	
	public void verifySydneyCity() {
		verifyElementIsVisible(sydneyCity);
	}
	
	public void verifyUserTitle() {
		verifyElementIsVisible(userTitle);
	}
	
	public void clickbackBtn() {
		clickElement(backBtn);
	}
}
