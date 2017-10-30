package Pages;

import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TimerPage extends BasePage {

	private AndroidDriver<AndroidElement> driver;

	public TimerPage(AppiumDriver driver) {
		super(driver);
	}

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/tab_timer")
	private MobileElement timerBtn;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/timer_help")
	private MobileElement timerHelp;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='TIMER']")
	private MobileElement timerLable;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='PRESETS']")
	private MobileElement timerPresets;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Starting bell']")
	private MobileElement timerBell;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/icon")
	private MobileElement timerIcon;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/configuration_representation")
	private MobileElement timerConfig;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/start_icon")
	private MobileElement timerStart;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/tab_timer")
	private MobileElement timerTab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Meditation']")
	private MobileElement meditationText;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/countdown")
	private MobileElement countDown;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/play_pause")
	private MobileElement playPause;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/finish_early")
	private MobileElement finishEarly;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='COMPLETED']")
	private MobileElement completedText;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='DONE']")
	private MobileElement doneBtn;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Done']")
	private MobileElement doneText;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/time_elapsed")
	private MobileElement timeElapsed;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/count")
	private MobileElement count;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/image")
	private MobileElement image;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/count_supplement")
	private MobileElement supplement;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/progress")
	private MobileElement peopleProgress;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/toolbar_exit")
	private MobileElement exitThanksPeople;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/thank")
	private MobileElement thanksPeopleBtn;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/done")
	private MobileElement doneTimer;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='PRESETS']")
	private MobileElement presetsBtn;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/name")
	private MobileElement presetsTimer;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/dont_log")
	private MobileElement dontLog;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/interval_bells_container")
	private MobileElement bellContainer;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/duration_container")
	private MobileElement durationContainer;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/ambient_sound_container")
	private MobileElement soundContainer;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/ending_bell_container")
	private MobileElement endBellContainer;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/toolbar_back")
	private MobileElement toolBarBack;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/toolbar_title")
	private MobileElement toolBarTitle;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/save")
	private MobileElement saveImageBtn;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/more_dots")
	private MobileElement dots;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/toolbar_exit")
	private MobileElement toolbarExit;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Timer help']")
	private MobileElement timerHelpTitle;
	
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Duration, Activity & Warm-up')]")
	private MobileElement durationActivityWarmupText;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'Bell image')]")
	private List<MobileElement> bellImages;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='GET']")
	private MobileElement getBtn;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Asian Style Bundle']")
	private MobileElement asianStyleBundle;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Save as a preset']")
	private MobileElement saveAsPreset;
	
	public void clickSaveAsPreset(){
		clickElement(saveAsPreset);
	}
	
	public void verifyAsianStyleBundleText(){
		verifyElementIsVisible(asianStyleBundle);
	}
	
	public void clickGetBtn() {
		clickElement(getBtn);
	}
	
	public void clickBellImageByIndex(int index) throws InterruptedException {
		clickElement(bellImages.get(index));
		Thread.sleep(2000);
	}
	
	public void verifyDurationActivityWarmupText(){
		verifyElementIsVisible(durationActivityWarmupText);
	}
	
	public void verifyTimerHelpTitle(){
		verifyElementIsVisible(timerHelpTitle);
	}
	
	public void closeTimerScreen() throws InterruptedException{
		for (int i=1; i<10; i++) {
			if (elementExists(toolbarExit)) {
			    toolbarExit.click();             
			} else {
				break;
			}
		}
	}
	
	public void verifyDotsAreNotVisible(){
		verifyElementIsNotDisplayed(dots);
	}
	
	public void clickDots() {
		clickElement(dots);
	}

	public void clickTabTimer() {
		clickElement(timerBtn);
	}

	public void clickFinishEarly() {
		clickElement(finishEarly);
	}

	public void clickStart() {
		clickElement(timerStart);
	}
	
	public void clickTimerHelp() {
		clickElement(timerHelp);
	}

	public void verifyTimerhelp() {
		verifyElementIsVisible(timerHelp);
	}

	public void verifyMeditationText() {
		verifyElementIsVisible(meditationText);
	}

	public void verifyCountDown() {
		verifyElementIsVisible(countDown);
	}

	public void clickPlayPause() {
		clickElement(playPause);
	}

	public void verifyTimerLable() {
		verifyElementIsVisible(timerLable);
	}

	public void verifyTimerPresets() {
		verifyElementIsVisible(timerPresets);
	}

	public void verifyTimerBell() {
		verifyElementIsVisible(timerBell);
	}

	public void verifyTimerIcon() {
		verifyElementIsVisible(timerIcon);
	}

	public void verifyTimerConfig() {
		verifyElementIsVisible(timerConfig);
	}

	public void verifyCompleteText() {
		verifyElementIsVisible(completedText);
	}
	public void clickDoneBtn() throws InterruptedException {
		clickElement(doneBtn);
		Thread.sleep(3000);
	}

	public void clickDoneText() throws InterruptedException {
		clickElement(doneText);
	}

	public void verifyTimeElapsed() {
		verifyElementIsVisible(timeElapsed);
	}

	public void verifyCount() {
		verifyElementIsVisible(count);
	}

	public void verifyImage() {
		verifyElementIsVisible(image);
	}

	public void verifySupplement() {
		verifyElementIsVisible(supplement);
	}

	public void clickPeople() throws InterruptedException {
		clickElement(peopleProgress);
	}

	public void clickExitThanksPeople() {
		clickElement(exitThanksPeople);
	}

	public void clickThanksPeopleBtn() {
		clickElement(thanksPeopleBtn);
	}

	public void verifyThanksPeopleBtn() {
		verifyElementIsVisible(thanksPeopleBtn);
	}

	public void clickTimerDone() {
		clickElement(doneTimer);
	}

	public void clickPresets() {
		clickElement(presetsBtn);
	}

	public void clickPresetsTimer() {
		clickElement(presetsTimer);
	}

	public void clickDontLog() throws InterruptedException {
		clickElement(dontLog);
	}

	public void clickBellContainer() {
		clickElement(bellContainer);
	}

	public void clickDurationcContainer() {
		clickElement(durationContainer);
	}

	public void clickSoundContainer() {
		clickElement(soundContainer);
	}

	public void clickEndBellContainer() {
		clickElement(endBellContainer);
	}

	public void clickToolBarBack() {
		clickElement(toolBarBack);
	}

	public void verifyToolBarTitle() {
		verifyElementIsVisible(toolBarTitle);
	}

	public void clickSaveBtn() {
		clickElement(saveImageBtn);
	}
}
