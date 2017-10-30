package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfilePage extends BasePage {
	private SettingsPage settingsPage;

	private AndroidDriver<AndroidElement> driver;

	public ProfilePage(AppiumDriver driver) {
		super(driver);
	}

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/tab_profile")
	private MobileElement tabProfile;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/frame_layout_notifications")
	private MobileElement notification;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/frame_layout_messages")
	private MobileElement message;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/frame_layout_connect")
	private MobileElement connect;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/guest_user_profile_change_photo")
	private MobileElement addPhoto;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/guest_user_profile_change_name")
	private MobileElement enterYourName;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/guest_user_profile_detailed_charts")
	private MobileElement detailedCharts;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/guest_mode_profile_your_milestones")
	private MobileElement yourMilestones;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/guest_mode_profile_friends")
	private MobileElement friends;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/tv_toolbar_title")
	private MobileElement title;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/save")
	private MobileElement saveImageBtn;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/guest_mode_profile_user_settings")
	private MobileElement guestProfileUserSettings;
	
	@AndroidFindBy(accessibility = "You have not yet reached any milestones on Insight Timer - you will soon though!")
	private MobileElement milestonesEmptyGreeting;
	
	@AndroidFindBy(accessibility = "MESSAGE")
	private MobileElement messageUserBtn;
	
	//REGISTERED USER ITEMS
	
	@AndroidFindBy(accessibility = "Quality Assurance")
	private MobileElement qualityAssuranceUserText;
	
	@AndroidFindBy(accessibility = "Add location...")
	private MobileElement addLocationBtn;
	
	@AndroidFindBy(accessibility = "Edit profile and privacy")
	private MobileElement editProfileAndPrivacy;
	
	@AndroidFindBy(accessibility = "ACTIVITY")
	private MobileElement activityTab;
	
	@AndroidFindBy(accessibility = "STATS ")
	private MobileElement statsTab;
	
	@AndroidFindBy(accessibility = "Consecutive Days")
	private MobileElement consecutiveDays;
	
	@AndroidFindBy(accessibility = "See detailed charts and stats")
	private MobileElement seeDetailedChartsAndStats;
	
	@AndroidFindBy(accessibility = "Days, Weeks, Months, All time")
	private MobileElement daysWeeksMonthsAllTime;
	
	@AndroidFindBy(accessibility = "365 Days Together")
	private MobileElement _365DaysTogether;
	
	@AndroidFindBy(accessibility = "Milestones achieved")
	private MobileElement milestonesAchieved;
	
	@AndroidFindBy(accessibility = "Days with at least one session")
	private MobileElement daysWithAtLeastOneSession;
	
	@AndroidFindBy(accessibility = "Profile FAQ")
	private MobileElement profileFaq;
	
	public void verifyProfileFaq() {
		verifyElementIsVisible(profileFaq);
	}
	
	public void verifyDaysWithAtLeastOneSession() {
		verifyElementIsVisible(daysWithAtLeastOneSession);
	}
	
	public void verifyMilestonesAchieved() {
		verifyElementIsVisible(milestonesAchieved);
	}
	
	public void verify365DaysTogether() {
		verifyElementIsVisible(_365DaysTogether);
	}

	public void verifyDaysWeeksMonthsAllTime() {
		verifyElementIsVisible(daysWeeksMonthsAllTime);
	}
	
	public void verifySeeDetailedChartsAndStats() {
		verifyElementIsVisible(seeDetailedChartsAndStats);
	}
	
	public void verifyConsecutiveDays() {
		verifyElementIsVisible(consecutiveDays);
	}
	
	public void verifyActivityTab() {
		verifyElementIsVisible(activityTab);
	}
	
	public void verifyStatsTab() {
		verifyElementIsVisible(statsTab);
	}
	
	public void verifyEditProfileAndPrivacyBtn() {
		verifyElementIsVisible(editProfileAndPrivacy);
	}
	
	public void verifyAddLocationBtn() {
		verifyElementIsVisible(addLocationBtn);
	}
	
	public void verifyQualityAssurance() {
		verifyElementIsVisible(qualityAssuranceUserText);
	}
	
	//registered user methods end
	
	public void logOutGuestUser() throws InterruptedException {
		clickTabProfile();
		clickGuestProfileUserSettings();
		settingsPage.clickLogout();
	}
	
	public void verifyMessageUserBtnIsNotDisplayed() throws InterruptedException {
		Thread.sleep(5000);
		verifyElementIsNotDisplayed(messageUserBtn);
	}
	
	public void clickMessageUserBtn() {
		clickElement(messageUserBtn);
	}
	
	public void verifyMilestonesEmptyGreeting() {
		verifyElementIsVisible(milestonesEmptyGreeting);
	}
	
	public void clickGuestProfileUserSettings() {
		clickElement(guestProfileUserSettings);
	}
	
	public boolean verifyChartsTitle() {
		String expected = "Charts data";
		String title1 = title.getText();
	    if(expected.equals(title1))
	    		return true;
			else
				return false;
	}
	
	public void clickFriends() {
		clickElement(friends);
	}
	
	public void clickYourMilestones() throws InterruptedException {
		clickElement(yourMilestones);
	}
	
	public void clickDetailedCharts() {
		clickElement(detailedCharts);
	}
	
	public void clickEnterYourName() {
		clickElement(enterYourName);
	}
	
	public void clickAddPhoto() {
		clickElement(addPhoto);
	}

	public void clickTabProfile() throws InterruptedException {
		clickElement(tabProfile);
		Thread.sleep(2000);
	}

	public void verifyNotification() {
		verifyElementIsVisible(notification);
	}

	public void verifyMessage() {
		verifyElementIsVisible(message);
	}

	public void verifyConnect() {
		verifyElementIsVisible(connect);
	}
}
