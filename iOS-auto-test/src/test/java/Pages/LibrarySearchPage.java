package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LibrarySearchPage extends BasePage {

	public IOSDriver<IOSElement> driver;

	public LibrarySearchPage(AppiumDriver driver) {
		super(driver);

	}

	@iOSFindBy(accessibility = "Search for meditations, interests or teachers")
	public MobileElement searchBtn;

	// @iOSFindBy(className = "XCUIElementTypeButton")
	// public MobileElement searchTextField;

	@iOSFindBy(accessibility = "Clear text")
	public MobileElement cleartext;

	@iOSFindBy(accessibility = "Cancel")
	public MobileElement cancelSearchBtn;

	@iOSFindBy(accessibility = "Glasses")
	public MobileElement glasses;

	@iOSFindBy(accessibility = "Please make sure your words are spelled correctly or use different keywords")
	public MobileElement searchErrorText;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public MobileElement searchTopResult;
	// Duration filer by mins
	@iOSFindBy(accessibility = "One Minute Meditaion")
	public MobileElement fiveMinsDurationOne;
	@iOSFindBy(accessibility = "Tell Yourself Relax")
	public MobileElement fiveMinsDurationTwo;
	@iOSFindBy(accessibility = "Sleep Meditation")
	public MobileElement tenMinsDurationOne;
	@iOSFindBy(accessibility = "Just for Today")
	public MobileElement tenMinsDurationTwo;
	@iOSFindBy(accessibility = "Morning Meditaio with Music")
	public MobileElement fifteenMinsDurationOne;
	@iOSFindBy(accessibility = "Morning Meditaion")
	public MobileElement fifteenMinsDurationTwo;

	// Same as Filter By Mins. so no need seperate elements
	// @iOSFindBy(accessibility = "Breathing into Sleep")
	// public MobileElement twentyMinsDurationOne;
	// @iOSFindBy(accessibility = "Relax into Sleep Guided Meditation")
	// public MobileElement twentyMinsDurationTwo;
	// @iOSFindBy(accessibility = "Yoga Nidra for Sleep")
	// public MobileElement thirtyMinsDurationOne;
	// @iOSFindBy(accessibility = "Relax & Sleep Well")
	// public MobileElement thirtyMinsDurationTwo;
	// @iOSFindBy(accessibility = "Peaceful Sleep Meditation")
	// public MobileElement thirtyPlusMinsDurationOne;
	// @iOSFindBy(accessibility = "Deep Sleep Guided Meditation")
	// public MobileElement thirtyPlusMinsDurationTwo;
	// @iOSFindBy(accessibility = "Whispering Notes")

	// sleep Filter by Mins

	@iOSFindBy(accessibility = "MOST PLAYED")
	public MobileElement MOSTPlayed;

	// @iOSFindBy(xpath = "//XCUIElementTypeButton[@label=\"MOST PLAYED\"]")
	// public MobileElement MOSTPlayed;

	@iOSFindBy(accessibility = "Duration (long to short)")
	public MobileElement longToShort;

	@iOSFindBy(accessibility = "3X3 Restful Sleep")
	public MobileElement fiveMinsSleepTwo;
	@iOSFindBy(accessibility = "Breath Meditation")
	public MobileElement fiveMinsSleepOne;
	@iOSFindBy(accessibility = "Sleep Meditation")
	public MobileElement tenMinsSleepOne;
	@iOSFindBy(accessibility = "Find Your Inspiration")
	public MobileElement tenMinsSleepTwo;
	@iOSFindBy(accessibility = "Mother Earth")
	public MobileElement fifteenMinsSleepOne;
	@iOSFindBy(accessibility = "Meditating into Sleep")
	public MobileElement fifteenMinsSleepTwo;
	@iOSFindBy(accessibility = "Rain Tonight")
	public MobileElement twentyMinsSleepOne;
	@iOSFindBy(accessibility = "Relax into Deep Sleep")
	public MobileElement twentyMinsSleepTwo;
	@iOSFindBy(accessibility = "Melting into Sleep")
	public MobileElement thirtyMinsSleepOne;
	@iOSFindBy(accessibility = "Deep Relaxation")
	public MobileElement thirtyMinsSleepTwo;
	@iOSFindBy(accessibility = "Clouds of Eternity")
	public MobileElement thirtyPlusMinsSleepOne;
	@iOSFindBy(accessibility = "Relaxing Within")
	public MobileElement thirtyPlusMinsSleepTwo;
	@iOSFindBy(accessibility = "Clouds of Eternity")
	public MobileElement maleOnlyOne;
	@iOSFindBy(accessibility = "Relaxing Within")
	public MobileElement maleOnlyTwo;
	@iOSFindBy(accessibility = "Sleep Meditation: Awaken to a Clean Slate")
	public MobileElement femaleOnlyOne;
	@iOSFindBy(accessibility = "Meditation Music to Set You Free from Grief")
	public MobileElement femaleOnlyTwo;

	@iOSFindBy(accessibility = "Clouds of Eternity")
	public MobileElement withBackMusicOne;
	@iOSFindBy(accessibility = "Relaxing Within")
	public MobileElement withBackMusicTwo;
	@iOSFindBy(accessibility = "Sleepy Time Meditation")
	public MobileElement withoutBackMusicOne;
	@iOSFindBy(accessibility = "Meditation for Deep Sleep")
	public MobileElement withoutBackMusicTwo;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Insight Timer\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public MobileElement searchFirstResults;
	@iOSFindBy(accessibility = "Sleep Now")
	public MobileElement sleepNow;
	// @iOSFindBy(accessibility = "MOST PLAYED")
	// public MobileElement mostPlayed;

	@iOSFindBy(accessibility = " All Files")
	public MobileElement allFiles;

	// Teachers follow and unfollow

	@iOSFindBy(accessibility = "Heather Sundberg")
	public MobileElement teacherName;
	// XCUIElementTypeApplication[@name="Insight
	// Timer"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell

	public void clickTeacherName() {

		teacherName.click();
	}

	public boolean existTeacherName() {
		return teacherName.isDisplayed();
	}

	public void clickSearchBtn() {

		searchBtn.click();
	}

	// public void clickSearchTextField() {
	//
	// searchTextField.click();
	// }

	public void clickCleartext() {

		cleartext.click();
	}

	public void clicktTenMinsSleepOne() {

		tenMinsSleepOne.click();
	}

	public void clickMOSTPlayed() {
		MOSTPlayed.click();
	}

	public void clickMOSTPlayedTwo() {

		TouchAction drag = new TouchAction(driver);
		drag.press(MOSTPlayed);

	}

	public void clickLongToShort() {

		longToShort.click();
	}

	public void clickCancelSearchBtn() {

		cancelSearchBtn.click();
	}

	public boolean existSearchErrorText() {
		return searchErrorText.isDisplayed();
	}

	public boolean existGlasses() {
		return glasses.isDisplayed();
	}

	public void clickSearchTopResult() {

		searchTopResult.click();
	}

	// public void fillSearchTextField(String string) {
	// searchTextField.sendKeys(string);
	// }
	// Duration methods

	public boolean existFiveMinsDurationOne() {
		return fiveMinsDurationOne.isDisplayed();
	}

	public boolean existFiveMinsDurationTwo() {
		return fiveMinsDurationTwo.isDisplayed();
	}

	public boolean existTenMinsDurationOne() {
		return tenMinsDurationOne.isDisplayed();
	}

	public boolean existTenMinsDurationTwo() {
		return tenMinsDurationTwo.isDisplayed();
	}

	public boolean existFifteenMinsDurationOne() {
		return fifteenMinsDurationOne.isDisplayed();
	}

	public boolean existFifteenMinsDurationTwo() {
		return fifteenMinsDurationTwo.isDisplayed();
	}

	// sleep methods
	public boolean existFiveMinsSleepOne() {
		return fiveMinsSleepOne.isDisplayed();
	}

	public boolean existFiveMinsSleepTwo() {
		return fiveMinsSleepTwo.isDisplayed();
	}

	public boolean existTenMinsSleepOne() {
		return tenMinsSleepOne.isDisplayed();
	}

	public boolean existTenMinsSleepTwo() {
		return tenMinsSleepTwo.isDisplayed();
	}

	public boolean existFifteenMinsSleepOne() {
		return fifteenMinsSleepOne.isDisplayed();
	}

	public boolean existFifteenMinsSleepTwo() {
		return fifteenMinsSleepTwo.isDisplayed();
	}

	public boolean existTwentyMinsSleepOne() {
		return twentyMinsSleepOne.isDisplayed();
	}

	public boolean existTwentyMinsSleepTwo() {
		return twentyMinsSleepTwo.isDisplayed();
	}

	public boolean existThrityMinsSleepOne() {
		return thirtyMinsSleepOne.isDisplayed();
	}

	public boolean existThrityMinsSleepTwo() {
		return thirtyMinsSleepTwo.isDisplayed();
	}

	public boolean existThrityPlusMinsSleepOne() {
		return thirtyPlusMinsSleepOne.isDisplayed();
	}

	public boolean existThrityPlusMinsSleepTwo() {
		return thirtyPlusMinsSleepTwo.isDisplayed();
	}

	public boolean existMaleOnlyOne() {
		return maleOnlyOne.isDisplayed();
	}

	public boolean existMaleOnlyTwo() {
		return maleOnlyTwo.isDisplayed();
	}

	public boolean existFemaleOnlyOne() {
		return femaleOnlyOne.isDisplayed();
	}

	public boolean existFemaleOnlyTwo() {
		return femaleOnlyTwo.isDisplayed();
	}

	public boolean existWithBackMusicOne() {
		return withBackMusicOne.isDisplayed();
	}

	public boolean existWithBackMusicTwo() {
		return withBackMusicTwo.isDisplayed();
	}

	public boolean existWithoutBackMusicOne() {
		return withoutBackMusicOne.isDisplayed();
	}

	public boolean existWithoutBackMusicTwo() {
		return withoutBackMusicTwo.isDisplayed();
	}

	//
	// public boolean isMusicExist() {
	// return elementExists(music);
	// }
	//
	// public boolean isOriginsTextExist() {
	// return elementExists(originsText);
	// }
	//
	// public boolean isSciencesExist() {
	// return elementExists(sciences);
	// }
	//
	// public boolean isPlayFollowExist() {
	// return elementExists(playFollow);
	// }

	public boolean elementExists(MobileElement element) {
		try {
			return element.isEnabled();

		} catch (Exception e) {
			return false;
		}
	}

	// public void waitElemet(MobileElement element){
	// WebDriverWait wait = new WebDriverWait(driver,30/* timeout in seconds
	// */);
	// try {
	// wait.until(new ExpectedCondition<WebElement>() {
	// @Override
	// public WebElement apply(WebDriver driver) {
	//
	// }
	//
}
