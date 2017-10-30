package Pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class TimerPage extends BasePage {

	public IOSDriver<IOSElement> driver;

	public TimerPage(IOSDriver<IOSElement> driver) {
		super(driver);
	}

	@iOSFindBy(accessibility = "tab_timer")
	public MobileElement timerBtn;
	@iOSFindBy(accessibility = "Duration")
	public MobileElement duration;
	@iOSFindBy(accessibility = "Interval bells")
	public MobileElement intervalbells;
	@iOSFindBy(accessibility = "Ambient sound")
	public MobileElement ambientSound;
	@iOSFindBy(accessibility = "Ending bell")
	public MobileElement endingbell;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")
	public MobileElement pauseBell;

	@iOSFindBy(accessibility = "Finish early")
	public MobileElement finishEarly;

	@iOSFindBy(accessibility = "Done")
	public MobileElement done;

	@iOSFindBy(accessibility = "START")
	public MobileElement timerStart;

	@iOSFindBy(accessibility = "play_pause_button")
	public MobileElement playPauseButton;

	@iOSFindBy(accessibility = "finish_early")
	public MobileElement finishEarlyTwo;

	@iOSFindBy(accessibility = "finish_meditation")
	public MobileElement finishMeditation;

	@iOSFindBy(accessibility = "dont_log")
	public MobileElement dontLog;

	@iOSFindBy(accessibility = "done_button")
	public MobileElement doneButton;

	// @iOSFindBy(accessibility = "bar_button_close")
	@iOSFindBy(xpath = "//*[@name='bar_button_close']")
	public MobileElement barButtonClose;

	@iOSFindBy(accessibility = "close button")
	public MobileElement timerCloseButton;

	@iOSFindBy(accessibility = "+ Add bell")
	public MobileElement addbell;

	
	@iOSFindBy(accessibility = "TIMER")
	public MobileElement timerTitle;
	
	
	@iOSFindBy(accessibility = "PRESETS")
	public MobileElement timerPresets;
	
	@iOSFindBy(accessibility = "Save")
	public MobileElement ambientSoundSave;
	
//	@iOSFindBy(accessibility = "Interval bells")
//	public MobileElement intervalbells;
//	

	@iOSFindBy(xpath ="//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[9]/XCUIElementTypeOther/XCUIElementTypeOther")  
    public MobileElement ambientSoundImg;


 
	@iOSFindBy(xpath = "/XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")
	public MobileElement peopleImgOne;
	//
	@iOSFindBy(accessibility = "com.spotlightsix.zentimerlite2:id/timer_help")
	public MobileElement timerHelp;

	@iOSFindBy(xpath = "//android.widget.TextView[@text='TIMER']")
	public MobileElement timerLable;

	@iOSFindBy(accessibility = "Back")
	public MobileElement backButton;

	
	@iOSFindBy(accessibility = "Meditation")
	public MobileElement meditation;

	@iOSFindBy(accessibility = "duration infinite button")
	public MobileElement durationInfiniteButton;
	
	@iOSFindBy(xpath = "//android.widget.TextView[@text='Starting bell']")
	public MobileElement timerBell;

	@iOSFindBy(accessibility = "com.spotlightsix.zentimerlite2:id/icon")
	public MobileElement timerIcon;

	@iOSFindBy(accessibility = "com.spotlightsix.zentimerlite2:id/configuration_representation")
	public MobileElement timerConfig;

	@iOSFindBy(accessibility = "com.spotlightsix.zentimerlite2:id/tab_timer")
	public MobileElement timerTab;

	@iOSFindBy(accessibility = "helen2002 meditated for 1 min with the Timer")
	public MobileElement homeMeditaionMsglong;

	
//	@iOSFindBy(xpath = "//*[contains(@label, 'helen2002]")
//	@iOSFindBy(xpath ="//*[@label='helen2002']")
//	@iOSFindBy(xpath ="//*[@value='insight://users/Y5c1j6d4M2R2N7r5j7G1G7H6R6d1H8N1U9J1L9R1R0g2v5H7']")
	
// @iOSFindBy(accessibility = "helen2002")
	
//	@iOSFindBy(xpath ="//*[@name='helenitqa']")
//	public MobileElement homeMeditaionMsg;
	

//	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Do what you love\"]")
	
						//XCUIElementTypeLink[@name="helen2002"]
	//XCUIElementTypeStaticText[@name="Do what you love"]
//	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"引導禅修\"]/XCUIElementTypeButton[@name=\"See all\"]")
	 @iOSFindBy(accessibility = "Do what you love")
	public MobileElement homeMeditaionMsg;
	
	
	
	public void clickTimerBtn() {
		timerBtn.click();
	}
	
	public void clickEndingbell() {
		endingbell.click();
	}
	
	public void clickIntervalbells() {
		intervalbells.click();
	}
	public void clickDuration() {
		duration.click();
	}
	
	
	public void clickTimerStart() {
		timerStart.click();
	}
	public void clickTimerTitle() {
		timerTitle.click();
	}
	
	public void clickBackButton() {
		backButton.click();
	}
	
	
	public void clickTimerPause() {
		pauseBell.click();
	}

	public void clickBarButtonClose() {
		barButtonClose.click();
	}

	public void clickFinishEarly() {
		finishEarly.click();
	}

	public void clickDone() {
		done.click();
	}

	public void clickPlayPauseButton() {
		playPauseButton.click();
	}

	public void clickFinishEarlyTwo() {
		finishEarlyTwo.click();
	}

	public void clickFinishMeditation() {
		finishMeditation.click();
	}

	public void clickDontLog() {
		dontLog.click();
	}

	public void clickDoneButton() {
		doneButton.click();
	}

	public void clickTimerCloseButton() {
		timerCloseButton.click();
	}
	
	public void clickAmbientSound() {
		ambientSound.click();
	}

	public void clickAmbientSoundImg() {
		ambientSoundImg.click();
	}
	public void clickAmbientSoundSave() {
		ambientSoundSave.click();
	}
	public void clickAddbell() {
		addbell.click();
	}
	public void clickTimerPresets() {
		timerPresets.click();
	}
	
 
	public boolean verifyTimerhelp() {
		if (timerHelp.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyTimerLable() {
		if (timerLable.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean existTimerPresets() {
		if (timerPresets.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyTimerBell() {
		if (timerBell.isDisplayed())
			return true;
		else
			return false;

	}

	public boolean verifyTimerIcon() {
		if (timerIcon.isDisplayed())
			return true;
		else
			return false;

	}

	public boolean verifyTimerConfig() {
		if (timerConfig.isDisplayed())
			return true;
		else
			return false;
	}

	// public void selectImageThree() {
	// ambientImageThree.click();
	// }

	public void waitElemetPresent(MobileElement element, int timeoutSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutSeconds);

		wait.until(ExpectedConditions.invisibilityOf(element));

	}
}
