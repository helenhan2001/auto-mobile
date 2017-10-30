package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LibraryMeditationPage extends BasePage {

	private AndroidDriver<AndroidElement> driver;

	public LibraryMeditationPage(AppiumDriver driver) {
		super(driver);
	}

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/image_view_play")
	private MobileElement playImage;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/image_view_guided")
	private MobileElement imageViewGuided;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/textview_teacher_name")
	private MobileElement teacherName;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/textview_title")
	private MobileElement title;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/view_ratings")
	private MobileElement ratings;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/textview_duration")
	private MobileElement duration;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/textview_plays")
	private MobileElement plays;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/textview_guided_play_tag")
	private MobileElement guidedPlayTag;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/textview_description")
	private MobileElement description;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/it_ui_menu_item_more")
	private MobileElement dots;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/it_ui_menu_item_share")
	private MobileElement shareBtn;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/it_ui_menu_item_publisher_share")
	private MobileElement shareBtnPublisher;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/it_ui_menu_item_bookmark")
	private MobileElement bookmarkBtn;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Share with']")
	private MobileElement shareWith;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Friends']")
	private MobileElement friends;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Groups']")
	private MobileElement groups;
	
	//might need to change to another element name
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Listen Privately']")
	private MobileElement listenPrivately;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='SLEEP NOW']")
	private MobileElement sleepNow;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='VITAL ENERGY']")
	private MobileElement vitalEnergy;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='YOGA NIDRA']")
	private MobileElement yogaNidra;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='BREATHING MEDITATION']")
	private MobileElement breathingMeditation;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='BODY SCAN']")
	private MobileElement bodyScan;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='YOGIC TRADITION']")
	private MobileElement yogicTradition;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='NON-DUALITY']")
	private MobileElement nonDuality;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='CONSCIOUSNESS']")
	private MobileElement consciousness;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='JENNIFER PIERCY']")
	private MobileElement jenniferPiercy;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/common_options_list_item_tile")
	private MobileElement optionsItemTitle;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/common_options_list_item_description")
	private MobileElement optionsItemDescription;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/common_options_list_item_checkbox")
	private MobileElement checkBox;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Facebook']")
	private MobileElement facebook;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Messenger']")
	private MobileElement messenger;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='WhatsApp']")
	private MobileElement whatsApp;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Email']")
	private MobileElement email;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Copy link']")
	private MobileElement copyLink;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/view_tags")
	private MobileElement meditationTagsElement;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/collage_list_item_image_view_play")
	private MobileElement playBtn;
	
	public void clickPlayBtn() throws InterruptedException {
		clickElement(playBtn);
	}
	
	public void verifyMeditationTagsElement() {
		verifyElementIsVisible(meditationTagsElement);
	}
	
	public void clickFacebook() {
		clickElement(facebook);
	}

	public void clickMessenger() {
		clickElement(messenger);
	}
	
	public void clickWhatsApp() {
		clickElement(whatsApp);
	}
	
	public void clickEmail() {
		clickElement(email);
	}
	
	public void clickCopyLink() {
		clickElement(copyLink);
	}
	
	public void clickCheckBox() {
		clickElement(checkBox);
	}
	
	public void verifyJenniferPiercy() {
		verifyElementIsVisible(jenniferPiercy);
	}
	
	public void verifyYogaNidraForSleepMeditationTags() {
		verifySleepNow();
		verifyVitalEnergy();
		verifyYogaNidra();
		verifyBreathingMeditation();
		verifyBodyScan();
		verifyYogicTradition();
		verifyNonDuality();
		verifyConsciousness();
	}
	
	public void verifySleepNow() {
		verifyElementIsVisible(sleepNow);
	}
	
	public void verifyVitalEnergy() {
		verifyElementIsVisible(vitalEnergy);
	}
	
	public void verifyYogaNidra() {
		verifyElementIsVisible(yogaNidra);
	}
	
	public void verifyBreathingMeditation() {
		verifyElementIsVisible(breathingMeditation);
	}
	
	public void verifyBodyScan() {
		verifyElementIsVisible(bodyScan);
	}
	
	public void verifyYogicTradition() {
		verifyElementIsVisible(yogicTradition);
	}
	
	public void verifyNonDuality() {
		verifyElementIsVisible(nonDuality);
	}
	
	public void verifyConsciousness() {
		verifyElementIsVisible(consciousness);
	}
	
	public void verifyListenPrivately() {
		verifyElementIsVisible(optionsItemTitle);
		verifyElementIsVisible(optionsItemDescription);
		verifyElementIsVisible(listenPrivately);
	}
	
	public void verifyShareElements() {
		verifyShareWith();
		verifyFriends();
		verifyGroups();
		verifyFacebook();
		verifyMessenger();
		verifyWhatsApp();
	}
	
	public void verifyFriends() {
		verifyElementIsVisible(friends);
	}
	
	public void verifyGroups() {
		verifyElementIsVisible(groups);
	}
	
	public void verifyFacebook() {
		verifyElementIsVisible(facebook);
	}
	
	public void verifyMessenger() {
		verifyElementIsVisible(messenger);
	}
	
	public void verifyWhatsApp() {
		verifyElementIsVisible(whatsApp);
	}
	
	public void verifyShareWith() {
		verifyElementIsVisible(shareWith);
	}
	
	public void clickDots() {
		clickElement(dots);
	}
	
	public void clickShareBtn() throws InterruptedException {
		Thread.sleep(2000);
		swipeToUp();
		Thread.sleep(2000);
		clickElement(shareBtn);
	}
	
	public void clickShareBtnPublisher() throws InterruptedException {
		clickElement(shareBtnPublisher);
	}
	
	public void clickBookmarkBtn() {
		clickElement(bookmarkBtn);
	}
	
	public void verifyMeditationPage() {
		verifyTeacherName();
		verifyTitle();
		verifyRatings();
		verifyDuration();
		verifyPlays();
		verifyGuidedPlayTag();
		verifyPlayImage();
		verifyDescription();
	}
	
	public void verifyDescription() {
		verifyElementIsVisible(description);
	}
	
	public void clickPlayImage() {
		clickElement(playImage);
	}
	
	public void verifyPlayImage() {
		verifyElementIsVisible(playImage);
	}
	
	public void verifyImageViewGuided() {
		verifyElementIsVisible(imageViewGuided);
	}
	
	public void clickMeditationImageBig() {
		clickElement(imageViewGuided);
	}
	
	public void verifyGuidedPlayTag() {
		verifyElementIsVisible(guidedPlayTag);
	}
	
	public void verifyPlays() {
		verifyElementIsVisible(plays);
	}
	
	public void verifyDuration() {
		verifyElementIsVisible(duration);
	}
	
	public void verifyRatings() {
		verifyElementIsVisible(ratings);
	}
	
	public void verifyTitle() {
		verifyElementIsVisible(title);
	}
	
	public void verifyTeacherName() {
		verifyElementIsVisible(teacherName);
	}
}
