package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import io.appium.java_client.pagefactory.HowToUseLocators;
import io.appium.java_client.pagefactory.LocatorGroupStrategy;

import io.appium.java_client.pagefactory.iOSFindBy;

public class NewRegisterUser extends BasePage {

	private IOSDriver<IOSElement> driver;

	public NewRegisterUser(AppiumDriver driver) {
		super(driver);
	}

	@iOSFindBy(accessibility = "Register, It's free")
	private MobileElement registerItisFree;

	@iOSFindBy(xpath = "//*[@value='Full Name']")
	private MobileElement fullName;

	@iOSFindBy(xpath = "//*[@value='Email']")
	private MobileElement email;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSFindBy(xpath = "//*[@value='Password']")
	private MobileElement password;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSFindBy(accessibility = "REGISTER")
	private MobileElement registerButton;

	@HowToUseLocators(iOSAutomation = LocatorGroupStrategy.ALL_POSSIBLE)
	@iOSFindBy(accessibility = "LOGIN")
	private MobileElement homeLogin;

}
