package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LibraryItemsPage extends BasePage {

	private AndroidDriver<AndroidElement> driver;

	public LibraryItemsPage(AppiumDriver driver) {
		super(driver);
	}

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/it_ui_menu_item_filter")
	private MobileElement filterBtn;

}
