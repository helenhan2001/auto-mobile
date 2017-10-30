package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SettingsPage extends BasePage {

	private AndroidDriver<AndroidElement> driver;

	public SettingsPage(AppiumDriver driver) {
		super(driver);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Timer settings']")
	private MobileElement timerSettings;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Daily Meditation Reminder']")
	private MobileElement dailyMeditationReminder;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Journal, Log & Stats']")
	private MobileElement journalLogsStats;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Opening screen']")
	private MobileElement openingScreen;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Privacy']")
	private MobileElement privacy;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Help (FAQ)']")
	private MobileElement helpFaq;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Contact']")
	private MobileElement contact;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Rate or Review Insight Timer']")
	private MobileElement rateOrReviewInsightTimer;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Insight Timer Facebook Page']")
	private MobileElement insightTimerFacebookPage;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Logout']")
	private static MobileElement logout;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Log out']")
	private static MobileElement logoutPopup;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Timer']")
	private MobileElement timer;

	public void clickTimerSettings() {
		clickElement(timerSettings);
	}
	
	public void clickDailyMeditationReminder() {
		clickElement(dailyMeditationReminder);
	}
	
	public void clickJournalLogsStats() {
		clickElement(journalLogsStats);
	}
	
	public void clickOpeningScreen() {
		clickElement(openingScreen);
	}
	
	public void clickPrivacy() {
		clickElement(privacy);
	}
	
	public void clickHelpFaq() {
		clickElement(helpFaq);
	}
	
	public void clickContact() {
		clickElement(contact);
	}
	
	public void clickRateReviewInsightTimer() {
		clickElement(rateOrReviewInsightTimer);
	}
	
	public void clickInsightTimerFacebookPage() {
		clickElement(insightTimerFacebookPage);
	}
	
	public void clickLogout() {
		clickElement(logout);
		clickElement(logoutPopup);
	}
}
