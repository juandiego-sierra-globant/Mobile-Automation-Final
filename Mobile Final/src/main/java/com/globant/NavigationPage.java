package com.globant;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;
import java.net.URL;

public class NavigationPage {
    public static AppiumDriver<MobileElement> appiumDriver;

    public static void setAppiumDriver(AppiumDriver<MobileElement> appiumDriver) {
        NavigationPage.appiumDriver = appiumDriver;
    }

    public void navigationBottomBar() {

            appiumDriver.manage().timeouts().implicitlyWait(30L,TimeUnit.SECONDS);
            MobileElement webviewLabel = appiumDriver.findElementByAccessibilityId("Webview");
            webviewLabel.click();

            appiumDriver.manage().timeouts().implicitlyWait(30L,TimeUnit.SECONDS);
            MobileElement loginLabel = appiumDriver.findElementByAccessibilityId("Login");
            loginLabel.click();

            appiumDriver.manage().timeouts().implicitlyWait(30L,TimeUnit.SECONDS);
            MobileElement formsLabel = appiumDriver.findElementByAccessibilityId("Forms");
            formsLabel.click();

            appiumDriver.manage().timeouts().implicitlyWait(30L,TimeUnit.SECONDS);
            MobileElement swipeLabel = appiumDriver.findElementByAccessibilityId("Swipe");
            swipeLabel.click();

            appiumDriver.manage().timeouts().implicitlyWait(30L,TimeUnit.SECONDS);
            MobileElement dragLabel = appiumDriver.findElementByAccessibilityId("Drag");
            dragLabel.click();

    }

}
