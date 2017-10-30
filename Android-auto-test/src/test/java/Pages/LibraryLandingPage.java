package Pages;

import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LibraryLandingPage extends BasePage {

	private AndroidDriver<AndroidElement> driver;

	public LibraryLandingPage(AppiumDriver driver) {
		super(driver);
	}

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/explore_tv_search")
	private MobileElement searchFieldForMeditations;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Library')]")
	private MobileElement libraryText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Explore')]")
	private MobileElement exploreText;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'My Library')]")
	private MobileElement myLibraryText;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/explore_image_button_language")
	private MobileElement languageButton;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Deutsch')]")
	private MobileElement german;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Italiano')]")
	private MobileElement italian;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Français')]")
	private MobileElement french;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, '普通話')]")
	private MobileElement mandarin;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Español')]")
	private MobileElement spanish;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/common_section_title_tv_title")
	private MobileElement title;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/common_section_title_tv_description")
	private MobileElement description;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/group_carousel_item_image")
	private List<MobileElement> libraryCarouselImagesList;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/library_carousel_item_iv_image")
	private List<MobileElement> libraryCarouselItemIvImagesList;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Recovery & Healing')]")
	private MobileElement recoveryAndHealingText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Sleep')]")
	private MobileElement sleepText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Grounded & Happy')]")
	private MobileElement groundedAndHappyText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Spiritual')]")
	private MobileElement spiritualText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Stress & Anxiety')]")
	private MobileElement stressAndAnxietyText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Creativity & Performance')]")
	private MobileElement creativityAndPeformanceText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Relationships')]")
	private MobileElement relashionshipsText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Kids & Teens')]")
	private MobileElement kidsAndTeens;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Lesson 2: Practice Mindfulness & Brainwave States')]")
	private MobileElement lesson2PracticeMindfulnessAndBrainwaveStates;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/common_section_title_tv_uri_text")
	private MobileElement seeAllTextElement;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Popular')]")
	private MobileElement popularText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Mindfulness for Releasing Anxiety')]")
	private MobileElement mindfulnessForReleasingAnxiety;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Music')]")
	private MobileElement musicText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Chanting & Mantras')]")
	private MobileElement chantingAndMantras;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Instrumental Music')]")
	private MobileElement instrumentalMusic;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Ambient Music')]")
	private MobileElement ambientMusic;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Sound Healing')]")
	private MobileElement soundHealing;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Nature Sounds')]")
	private MobileElement natureSounds;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Binaural Beats')]")
	private MobileElement binauralBeats;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Sacred Music')]")
	private MobileElement sacredMusic;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Solfeggio Frequencies')]")
	private MobileElement solfeggioFrequencies;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Rhythmic Music')]")
	private MobileElement rhythmicMusic;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Classical Music')]")
	private MobileElement classicalMusic;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Drumming')]")
	private MobileElement drumming;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Gospel & Choir')]")
	private MobileElement gospelAndChoir;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Harmonics')]")
	private MobileElement harmonics;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/library_interest_list_with_icons_item_image")
	private List<MobileElement> libraryInterestListWithIconsItemImageList;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Practices')]")
	private MobileElement practicesText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'There are hundreds "
			+ "of different meditation practices. Listen to some different techniques to "
			+ "find the ones that best suit you.')]")
	private MobileElement practicesDescriptionText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Mindfulness')]")
	private MobileElement mindfulness;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Simply noticing feelings "
			+ "and thoughts as they come and go.')]")
	private MobileElement mindfulnessDescriptionText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Visualization')]")
	private MobileElement visualization;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Imaging a specific experience or "
			+ "cultivating feelings such as gratitude and forgiveness.')]")
	private MobileElement visualizationDescriptionText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Gentle Repetition')]")
	private MobileElement gentleRepetition;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Repeating a sound or sequence of "
			+ "words to clear the mind and go beyond thought.')]")
	private MobileElement gentleRepetitionDescriptionText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Movement')]")
	private MobileElement movement;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Energize the body and mind through "
			+ "calm purposeful breathing or movement.')]")
	private MobileElement movementDescriptionText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Sound')]")
	private MobileElement sound;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Using sound currents and frequencies "
			+ "to calm brainwaves and alter our mindset.')]")
	private MobileElement soundDescriptionText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Concentration')]")
	private MobileElement concentration;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Focusing on something physical and material, "
			+ "such as your breath or body, to distract the mind from thought.')]")
	private MobileElement concentrationDescriptionText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Self-Observation')]")
	private MobileElement selfObservation;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Through reflective questions peel back "
			+ "the layers hiding your essential nature.')]")
	private MobileElement selfObservationDescriptionText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Sciences')]")
	private MobileElement sciences;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Concepts')]")
	private MobileElement concepts;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Traditions')]")
	private MobileElement traditions;
	
	//groups items
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Secular Mindfulness')]")
	private MobileElement secularMindfulness;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Consciousness')]")
	private MobileElement consciousness;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Buddhism')]")
	private MobileElement buddhism;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Spirituality')]")
	private MobileElement spirituality;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Psychology')]")
	private MobileElement psychology;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Life Force')]")
	private MobileElement lifeForce;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Yogic Tradition')]")
	private MobileElement yogicTradition;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Neuroscience')]")
	private MobileElement neuroscience;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Natural Environment')]")
	private MobileElement naturalEnvironment;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Alternative Medicine')]")
	private MobileElement alternativeMedicine;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Non-duality')]")
	private MobileElement nonDuality;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Mysticism')]")
	private MobileElement mysticism;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Metaphysics')]")
	private MobileElement metaphysics;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Science & Medicine')]")
	private MobileElement scienceAndMedicine;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Hinduism')]")
	private MobileElement hinduism;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Vedic')]")
	private MobileElement vedic;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Bhakti Movement')]")
	private MobileElement bhaktiMovement;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Christianity')]")
	private MobileElement christianity;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Taoism')]")
	private MobileElement taoism;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Shamanism')]")
	private MobileElement shamanism;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Sikhism')]")
	private MobileElement sikhism;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Sufism')]")
	private MobileElement sufism;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Kabbalah')]")
	private MobileElement kabbalah;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Sport Science')]")
	private MobileElement sportScience;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Judaism')]")
	private MobileElement judaism;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Islam')]")
	private MobileElement islam;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, \"Bahï¿½'ï¿½ Faith\")]")
	private MobileElement bahaiFaith;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Shinto')]")
	private MobileElement shinto;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Confucianism')]")
	private MobileElement confucianism;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Jainism')]")
	private MobileElement jainism;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Perennialism')]")
	private MobileElement perennialism;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Teachers')]")
	private MobileElement teachersText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Talks')]")
	private MobileElement talksText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Teachers and musicians are "
			+ "the heart and soul of our community. Each one is unique.')]")
	private MobileElement teachersDescriptionText;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/library_publisher_carousel_item_iv_image")
	private List<MobileElement> libraryPublisherCarouselItemIvImageList;
	
	//teachers
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Emily Perry')]")
	private MobileElement emilyPerry;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Sheila')]")
	private MobileElement sheila;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Sergio Dielop')]")
	private MobileElement sergioDielop;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Judith Duval')]")
	private MobileElement judithDuval;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Aimï¿½e Granados')]")
	private MobileElement aimeeGranados;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Richard Scott')]")
	private MobileElement richardScott;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Ihsan Alexander')]")
	private MobileElement ihsanAlexander;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Carrie Bravick')]")
	private MobileElement carrieBravick;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Mark Fleming')]")
	private MobileElement markFleming;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Caroline Stewart')]")
	private MobileElement carolineStewart;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Dr. Tony Willcox')]")
	private MobileElement drTonyWillcox;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Marcin Zefir Wierzbicki')]")
	private MobileElement marcinZefir;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Lynette Suchar')]")
	private MobileElement lynetteSuchar;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Nicola Garcia')]")
	private MobileElement nicolaGarcia;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Patty Hlava')]")
	private MobileElement pattyHlava;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Venerable')]")
	private MobileElement venerable;
	
	//teacher elements end
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/page_title")
	private MobileElement libraryElement;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'My Bookmarks')]")
	private MobileElement myBookmarks;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'My Teachers')]")
	private MobileElement myTeachers;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'My Interests')]")
	private MobileElement myInterests;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'For you')]")
	private MobileElement forYouText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Duration')]")
	private MobileElement durationText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Origins')]")
	private MobileElement originsText;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/common_section_title_iv_user_image")
	private MobileElement userImage;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/common_section_title_iv_user_image")
	private MobileElement forYouCarouselElement;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'hand picked a few things to get you started.')]")
	private MobileElement forBeginnersDescriptionText;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/library_carousel_recyclerview")
	private MobileElement forBeginnersCarouselElement;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'For beginners')]")
	private MobileElement forBeginnersText;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/alertTitle")
	private MobileElement alertTitle;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text, 'GOT IT')]")
	private MobileElement gotItText;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Get help with ...')]")
	private MobileElement getHelpWithText;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/group_carousel_recylerview")
	private MobileElement getHelpWithCarouselElement;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/collage_list_item_image_view_play")
	private MobileElement playBtn;
	
	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/collage_list_item_tv_title")
	private MobileElement meditationTitle;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, '365 Day playlist')]")
	private MobileElement _365DayPlaylist;
	
	public void click365DayPlaylist() throws InterruptedException {
		clickElement(_365DayPlaylist);
	}
	
	public void clickMeditationTitle() throws InterruptedException {
		clickElement(meditationTitle);
	}
	
	public void clickPlayBtn() throws InterruptedException {
		clickElement(playBtn);
	}
	
	public void verifyExploreText() throws InterruptedException {
		verifyElementIsVisible(exploreText);
	}
	
	public void swipeUpToTalksText() throws InterruptedException {
		swipeUpToElement(teachersText);
	}
	
	public void swipeUpToTeachersText() throws InterruptedException {
		swipeUpToElement(teachersText);
	}
	
	public void swipeUpToOriginsText() throws InterruptedException {
		swipeUpToElement(originsText);
	}
	
	public void swipeUpToPracticesText() throws InterruptedException {
		swipeUpToElement(practicesText);
	}
	
	public void swipeUpToMusicText() throws InterruptedException {
		swipeUpToElement(musicText);
	}
	
	public void swipeUpToDurationText() throws InterruptedException {
		swipeUpToElement(durationText);
	}
	
	public void swipeUpToBeginnersText() throws InterruptedException {
		swipeUpToElement(forBeginnersText);
	}
	
	public void swipeUpToForYouText() throws InterruptedException {	
		swipeUpToElement(forYouText);
	}
	
	public void swipeUpToGetHelpWithText() throws InterruptedException {	
		swipeUpToElement(getHelpWithText);
	}
	
	public void verifyGetHelpWithCarouselElement() {	
		verifyElementIsVisible(getHelpWithCarouselElement);
	}
	
	public void verifyGetHelpWithText() {	
		verifyElementIsVisible(getHelpWithText);
	}
	
	public void verifyLibraryAlertsGotIt() {	
		verifyElementIsVisible(alertTitle);
		verifyElementIsVisible(gotItText);
	}
	
	public void verifyForBeginnersCarouselElement() {	
		verifyElementIsVisible(forBeginnersCarouselElement);
	}
	
	public void verifyForBeginnersDescriptionText() {	
		verifyElementIsVisible(forBeginnersDescriptionText);
	}
	
	public void verifyForYouCarouselElement() {	
		verifyElementIsVisible(forYouCarouselElement);
	}
	
	public void verifyUserImage() {	
		verifyElementIsVisible(userImage);
	}
	
	public void verifyForYouText() {	
		verifyElementIsVisible(forYouText);
	}
	
	public void verifyLibraryElements() {	
		verifyElementIsVisible(myBookmarks);
		verifyElementIsVisible(myTeachers);
		verifyElementIsVisible(myInterests);
	}
	
	public void clickMyBookmarks() {
		clickElement(myBookmarks);
	}
	
	public void clickMyTeachers() {
		clickElement(myTeachers);
	}
	
	public void clickMyInterests() {
		clickElement(myInterests);
	}
	
	public void verifyLibraryTitleElement() {	
		verifyElementIsVisible(libraryElement);
	}
	
	public void verifyVenerable() {	
		verifyElementIsVisible(venerable);
	}
	
	public void verifyEmilyPerry() {	
		verifyElementIsVisible(emilyPerry);
	}
	
	public void verifySheila() {	
		verifyElementIsVisible(sheila);
	}
	
	public void verifySergioDielop() {	
		verifyElementIsVisible(sergioDielop);
	}
	
	public void verifyJudithDuval() {	
		verifyElementIsVisible(judithDuval);
	}
	
	public void verifyAimeeGranados() {	
		verifyElementIsVisible(aimeeGranados);
	}
	
	public void verifyRichardScott() {	
		verifyElementIsVisible(richardScott);
	}
	
	public void verifyIhsanAlexander() {	
		verifyElementIsVisible(ihsanAlexander);
	}
	
	public void verifyCarrieBravick() {	
		verifyElementIsVisible(carrieBravick);
	}
	
	public void verifyMarkFleming() {	
		verifyElementIsVisible(markFleming);
	}
	
	public void verifyCarolineStewart() {	
		verifyElementIsVisible(carolineStewart);
	}
	
	public void verifyDrTonyWillcox() {	
		verifyElementIsVisible(drTonyWillcox);
	}
	
	public void verifyMarcinZefir() {	
		verifyElementIsVisible(marcinZefir);
	}
	
	public void verifyLynetteSuchar() {	
		verifyElementIsVisible(lynetteSuchar);
	}
	
	public void verifyNicolaGarcia() {	
		verifyElementIsVisible(nicolaGarcia);
	}
	
	public void verifyPattyHlava() {	
		verifyElementIsVisible(pattyHlava);
	}
	
	public void swipeToLeftFromTeachersCarousel(int index) throws InterruptedException {
		swipeToLeftUsingMobileArrayElement(libraryPublisherCarouselItemIvImageList, index, 1000);
	}
	
	public void verifyTeachersDescriptionText() {	
		verifyElementIsVisible(teachersDescriptionText);
	}
	
	public void verifyTeachers() {	
		verifyElementIsVisible(teachersText);
	}
	
	public void verifySecularMindfulness() {	
		verifyElementIsVisible(secularMindfulness);
	}

	public void verifyConsciousness() {	
		verifyElementIsVisible(consciousness);
	}
	
	public void verifyBuddhism() {	
		verifyElementIsVisible(buddhism);
	}
	
	public void verifySpirituality() {	
		verifyElementIsVisible(spirituality);
	}
	
	public void verifyPsychology() {	
		verifyElementIsVisible(psychology);
	}
	
	public void verifyLifeForce() {	
		verifyElementIsVisible(lifeForce);
	}
	
	public void verifyYogicTradition() {	
		verifyElementIsVisible(yogicTradition);
	}
	
	public void verifyNeuroscience() {	
		verifyElementIsVisible(neuroscience);
	}
	
	public void verifyNaturalEnvironment() {	
		verifyElementIsVisible(naturalEnvironment);
	}
	
	public void verifyAlternativeMedicine() {	
		verifyElementIsVisible(alternativeMedicine);
	}
	
	public void verifyNonDuality() {	
		verifyElementIsVisible(nonDuality);
	}
	
	public void verifyMysticism() {	
		verifyElementIsVisible(mysticism);
	}
	
	public void verifyMetaphysics() {	
		verifyElementIsVisible(metaphysics);
	}
	
	public void verifyScienceAndMedicine() {	
		verifyElementIsVisible(scienceAndMedicine);
	}
	
	public void verifyHinduism() {	
		verifyElementIsVisible(hinduism);
	}
	
	public void verifyVedic() {	
		verifyElementIsVisible(vedic);
	}
	
	public void verifyBhaktiMovement() {	
		verifyElementIsVisible(bhaktiMovement);
	}
	
	public void verifyChristianity() {	
		verifyElementIsVisible(christianity);
	}
	
	public void verifyTaoism() {	
		verifyElementIsVisible(taoism);
	}
	
	public void verifyShamanism() {	
		verifyElementIsVisible(shamanism);
	}
	
	public void verifySikhism() {	
		verifyElementIsVisible(sikhism);
	}
	
	public void verifySufism() {	
		verifyElementIsVisible(sufism);
	}
	
	public void verifyKabbalah() {	
		verifyElementIsVisible(kabbalah);
	}
	
	public void verifySportScience() {	
		verifyElementIsVisible(sportScience);
	}
	
	public void verifyJudaism() {	
		verifyElementIsVisible(judaism);
	}
	
	public void verifyIslam() {	
		verifyElementIsVisible(islam);
	}
	
	public void verifyBahaiFaith() {	
		verifyElementIsVisible(bahaiFaith);
	}
	
	public void verifyShinto() {	
		verifyElementIsVisible(shinto);
	}
	
	public void verifyConfucianism() {	
		verifyElementIsVisible(confucianism);
	}
	
	public void verifyJainism() {	
		verifyElementIsVisible(jainism);
	}
	
	public void verifyPerennialism() {	
		verifyElementIsVisible(perennialism);
	}
	
	public void verifySciences() {	
		verifyElementIsVisible(sciences);
	}
	
	public void verifyConcepts() {	
		verifyElementIsVisible(concepts);
	}
	
	public void verifyTraditions() {	
		verifyElementIsVisible(traditions);
	}
	
	public void verifyVisualization() {	
		verifyElementIsVisible(visualization);
	}
	
	public void verifyVisualizationDescriptionText() {	
		verifyElementIsVisible(visualizationDescriptionText);
	}
	
	public void verifySelfObservation() {	
		verifyElementIsVisible(selfObservation);
	}
	
	public void verifySelfObservationDescriptionText() {	
		verifyElementIsVisible(selfObservationDescriptionText);
	}
	
	public void verifyConcentration() {	
		verifyElementIsVisible(concentration);
	}
	
	public void verifyConcentrationDescriptionText() {	
		verifyElementIsVisible(concentrationDescriptionText);
	}
	
	public void verifySound() {	
		verifyElementIsVisible(sound);
	}
	
	public void verifySoundDescriptionText() {	
		verifyElementIsVisible(soundDescriptionText);
	}
	
	public void verifyMovement() {	
		verifyElementIsVisible(movement);
	}
	
	public void verifyMovementDescriptionText() {	
		verifyElementIsVisible(movementDescriptionText);
	}
	
	public void verifyGentleRepetition() {	
		verifyElementIsVisible(gentleRepetition);
	}
	
	public void verifyGentleRepetitionDescriptionText() {	
		verifyElementIsVisible(gentleRepetitionDescriptionText);
	}
	
	public void verifyMindfulness() {	
		verifyElementIsVisible(mindfulness);
	}
	
	public void verifyMindfulnessDescriptionText() {	
		verifyElementIsVisible(mindfulnessDescriptionText);
	}
	
	public void libraryInterestListWithIconsItemImage(int index) {
		clickElement(libraryInterestListWithIconsItemImageList.get(index));
	}
	
	public void verifyPracticesDescriptionText() {	
		verifyElementIsVisible(practicesDescriptionText);
	}
	
	public void verifyPracticesText() {	
		verifyElementIsVisible(practicesText);
	}
	
	public void verifyHarmonicsText() {	
		verifyElementIsVisible(harmonics);
	}
	
	public void verifyGospelAndChoirText() {	
		verifyElementIsVisible(gospelAndChoir);
	}
	
	public void verifyDrummingText() {	
		verifyElementIsVisible(drumming);
	}
	
	public void verifyClassicalMusicText() {	
		verifyElementIsVisible(classicalMusic);
	}
	
	public void verifyRhythmicMusicText() {	
		verifyElementIsVisible(rhythmicMusic);
	}
	
	public void verifySolfeggioFrequenciesText() {	
		verifyElementIsVisible(solfeggioFrequencies);
	}
	
	public void verifySacredMusicText() {	
		verifyElementIsVisible(sacredMusic);
	}
	
	public void verifyBinauralBeatsText() {	
		verifyElementIsVisible(binauralBeats);
	}
	
	public void verifyNatureSoundsText() {	
		verifyElementIsVisible(natureSounds);
	}
	
	public void verifySoundHealingText() {	
		verifyElementIsVisible(soundHealing);
	}
	
	public void verifyAmbientMusicText() {	
		verifyElementIsVisible(ambientMusic);
	}
	
	public void verifyInstrumentalMusicText() {	
		verifyElementIsVisible(instrumentalMusic);
	}
	
	public void verifyChantingAndMantrasText() {	
		verifyElementIsVisible(chantingAndMantras);
	}


	public void verifyMusicText() {	
		verifyElementIsVisible(musicText);
	}
	
	public void verifyMindfulnessForReleasingAnxiety() {	
		verifyElementIsVisible(mindfulnessForReleasingAnxiety);
	}
	
	public void verifyPopularText() {	
		verifyElementIsVisible(popularText);
	}
	
	public void verifyLesson2PracticeMindfulnessAndBrainwaveStates() {	
		verifyElementIsVisible(lesson2PracticeMindfulnessAndBrainwaveStates);
	}
	
	public void verifySeeAllElement() {	
		verifyElementIsVisible(seeAllTextElement);
	}

	public void swipeToLeftFromCarouselIvImage(int index) throws InterruptedException {
		swipeToLeftUsingMobileArrayElement(libraryCarouselItemIvImagesList, index, 1000);
	}
	
	public void swipeToLeftFromCarouselImage(int index) throws InterruptedException {
		swipeToLeftUsingMobileArrayElement(libraryCarouselImagesList, index, 1000);
	}
	
	public void verifyRecoveryAndHealingText() {	
		verifyElementIsVisible(recoveryAndHealingText);
	}
	
	public void verifySleepText() {	
		verifyElementIsVisible(sleepText);
	}
	
	public void verifyGroundedAndHappyText() {	
		verifyElementIsVisible(groundedAndHappyText);
	}
	
	public void verifySpiritualText() {	
		verifyElementIsVisible(spiritualText);
	}
	
	public void verifyStressAndAnxietyText() {	
		verifyElementIsVisible(stressAndAnxietyText);
	}
	
	public void verifyCreativityAndPeformanceText() {	
		verifyElementIsVisible(creativityAndPeformanceText);
	}
	
	public void verifyRelashionshipsText() {	
		verifyElementIsVisible(relashionshipsText);
	}
	
	public void verifyKidsAndTeens() {	
		verifyElementIsVisible(kidsAndTeens);
	}
	
	public void verifyTitle() {	
		verifyElementIsVisible(title);
	}
	
	public void verifyDescription() {	
		verifyElementIsVisible(description);
	}
	
	public void clickGerman() {
		clickElement(german);
	}
	
	public void clickItalian() {
		clickElement(italian);
	}
	
	public void clickFrench() {
		clickElement(french);
	}
	
	public void clickMandarin() {
		clickElement(mandarin);
	}
	
	public void clickSpanish() {
		clickElement(spanish);
	}
	
	public void verifyLanguageButton() {
		verifyElementIsVisible(languageButton);
	}
	
	public void clickLanguageButton() {
		verifyLanguageButton();
		clickElement(languageButton);
	}
	
	public void verifyLibraryText() {
		verifyElementIsVisible(libraryText);
	}
	
	public void verifySearchFieldForMeditationsField() {
		verifyElementIsVisible(searchFieldForMeditations);
	}
	
	public void clickSearchFieldForMeditations() {
		clickElement(searchFieldForMeditations);
	}
	
	public void swipeUpToElement(MobileElement element) throws InterruptedException{
		for (int i=1; i<30; i++) {
			swipeToUpSmall();
			Thread.sleep(200);
			if (elementExists(element)) {
				Thread.sleep(100);
				break;
			}
		}
	}
}
