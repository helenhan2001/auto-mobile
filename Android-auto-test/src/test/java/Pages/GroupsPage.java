package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class GroupsPage extends BasePage {

	private AndroidDriver<AndroidElement> driver;

	public GroupsPage(AppiumDriver driver) {
		super(driver);
	}

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/tab_groups")
	private MobileElement tabGroups;
	
	@AndroidFindBy(accessibility = "Community Guidelines")
	private MobileElement communityGuidelines;
	
	@AndroidFindBy(accessibility = "Announcements")
	private MobileElement announcements;

	public void clickTabGroups() {
		clickElement(tabGroups);
	}
	
	public void verifyCommunityGuidelines() {
		verifyElementIsVisible(communityGuidelines);
	}
	
	public void verifyAnnouncements() {
		verifyElementIsVisible(announcements);
	}
}
