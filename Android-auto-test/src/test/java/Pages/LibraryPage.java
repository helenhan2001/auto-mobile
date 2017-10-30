package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LibraryPage extends BasePage {

	private AndroidDriver<AndroidElement> driver;

	public LibraryPage(AppiumDriver driver) {
		super(driver);
	}

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/tab_guided")
	private MobileElement tabGuided;

	public void clickTabGuided() {
		tabGuided.click();
	}
}
