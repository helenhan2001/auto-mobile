package Pages;

import java.util.List;

import Tests.TestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LibrarySearchPage extends BasePage {

	private AndroidDriver<AndroidElement> driver;

	public LibrarySearchPage(AppiumDriver driver) {
		super(driver);
	}

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/it_ui_fragment_search_edit_text")
	private MobileElement searchEditTextField;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/fad_t1s_ll_placeholder_image")
	private MobileElement searchImage;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Search Anything')]")
	private MobileElement searchAnythingText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, \"Use keywords like teacher's name, audio title, benefit or genre\")]")
	private MobileElement useKeywordsText;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/it_ui_fragment_search_cancel")
	private MobileElement cancelBtn;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/list_item_iv_image")
	private List<MobileElement> meditationImagesList;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Yoga Nidra for Sleep Meditation')]")
	private MobileElement yogaNidraForSleepMeditationText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Guided')]")
	private MobileElement guidedText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Talks')]")
	private MobileElement talksText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Intro to Yoga Nidra')]")
	private MobileElement introToYogaNidraText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Yoga Nidra for Sleep']")
	private MobileElement yogaNidraForSleep;
	
	@AndroidFindBy(className = "android.widget.ImageButton")
	private MobileElement backBtn;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='365 Day Playlist']")
	private MobileElement _365DayPlaylist;
	
	public void searchYogaNidraForSleep() throws InterruptedException {	
		setSearchEditTextField("yoga nidra for sleep");
		clickYogaNidraForSleepText();
		Thread.sleep(3000);
	}
	
	public void click365DayPlaylist() {
		clickElement(_365DayPlaylist);
	}
	
	public void clickBackBtn() {
		clickElement(backBtn);
	}
	
	public void clickYogaNidraForSleepText() {
		clickElement(yogaNidraForSleep);
	}
	
	public void verifyYogaNidraForSleepText() {
		verifyElementIsVisible(yogaNidraForSleep);
	}

	public void verifyIntroToYogaNidraText() {
		verifyElementIsVisible(introToYogaNidraText);
	}
	
	public void verifyTalksText() {
		verifyElementIsVisible(talksText);
	}
	
	public void verifyGuidedText() {
		//hideKeyboard();
		verifyElementIsVisible(guidedText);
	}

	public void clickCancelBtn() {
		clickElement(cancelBtn);
	}
	
	public void verifySearchIconTitleSubTitle() {
		verifyElementIsVisible(searchImage);
		verifyElementIsVisible(searchAnythingText);
		verifyElementIsVisible(useKeywordsText);
	}
	
	public void setSearchEditTextField(String text) {
		setElement(searchEditTextField, text);
	}
	
	public void verifyMeditationImagesListAfterSearch() throws InterruptedException {
		TestBase.navigateBack();
		verifyElementIsVisible(meditationImagesList.get(0));
		verifyElementIsVisible(meditationImagesList.get(1));
		verifyElementIsVisible(meditationImagesList.get(2));
		verifyElementIsVisible(meditationImagesList.get(3));
	}
	
	public void verifyYogaNidraForSleepMeditationText() {
		verifyElementIsVisible(yogaNidraForSleepMeditationText);
	}
	
	public void clickYogaNidraForSleepMeditationText() throws InterruptedException {
		clickElement(yogaNidraForSleepMeditationText);
		Thread.sleep(1000);
	}
}
