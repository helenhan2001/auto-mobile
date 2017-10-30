package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SecondLanguagePage extends BasePage {

	public IOSDriver<IOSElement> driver;

	public SecondLanguagePage(AppiumDriver driver) {
		super(driver);

	}

	@iOSFindBy(accessibility = "English")
	public MobileElement english;

	@iOSFindBy(accessibility = "Deutsch")
	public MobileElement deutsch;

	@iOSFindBy(accessibility = "Meine Lesezeichen")
	public MobileElement myBookmarkForDeutsch;

	@iOSFindBy(accessibility = "Meine Lehrer")
	public MobileElement myTeacherForDeutsch;

	@iOSFindBy(accessibility = "Meine Interessen")
	public MobileElement myInterestForDeutsch;

	@iOSFindBy(accessibility = "Alle anzeigen")
	public MobileElement seeAllForDeutsch;

	@iOSFindBy(accessibility = "Entdecken")
	public MobileElement entdecken;
	@iOSFindBy(accessibility = "普通話")
	public MobileElement chinese;

	@iOSFindBy(accessibility = "中文")
	public MobileElement chineseDisplay;

	@iOSFindBy(accessibility = "language selector button")
	public MobileElement languageSelectorButton;

	@iOSFindBy(accessibility = "探索")
	public MobileElement chineseExplore;
	@iOSFindBy(accessibility = "新增")
	public MobileElement newChinese;

	@iOSFindBy(accessibility = "Dansk")
	public MobileElement dansk;
	@iOSFindBy(accessibility = "Opdage")
	public MobileElement opdage;

	@iOSFindBy(accessibility = "Bogmærker")
	public MobileElement myBookmarkForDansk;

	@iOSFindBy(accessibility = "Lærere")
	public MobileElement myTeacherForDansk;

	@iOSFindBy(accessibility = "Interesser")
	public MobileElement myInterestForDansk;

	@iOSFindBy(accessibility = "Se alt")
	public MobileElement seeAllForDansk;

	@iOSFindBy(accessibility = "Indonesian")
	public MobileElement indonesian;

	@iOSFindBy(accessibility = "Menemukan")
	public MobileElement indonesianExplore;

	@iOSFindBy(accessibility = "pembatas buku saya")
	public MobileElement myBookmarkForIndonesian;

	@iOSFindBy(accessibility = "guru saya")
	public MobileElement myTeacherForIndonesian;

	@iOSFindBy(accessibility = "kesukaan saya")
	public MobileElement myInterestForIndonesian;

	@iOSFindBy(accessibility = "Lihat semua")
	public MobileElement seeAllForIndonesian;

	@iOSFindBy(accessibility = "See all")
	public MobileElement seeAll;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"引導禅修\"]/XCUIElementTypeButton[@name=\"See all\"]")
	public MobileElement seeAllChinese;

	@iOSFindBy(accessibility = "六根觀呼吸")
	public MobileElement chineseLongerGMOne;

	@iOSFindBy(accessibility = "TKDS 2 of 8 師父廣東話禪修開示")
	public MobileElement chineseLongerGMTwo;

	public boolean verifyEnglish() {
		if (english.isDisplayed())
			return true;
		else
			return false;
	}

	// 查看全部
	public boolean existChineseExplore() {
		return chineseExplore.isDisplayed();
	}

	public boolean existDanskExplore() {
		return opdage.isDisplayed();
	}

	public void clickEnglish() {

		english.click();
	}

	public void clickDansk() {

		dansk.click();
	}

	public void clickIndonesian() {

		indonesian.click();
	}

	public void clickDeutsch() {

		deutsch.click();
	}

	public void clickSeeAllChinese() {

		seeAllChinese.click();
	}

	public void clickChinese() {

		chinese.click();
	}

	public void clickSeeAll() {

		seeAll.click();
	}

	public void clickLanguageSelectorButton() {

		languageSelectorButton.click();
	}

	public void clickChineseDisplay() {

		chineseDisplay.click();
	}

	public boolean existEntdecken() {
		return entdecken.isDisplayed();
	}

	public boolean elementExists(MobileElement element) {
		try {
			return element.isEnabled();

		} catch (Exception e) {
			return false;
		}
	}

}
