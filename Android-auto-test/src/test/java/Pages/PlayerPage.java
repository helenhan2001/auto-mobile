package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PlayerPage extends BasePage {

	private AndroidDriver<AndroidElement> driver;

	public PlayerPage(AppiumDriver driver) {
		super(driver);
	}

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/title")
	private MobileElement title;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/countdown")
	private MobileElement countdown;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/play_pause")
	private MobileElement playPauseBtn;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/paused_label")
	private MobileElement pausedLabel;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/finish_early")
	private MobileElement finishEarly;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='COMPLETED']")
	private MobileElement completedText;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='DONE']")
	private MobileElement doneText;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/dont_log")
	private MobileElement dontLog;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/toolbar_exit")
	private MobileElement exitThanksPeople;
	
	public void finishMeditationEarly() throws InterruptedException {
		verifyCountdown();
		Thread.sleep(8000);
		verifyPlayPauseBtn();
		clickPlayPauseBtn();
		verifyPausedLabel();
		verifyCountdown();
		verifyFinishEarly();
		clickFinishEarly();	
		//suspended until further notice
		//verifyCompletedText();
		//verifyDoneText();
	}	
	
	public void clickExitThanksPeople() {
		clickElement(exitThanksPeople);
	}
	
	public void clickDontLog() {
		clickElement(dontLog);
	}
	
	public void verifyDoneText() {
		verifyElementIsVisible(doneText);
	}
	
	public void verifyCompletedText() {
		verifyElementIsVisible(completedText);
	}
	
	public void verifyFinishEarly() {
		verifyElementIsVisible(finishEarly);
	}
	
	public void clickFinishEarly() {
		clickElement(finishEarly);
	}
	
	public void verifyPausedLabel() {
		verifyElementIsVisible(pausedLabel);
	}
	
	public void clickPlayPauseBtn() {
		clickElement(playPauseBtn);
	}
	
	public void verifyPlayPauseBtn() {
		verifyElementIsVisible(playPauseBtn);
	}
	
	public void verifyCountdown() {
		verifyElementIsVisible(countdown);
	}
	
	public void verifyTitle() {
		verifyElementIsVisible(title);
	}	
}
